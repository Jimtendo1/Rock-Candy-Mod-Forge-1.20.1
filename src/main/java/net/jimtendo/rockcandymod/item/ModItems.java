package net.jimtendo.rockcandymod.item;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.jimtendo.rockcandymod.item.custom.SwordOfBattleItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RockCandyMod.MOD_ID);

    public static final RegistryObject<Item> CANDY_TOOLROD = ITEMS.register("candy_toolrod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CANDY_OF_BATTLE = ITEMS.register("candy_of_battle",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_BATTLE)));
    public static final RegistryObject<Item> CANDY_OF_HASTE = ITEMS.register("candy_of_haste",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_HASTE)));
    public static final RegistryObject<Item> CANDY_OF_POWER = ITEMS.register("candy_of_power",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_POWER)));
    public static final RegistryObject<Item> CANDY_OF_STEALTH = ITEMS.register("candy_of_stealth",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_STEALTH)));
    public static final RegistryObject<Item> CANDY_OF_SWIFTNESS = ITEMS.register("candy_of_swiftness",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_SWIFTNESS)));
    public static final RegistryObject<Item> CANDY_OF_ADRENALINE = ITEMS.register("candy_of_adrenaline",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_ADRENALINE)));
    public static final RegistryObject<Item> CANDY_OF_AGILITY = ITEMS.register("candy_of_agility",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_AGILITY)));
    public static final RegistryObject<Item> CANDY_OF_DEFENSE = ITEMS.register("candy_of_defense",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_DEFENSE)));
    public static final RegistryObject<Item> CANDY_OF_PURITY = ITEMS.register("candy_of_purity",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_PURITY)));
    public static final RegistryObject<Item> CANDY_OF_DESTRUCTION = ITEMS.register("candy_of_destruction",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_OF_DESTRUCTION)));

    public static final RegistryObject<Item> SWORD_OF_BATTLE = ITEMS.register("sword_of_battle",
            () -> new SwordOfBattleItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE,  3, -2.4F,new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_OF_BATTLE = ITEMS.register("pickaxe_of_battle",
            () -> new PickaxeItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE, 1, -2.8F,new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_BATTLE = ITEMS.register("axe_of_battle",
            () -> new AxeItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE, 6.0F, -3.2F,new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_OF_BATTLE = ITEMS.register("shovel_of_battle",
            () -> new ShovelItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE, 1.5F, -3.0F,new Item.Properties()));
    public static final RegistryObject<Item> HOE_OF_BATTLE = ITEMS.register("hoe_of_battle",
            () -> new HoeItem(ModToolTiers.CONDENSED_CANDY_OF_BATTLE, 0, -3.0F,new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
