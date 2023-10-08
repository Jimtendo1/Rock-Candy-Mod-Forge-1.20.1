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
                new ForgeTier(2, 600, 3f, 0.5f, 10,
                        ModTags.Blocks.NEEDS_CANDY_OF_BATTLE_TOOL, () -> Ingredient.of(ModBlocks.CONDENSED_CANDY_OF_BATTLE.get())),
                new ResourceLocation(RockCandyMod.MOD_ID, "condensed_candy_of_battle"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));


    }
