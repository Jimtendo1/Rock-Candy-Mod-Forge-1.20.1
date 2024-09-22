package net.jimtendo.rockcandymod.item;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.jimtendo.rockcandymod.item.custom.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RockCandyMod.MOD_ID);

    public static final RegistryObject<Item> CANDY_TOOLROD = ITEMS.register("candy_toolrod",
            () -> new CandyToolrodItem(new Item.Properties()));
    public static final RegistryObject<Item> CANDY_OF_BATTLE = ITEMS.register("candy_of_battle",
            () -> new CandyOfBattleItem(new Item.Properties().food(ModFoods.CANDY_OF_BATTLE)));
    public static final RegistryObject<Item> CANDY_OF_HASTE = ITEMS.register("candy_of_haste",
            () -> new CandyOfHasteItem(new Item.Properties().food(ModFoods.CANDY_OF_HASTE)));
    public static final RegistryObject<Item> CANDY_OF_POWER = ITEMS.register("candy_of_power",
            () -> new CandyOfPowerItem(new Item.Properties().food(ModFoods.CANDY_OF_POWER)));
    public static final RegistryObject<Item> CANDY_OF_STEALTH = ITEMS.register("candy_of_stealth",
            () -> new CandyOfStealthItem(new Item.Properties().food(ModFoods.CANDY_OF_STEALTH)));
    public static final RegistryObject<Item> CANDY_OF_SWIFTNESS = ITEMS.register("candy_of_swiftness",
            () -> new CandyOfSwiftnessItem(new Item.Properties().food(ModFoods.CANDY_OF_SWIFTNESS)));
    public static final RegistryObject<Item> CANDY_OF_ADRENALINE = ITEMS.register("candy_of_adrenaline",
            () -> new CandyOfAdrenalineItem(new Item.Properties().food(ModFoods.CANDY_OF_ADRENALINE)));
    public static final RegistryObject<Item> CANDY_OF_AGILITY = ITEMS.register("candy_of_agility",
            () -> new CandyOfAgilityItem(new Item.Properties().food(ModFoods.CANDY_OF_AGILITY)));
    public static final RegistryObject<Item> CANDY_OF_DEFENSE = ITEMS.register("candy_of_defense",
            () -> new CandyOfDefenseItem(new Item.Properties().food(ModFoods.CANDY_OF_DEFENSE)));
    public static final RegistryObject<Item> CANDY_OF_PURITY = ITEMS.register("candy_of_purity",
            () -> new CandyOfPurityItem(new Item.Properties().food(ModFoods.CANDY_OF_PURITY)));
    public static final RegistryObject<Item> CANDY_OF_DESTRUCTION = ITEMS.register("candy_of_destruction",
            () -> new CandyOfDestructionItem(new Item.Properties().food(ModFoods.CANDY_OF_DESTRUCTION)));

    public static final RegistryObject<Item> SWORD_OF_BATTLE = ITEMS.register("sword_of_battle",
            () -> new SwordOfBattleItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_BATTLE = ITEMS.register("pickaxe_of_battle",
            () -> new PickaxeOfBattleItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_BATTLE = ITEMS.register("axe_of_battle",
            () -> new AxeOfBattleItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_BATTLE = ITEMS.register("shovel_of_battle",
            () -> new ShovelOfBattleItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_BATTLE = ITEMS.register("hoe_of_battle",
            () -> new HoeOfBattleItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> SWORD_OF_HASTE = ITEMS.register("sword_of_haste",
            () -> new SwordOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_HASTE,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_HASTE = ITEMS.register("pickaxe_of_haste",
            () -> new PickaxeOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_HASTE, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_HASTE = ITEMS.register("axe_of_haste",
            () -> new AxeOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_HASTE, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_HASTE = ITEMS.register("shovel_of_haste",
            () -> new ShovelOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_HASTE, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_HASTE = ITEMS.register("hoe_of_haste",
            () -> new HoeOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_HASTE, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> SWORD_OF_POWER = ITEMS.register("sword_of_power",
            () -> new SwordOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_POWER,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_POWER = ITEMS.register("pickaxe_of_power",
            () -> new PickaxeOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_POWER, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_POWER = ITEMS.register("axe_of_power",
            () -> new AxeOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_POWER, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_POWER = ITEMS.register("shovel_of_power",
            () -> new ShovelOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_POWER, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_POWER = ITEMS.register("hoe_of_power",
            () -> new HoeOfHasteItem(ModToolTiers.CONDENSED_CANDY_OF_POWER, 0, -3.0F,new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
