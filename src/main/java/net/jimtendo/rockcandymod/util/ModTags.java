package net.jimtendo.rockcandymod.util;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORES = tag("ores");
        public static final TagKey<Block> ORES_CANDY_OF_BATTLE = tag("ores/candy_of_battle");
        public static final TagKey<Block> ORES_CANDY_OF_HASTE = tag("ores/candy_of_haste");
        public static final TagKey<Block> ORES_CANDY_OF_POWER = tag("ores/candy_of_power");
        public static final TagKey<Block> ORES_CANDY_OF_STEALTH = tag("ores/candy_of_stealth");
        public static final TagKey<Block> ORES_CANDY_OF_SWIFTNESS = tag("ores/candy_of_swiftness");

        public static final TagKey<Block> NEEDS_CANDY_OF_BATTLE_TOOL = tag("needs_candy_of_battle_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(RockCandyMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(RockCandyMod.MOD_ID, name));
        }
    }
}