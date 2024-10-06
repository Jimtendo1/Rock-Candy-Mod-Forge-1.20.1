package net.jimtendo.rockcandymod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@Mod.EventBusSubscriber(modid = "rockcandymod")
public class HoeOfDestructionItem extends HoeItem {
    public HoeOfDestructionItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            Player player = event.player;
            ItemStack mainHandItem = player.getMainHandItem();

            if (mainHandItem.getItem() instanceof HoeOfDestructionItem) {
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 159, 0, false, false));
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 159, 0, false, false));
            }
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.hoe.line1"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy_of_destruction"));
        pTooltipComponents.add(Component.literal(""));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.tool.effects"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.resistance"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.slowness1"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}