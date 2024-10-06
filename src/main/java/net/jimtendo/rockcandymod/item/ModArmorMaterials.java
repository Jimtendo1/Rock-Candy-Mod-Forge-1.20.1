package net.jimtendo.rockcandymod.item;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.jimtendo.rockcandymod.block.ModBlocks;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    CONDENSED_CANDY_OF_BATTLE("condensed_candy_of_battle", 10, new int[]{1, 5, 4, 1}, 14,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_BATTLE.get())),
    CONDENSED_CANDY_OF_HASTE("condensed_candy_of_haste", 10, new int[]{1, 5, 4, 1}, 14,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_HASTE.get())),
    CONDENSED_CANDY_OF_POWER("condensed_candy_of_power", 20, new int[]{1, 5, 4, 1}, 50,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_POWER.get())),
    CONDENSED_CANDY_OF_STEALTH("condensed_candy_of_stealth", 5, new int[]{1, 4, 3, 1}, 20,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_HASTE.get())),
    CONDENSED_CANDY_OF_SWIFTNESS("condensed_candy_of_swiftness", 15, new int[]{1, 5, 4, 1}, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_HASTE.get())),
    CONDENSED_CANDY_OF_ADRENALINE("condensed_candy_of_adrenaline", 25, new int[]{3, 6, 5, 3}, 75,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_ADRENALINE.get())),
    CONDENSED_CANDY_OF_AGILITY("condensed_candy_of_agility", 30, new int[]{3, 6, 5, 2}, 50,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_AGILITY.get())),
    CONDENSED_CANDY_OF_DEFENSE("condensed_candy_of_defense", 40, new int[]{2, 6, 5, 2}, 20,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_DEFENSE.get())),
    CONDENSED_CANDY_OF_PURITY("condensed_candy_of_purity", 40, new int[]{2, 4, 4, 2}, 20,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_PURITY.get())),
    CONDENSED_CANDY_OF_DESTRUCTION("condensed_candy_of_destruction", 40, new int[]{2, 7, 5, 2}, 20,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_DESTRUCTION.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 16, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return RockCandyMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
