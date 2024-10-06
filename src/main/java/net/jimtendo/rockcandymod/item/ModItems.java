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
            () -> new SwordOfPowerItem(ModToolTiers.CONDENSED_CANDY_OF_POWER,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_POWER = ITEMS.register("pickaxe_of_power",
            () -> new PickaxeOfPowerItem(ModToolTiers.CONDENSED_CANDY_OF_POWER, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_POWER = ITEMS.register("axe_of_power",
            () -> new AxeOfPowerItem(ModToolTiers.CONDENSED_CANDY_OF_POWER, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_POWER = ITEMS.register("shovel_of_power",
            () -> new ShovelOfPowerItem(ModToolTiers.CONDENSED_CANDY_OF_POWER, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_POWER = ITEMS.register("hoe_of_power",
            () -> new HoeOfPowerItem(ModToolTiers.CONDENSED_CANDY_OF_POWER, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> SWORD_OF_STEALTH = ITEMS.register("sword_of_stealth",
            () -> new SwordOfStealthItem(ModToolTiers.CONDENSED_CANDY_OF_STEALTH,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_STEALTH = ITEMS.register("pickaxe_of_stealth",
            () -> new PickaxeOfStealthItem(ModToolTiers.CONDENSED_CANDY_OF_STEALTH, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_STEALTH = ITEMS.register("axe_of_stealth",
            () -> new AxeOfStealthItem(ModToolTiers.CONDENSED_CANDY_OF_STEALTH, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_STEALTH = ITEMS.register("shovel_of_stealth",
            () -> new ShovelOfStealthItem(ModToolTiers.CONDENSED_CANDY_OF_STEALTH, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_STEALTH = ITEMS.register("hoe_of_stealth",
            () -> new HoeOfStealthItem(ModToolTiers.CONDENSED_CANDY_OF_STEALTH, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> SWORD_OF_SWIFTNESS = ITEMS.register("sword_of_swiftness",
            () -> new SwordOfSwiftnessItem(ModToolTiers.CONDENSED_CANDY_OF_SWIFTNESS,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_SWIFTNESS = ITEMS.register("pickaxe_of_swiftness",
            () -> new PickaxeOfSwiftnessItem(ModToolTiers.CONDENSED_CANDY_OF_SWIFTNESS, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_SWIFTNESS = ITEMS.register("axe_of_swiftness",
            () -> new AxeOfSwiftnessItem(ModToolTiers.CONDENSED_CANDY_OF_SWIFTNESS, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_SWIFTNESS = ITEMS.register("shovel_of_swiftness",
            () -> new ShovelOfSwiftnessItem(ModToolTiers.CONDENSED_CANDY_OF_SWIFTNESS, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_SWIFTNESS = ITEMS.register("hoe_of_swiftness",
            () -> new HoeOfSwiftnessItem(ModToolTiers.CONDENSED_CANDY_OF_SWIFTNESS, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> SWORD_OF_ADRENALINE = ITEMS.register("sword_of_adrenaline",
            () -> new SwordOfAdrenalineItem(ModToolTiers.CONDENSED_CANDY_OF_ADRENALINE,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_ADRENALINE = ITEMS.register("pickaxe_of_adrenaline",
            () -> new PickaxeOfAdrenalineItem(ModToolTiers.CONDENSED_CANDY_OF_ADRENALINE, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_ADRENALINE = ITEMS.register("axe_of_adrenaline",
            () -> new AxeOfAdrenalineItem(ModToolTiers.CONDENSED_CANDY_OF_ADRENALINE, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_ADRENALINE = ITEMS.register("shovel_of_adrenaline",
            () -> new ShovelOfAdrenalineItem(ModToolTiers.CONDENSED_CANDY_OF_ADRENALINE, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_ADRENALINE = ITEMS.register("hoe_of_adrenaline",
            () -> new HoeOfAdrenalineItem(ModToolTiers.CONDENSED_CANDY_OF_ADRENALINE, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> SWORD_OF_AGILITY = ITEMS.register("sword_of_agility",
            () -> new SwordOfAgilityItem(ModToolTiers.CONDENSED_CANDY_OF_AGILITY,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_AGILITY = ITEMS.register("pickaxe_of_agility",
            () -> new PickaxeOfAgilityItem(ModToolTiers.CONDENSED_CANDY_OF_AGILITY, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_AGILITY = ITEMS.register("axe_of_agility",
            () -> new AxeOfAgilityItem(ModToolTiers.CONDENSED_CANDY_OF_AGILITY, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_AGILITY = ITEMS.register("shovel_of_agility",
            () -> new ShovelOfAgilityItem(ModToolTiers.CONDENSED_CANDY_OF_AGILITY, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_AGILITY = ITEMS.register("hoe_of_agility",
            () -> new HoeOfAgilityItem(ModToolTiers.CONDENSED_CANDY_OF_AGILITY, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> SWORD_OF_DEFENSE = ITEMS.register("sword_of_defense",
            () -> new SwordOfDefenseItem(ModToolTiers.CONDENSED_CANDY_OF_DEFENSE,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_DEFENSE = ITEMS.register("pickaxe_of_defense",
            () -> new PickaxeOfDefenseItem(ModToolTiers.CONDENSED_CANDY_OF_DEFENSE, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_DEFENSE = ITEMS.register("axe_of_defense",
            () -> new AxeOfDefenseItem(ModToolTiers.CONDENSED_CANDY_OF_DEFENSE, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_DEFENSE = ITEMS.register("shovel_of_defense",
            () -> new ShovelOfDefenseItem(ModToolTiers.CONDENSED_CANDY_OF_DEFENSE, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_DEFENSE = ITEMS.register("hoe_of_defense",
            () -> new HoeOfDefenseItem(ModToolTiers.CONDENSED_CANDY_OF_DEFENSE, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> SWORD_OF_PURITY = ITEMS.register("sword_of_purity",
            () -> new SwordOfPurityItem(ModToolTiers.CONDENSED_CANDY_OF_PURITY,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_PURITY = ITEMS.register("pickaxe_of_purity",
            () -> new PickaxeOfPurityItem(ModToolTiers.CONDENSED_CANDY_OF_PURITY, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_PURITY = ITEMS.register("axe_of_purity",
            () -> new AxeOfPurityItem(ModToolTiers.CONDENSED_CANDY_OF_PURITY, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_PURITY = ITEMS.register("shovel_of_purity",
            () -> new ShovelOfPurityItem(ModToolTiers.CONDENSED_CANDY_OF_PURITY, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_PURITY = ITEMS.register("hoe_of_purity",
            () -> new HoeOfPurityItem(ModToolTiers.CONDENSED_CANDY_OF_PURITY, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> SWORD_OF_DESTRUCTION = ITEMS.register("sword_of_destruction",
            () -> new SwordOfDestructionItem(ModToolTiers.CONDENSED_CANDY_OF_DESTRUCTION,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_DESTRUCTION = ITEMS.register("pickaxe_of_destruction",
            () -> new PickaxeOfDestructionItem(ModToolTiers.CONDENSED_CANDY_OF_DESTRUCTION, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_DESTRUCTION = ITEMS.register("axe_of_destruction",
            () -> new AxeOfDestructionItem(ModToolTiers.CONDENSED_CANDY_OF_DESTRUCTION, 6, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_DESTRUCTION = ITEMS.register("shovel_of_destruction",
            () -> new ShovelOfDestructionItem(ModToolTiers.CONDENSED_CANDY_OF_DESTRUCTION, 1, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_DESTRUCTION = ITEMS.register("hoe_of_destruction",
            () -> new HoeOfDestructionItem(ModToolTiers.CONDENSED_CANDY_OF_DESTRUCTION, 0, -3.0F,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_BATTLE = ITEMS.register("helmet_of_battle",
            () -> new HelmetOfBattleItem(ModArmorMaterials.CONDENSED_CANDY_OF_BATTLE, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_BATTLE = ITEMS.register("chestplate_of_battle",
            () -> new ChestplateOfBattleItem(ModArmorMaterials.CONDENSED_CANDY_OF_BATTLE, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_BATTLE = ITEMS.register("leggings_of_battle",
            () -> new LeggingsOfBattleItem(ModArmorMaterials.CONDENSED_CANDY_OF_BATTLE, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_BATTLE = ITEMS.register("boots_of_battle",
            () -> new BootsOfBattleItem(ModArmorMaterials.CONDENSED_CANDY_OF_BATTLE, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_HASTE = ITEMS.register("helmet_of_haste",
            () -> new HelmetOfHasteItem(ModArmorMaterials.CONDENSED_CANDY_OF_HASTE, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_HASTE = ITEMS.register("chestplate_of_haste",
            () -> new ChestplateOfHasteItem(ModArmorMaterials.CONDENSED_CANDY_OF_HASTE, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_HASTE = ITEMS.register("leggings_of_haste",
            () -> new LeggingsOfHasteItem(ModArmorMaterials.CONDENSED_CANDY_OF_HASTE, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_HASTE = ITEMS.register("boots_of_haste",
            () -> new BootsOfHasteItem(ModArmorMaterials.CONDENSED_CANDY_OF_HASTE, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_POWER = ITEMS.register("helmet_of_power",
            () -> new HelmetOfPowerItem(ModArmorMaterials.CONDENSED_CANDY_OF_POWER, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_POWER = ITEMS.register("chestplate_of_power",
            () -> new ChestplateOfPowerItem(ModArmorMaterials.CONDENSED_CANDY_OF_POWER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_POWER = ITEMS.register("leggings_of_power",
            () -> new LeggingsOfPowerItem(ModArmorMaterials.CONDENSED_CANDY_OF_POWER, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_POWER = ITEMS.register("boots_of_power",
            () -> new BootsOfPowerItem(ModArmorMaterials.CONDENSED_CANDY_OF_POWER, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_STEALTH = ITEMS.register("helmet_of_stealth",
            () -> new HelmetOfStealthItem(ModArmorMaterials.CONDENSED_CANDY_OF_STEALTH, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_STEALTH = ITEMS.register("chestplate_of_stealth",
            () -> new ChestplateOfStealthItem(ModArmorMaterials.CONDENSED_CANDY_OF_STEALTH, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_STEALTH = ITEMS.register("leggings_of_stealth",
            () -> new LeggingsOfStealthItem(ModArmorMaterials.CONDENSED_CANDY_OF_STEALTH, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_STEALTH = ITEMS.register("boots_of_stealth",
            () -> new BootsOfStealthItem(ModArmorMaterials.CONDENSED_CANDY_OF_STEALTH, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_SWIFTNESS = ITEMS.register("helmet_of_swiftness",
            () -> new HelmetOfSwiftnessItem(ModArmorMaterials.CONDENSED_CANDY_OF_SWIFTNESS, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_SWIFTNESS = ITEMS.register("chestplate_of_swiftness",
            () -> new ChestplateOfSwiftnessItem(ModArmorMaterials.CONDENSED_CANDY_OF_SWIFTNESS, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_SWIFTNESS = ITEMS.register("leggings_of_swiftness",
            () -> new LeggingsOfSwiftnessItem(ModArmorMaterials.CONDENSED_CANDY_OF_SWIFTNESS, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_SWIFTNESS = ITEMS.register("boots_of_swiftness",
            () -> new BootsOfSwiftnessItem(ModArmorMaterials.CONDENSED_CANDY_OF_SWIFTNESS, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_ADRENALINE = ITEMS.register("helmet_of_adrenaline",
            () -> new HelmetOfAdrenalineItem(ModArmorMaterials.CONDENSED_CANDY_OF_ADRENALINE, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_ADRENALINE = ITEMS.register("chestplate_of_adrenaline",
            () -> new ChestplateOfAdrenalineItem(ModArmorMaterials.CONDENSED_CANDY_OF_ADRENALINE, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_ADRENALINE = ITEMS.register("leggings_of_adrenaline",
            () -> new LeggingsOfAdrenalineItem(ModArmorMaterials.CONDENSED_CANDY_OF_ADRENALINE, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_ADRENALINE = ITEMS.register("boots_of_adrenaline",
            () -> new BootsOfAdrenalineItem(ModArmorMaterials.CONDENSED_CANDY_OF_ADRENALINE, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_AGILITY = ITEMS.register("helmet_of_agility",
            () -> new HelmetOfAgilityItem(ModArmorMaterials.CONDENSED_CANDY_OF_AGILITY, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_AGILITY = ITEMS.register("chestplate_of_agility",
            () -> new ChestplateOfAgilityItem(ModArmorMaterials.CONDENSED_CANDY_OF_AGILITY, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_AGILITY = ITEMS.register("leggings_of_agility",
            () -> new LeggingsOfAgilityItem(ModArmorMaterials.CONDENSED_CANDY_OF_AGILITY, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_AGILITY = ITEMS.register("boots_of_agility",
            () -> new BootsOfAgilityItem(ModArmorMaterials.CONDENSED_CANDY_OF_AGILITY, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_DEFENSE = ITEMS.register("helmet_of_defense",
            () -> new HelmetOfDefenseItem(ModArmorMaterials.CONDENSED_CANDY_OF_DEFENSE, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_DEFENSE = ITEMS.register("chestplate_of_defense",
            () -> new ChestplateOfDefenseItem(ModArmorMaterials.CONDENSED_CANDY_OF_DEFENSE, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_DEFENSE = ITEMS.register("leggings_of_defense",
            () -> new LeggingsOfDefenseItem(ModArmorMaterials.CONDENSED_CANDY_OF_DEFENSE, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_DEFENSE = ITEMS.register("boots_of_defense",
            () -> new BootsOfDefenseItem(ModArmorMaterials.CONDENSED_CANDY_OF_DEFENSE, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_PURITY = ITEMS.register("helmet_of_purity",
            () -> new HelmetOfPurityItem(ModArmorMaterials.CONDENSED_CANDY_OF_PURITY, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_PURITY = ITEMS.register("chestplate_of_purity",
            () -> new ChestplateOfPurityItem(ModArmorMaterials.CONDENSED_CANDY_OF_PURITY, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_PURITY = ITEMS.register("leggings_of_purity",
            () -> new LeggingsOfPurityItem(ModArmorMaterials.CONDENSED_CANDY_OF_PURITY, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_PURITY = ITEMS.register("boots_of_purity",
            () -> new BootsOfPurityItem(ModArmorMaterials.CONDENSED_CANDY_OF_PURITY, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> HELMET_OF_DESTRUCTION = ITEMS.register("helmet_of_destruction",
            () -> new HelmetOfDestructionItem(ModArmorMaterials.CONDENSED_CANDY_OF_DESTRUCTION, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CHESTPLATE_OF_DESTRUCTION = ITEMS.register("chestplate_of_destruction",
            () -> new ChestplateOfDestructionItem(ModArmorMaterials.CONDENSED_CANDY_OF_DESTRUCTION, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> LEGGINGS_OF_DESTRUCTION = ITEMS.register("leggings_of_destruction",
            () -> new LeggingsOfDestructionItem(ModArmorMaterials.CONDENSED_CANDY_OF_DESTRUCTION, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BOOTS_OF_DESTRUCTION = ITEMS.register("boots_of_destruction",
            () -> new BootsOfDestructionItem(ModArmorMaterials.CONDENSED_CANDY_OF_DESTRUCTION, ArmorItem.Type.BOOTS,new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
