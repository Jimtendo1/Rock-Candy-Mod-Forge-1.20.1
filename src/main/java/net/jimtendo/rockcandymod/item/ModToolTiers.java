package net.jimtendo.rockcandymod.item;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.jimtendo.rockcandymod.block.ModBlocks;
import net.jimtendo.rockcandymod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
        public static final Tier CONDENSED_CANDY_OF_BATTLE = TierSortingRegistry.registerTier(
                new ForgeTier(2, 600, 3.0F, 1, 14,
                        ModTags.Blocks.NEEDS_CANDY_OF_BATTLE_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_BATTLE.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_battle"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
        public static final Tier CONDENSED_CANDY_OF_HASTE = TierSortingRegistry.registerTier(
                new ForgeTier(2, 300, 8.0F, 2.0F, 14,
                        ModTags.Blocks.NEEDS_CANDY_OF_HASTE_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_HASTE.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_haste"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
        public static final Tier CONDENSED_CANDY_OF_POWER = TierSortingRegistry.registerTier(
                new ForgeTier(2, 2000, 5.0F, 2.0F, 50,
                        ModTags.Blocks.NEEDS_CANDY_OF_POWER_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_POWER.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_power"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
        public static final Tier CONDENSED_CANDY_OF_STEALTH = TierSortingRegistry.registerTier(
                new ForgeTier(2, 600, 3.0F, 2.0F, 20,
                        ModTags.Blocks.NEEDS_CANDY_OF_STEALTH_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_STEALTH.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_stealth"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
        public static final Tier CONDENSED_CANDY_OF_SWIFTNESS = TierSortingRegistry.registerTier(
                new ForgeTier(2, 1000, 6.0F, 2.0F, 25,
                        ModTags.Blocks.NEEDS_CANDY_OF_SWIFTNESS_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_SWIFTNESS.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_swiftness"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
        public static final Tier CONDENSED_CANDY_OF_ADRENALINE = TierSortingRegistry.registerTier(
                new ForgeTier(2, 1200, 15.0F, 3.0F, 75,
                        ModTags.Blocks.NEEDS_CANDY_OF_ADRENALINE_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_ADRENALINE.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_adrenaline"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
        public static final Tier CONDENSED_CANDY_OF_AGILITY = TierSortingRegistry.registerTier(
                new ForgeTier(2, 1450, 12.0F, 3.0F, 50,
                        ModTags.Blocks.NEEDS_CANDY_OF_AGILITY_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_AGILITY.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_agility"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
        public static final Tier CONDENSED_CANDY_OF_DEFENSE = TierSortingRegistry.registerTier(
                new ForgeTier(2, 1700, 6.0F, 3.0F, 20,
                        ModTags.Blocks.NEEDS_CANDY_OF_DEFENSE_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_DEFENSE.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_defense"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
        public static final Tier CONDENSED_CANDY_OF_PURITY = TierSortingRegistry.registerTier(
                new ForgeTier(2, 1000, 6.0F, 3.0F, 75,
                        ModTags.Blocks.NEEDS_CANDY_OF_PURITY_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_PURITY.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_purity"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
        public static final Tier CONDENSED_CANDY_OF_DESTRUCTION = TierSortingRegistry.registerTier(
                new ForgeTier(2, 1000, 6.0F, 3.0F, 75,
                        ModTags.Blocks.NEEDS_CANDY_OF_DESTRUCTION_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_DESTRUCTION.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_destruction"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    }
