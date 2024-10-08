package net.jimtendo.rockcandymod.worldgen;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.jimtendo.rockcandymod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CANDY_OF_BATTLE_ORE_KEY = registerKey("candy_of_battle_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CANDY_OF_HASTE_ORE_KEY = registerKey("candy_of_haste_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CANDY_OF_POWER_ORE_KEY = registerKey("candy_of_power_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CANDY_OF_STEALTH_ORE_KEY = registerKey("candy_of_stealth_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CANDY_OF_SWIFTNESS_ORE_KEY = registerKey("candy_of_swiftness_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldCandyOfBattleOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.CANDY_OF_BATTLE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CANDY_OF_BATTLE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCandyOfHasteOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.CANDY_OF_HASTE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CANDY_OF_HASTE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCandyOfPowerOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.CANDY_OF_POWER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CANDY_OF_POWER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCandyOfStealthOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.CANDY_OF_STEALTH_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CANDY_OF_STEALTH_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCandyOfSwiftnessOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.CANDY_OF_SWIFTNESS_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CANDY_OF_SWIFTNESS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_CANDY_OF_BATTLE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCandyOfBattleOres, 6));
        register(context, OVERWORLD_CANDY_OF_HASTE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCandyOfHasteOres, 6));
        register(context, OVERWORLD_CANDY_OF_POWER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCandyOfPowerOres, 6));
        register(context, OVERWORLD_CANDY_OF_STEALTH_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCandyOfStealthOres, 6));
        register(context, OVERWORLD_CANDY_OF_SWIFTNESS_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCandyOfSwiftnessOres, 6));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(RockCandyMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}