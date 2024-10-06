package net.jimtendo.rockcandymod.item.custom;

import com.google.common.collect.ImmutableMap;
import net.jimtendo.rockcandymod.item.ModArmorMaterials;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Arrays;

import java.util.Map;

public class CustomArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, List<MobEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<MobEffectInstance>>())
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_BATTLE, Arrays.asList(
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 159, 0, false, false, true),
                            new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 159, 0, false, false, true)
                    ))
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_HASTE, Arrays.asList(
                            new MobEffectInstance(MobEffects.ABSORPTION, 159, 0, false, false, true),
                            new MobEffectInstance(MobEffects.DIG_SPEED, 159, 0, false, false, true)
                    ))
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_POWER, Arrays.asList(
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 159, 0, false, false, true),
                            new MobEffectInstance(MobEffects.WATER_BREATHING, 159, 0, false, false, true)
                    ))
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_STEALTH, Arrays.asList(
                            new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 159, 0, false, false, true),
                            new MobEffectInstance(MobEffects.SATURATION, 159, 0, false, false, true)
                    ))
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_SWIFTNESS, Arrays.asList(
                            new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 159, 1, false, false, true)
                    ))
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_ADRENALINE, Arrays.asList(
                            new MobEffectInstance(MobEffects.DIG_SPEED, 159, 1, false, false, true)
                    ))
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_AGILITY, Arrays.asList(
                            new MobEffectInstance(MobEffects.JUMP, 159, 2, false, false, true)
                    ))
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_DEFENSE, Arrays.asList(
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 159, 2, false, false, true),
                            new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 159, 0, false, false, true),
                            new MobEffectInstance(MobEffects.WEAKNESS, 159, 0, false, false, true)
                    ))
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_PURITY, Arrays.asList(
                            new MobEffectInstance(MobEffects.REGENERATION, 159, 0, false, false, true),
                            new MobEffectInstance(MobEffects.HUNGER, 159, 0, false, false, true)
                    ))
                    .put(ModArmorMaterials.CONDENSED_CANDY_OF_DESTRUCTION, Arrays.asList(
                            new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 159, 2, false, false, true),
                            new MobEffectInstance(MobEffects.DAMAGE_BOOST, 159, 0, false, false, true)
                    ))
                    .build();

    public CustomArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level world, Entity entity, int pSlotId, boolean pIsSelected) {
        if(!world.isClientSide()){
            if(entity instanceof Player) {
                Player player = (Player)entity;

                if(hasFullSuitOfArmorOn(player)){
                    evaluateArmorEffects(player);
                }
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, List<MobEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            List<MobEffectInstance> mapStatusEffects = entry.getValue();
            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                for (MobEffectInstance mapStatusEffect : mapStatusEffects) {
                    addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
                }
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(hasCorrectArmorOn(mapArmorMaterial, player)) {
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
