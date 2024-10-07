package net.jimtendo.rockcandymod.block;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.jimtendo.rockcandymod.item.ModItems;
import net.jimtendo.rockcandymod.item.custom.*;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RockCandyMod.MOD_ID);

    public static final RegistryObject<Block> CANDY_OF_BATTLE_ORE = registerBlock("candy_of_battle_ore",
        () -> new CandyOfBattleOreItem(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> DEEPSLATE_CANDY_OF_BATTLE_ORE = registerBlock("deepslate_candy_of_battle_ore",
        () -> new CandyOfBattleOreItem(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> CANDY_OF_HASTE_ORE = registerBlock("candy_of_haste_ore",
            () -> new CandyOfHasteOreItem(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> DEEPSLATE_CANDY_OF_HASTE_ORE = registerBlock("deepslate_candy_of_haste_ore",
            () -> new CandyOfBattleOreItem(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> CANDY_OF_POWER_ORE = registerBlock("candy_of_power_ore",
            () -> new CandyOfPowerOreItem(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> DEEPSLATE_CANDY_OF_POWER_ORE = registerBlock("deepslate_candy_of_power_ore",
            () -> new CandyOfBattleOreItem(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> CANDY_OF_STEALTH_ORE = registerBlock("candy_of_stealth_ore",
            () -> new CandyOfStealthOreItem(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> DEEPSLATE_CANDY_OF_STEALTH_ORE = registerBlock("deepslate_candy_of_stealth_ore",
            () -> new CandyOfBattleOreItem(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> CANDY_OF_SWIFTNESS_ORE = registerBlock("candy_of_swiftness_ore",
            () -> new CandyOfSwiftnessOreItem(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> DEEPSLATE_CANDY_OF_SWIFTNESS_ORE = registerBlock("deepslate_candy_of_swiftness_ore",
            () -> new CandyOfBattleOreItem(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(0,0)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_BATTLE = registerBlock("condensed_candy_of_battle",
            () -> new CondensedCandyOfBattleItem(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_HASTE = registerBlock("condensed_candy_of_haste",
            () -> new CondensedCandyOfHasteItem(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_POWER = registerBlock("condensed_candy_of_power",
            () -> new CondensedCandyOfPowerItem(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_STEALTH = registerBlock("condensed_candy_of_stealth",
            () -> new CondensedCandyOfStealthItem(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_SWIFTNESS = registerBlock("condensed_candy_of_swiftness",
            () -> new CondensedCandyOfSwiftnessItem(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_ADRENALINE = registerBlock("condensed_candy_of_adrenaline",
            () -> new CondensedCandyOfAdrenalineItem(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_AGILITY = registerBlock("condensed_candy_of_agility",
            () -> new CondensedCandyOfAgilityItem(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_DEFENSE = registerBlock("condensed_candy_of_defense",
            () -> new CondensedCandyOfDefenseItem(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_PURITY = registerBlock("condensed_candy_of_purity",
            () -> new CondensedCandyOfPurityItem(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> CONDENSED_CANDY_OF_DESTRUCTION = registerBlock("condensed_candy_of_destruction",
            () -> new CondensedCandyOfDestructionItem(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}