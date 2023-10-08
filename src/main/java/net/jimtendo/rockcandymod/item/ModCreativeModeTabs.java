package net.jimtendo.rockcandymod.item;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.jimtendo.rockcandymod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.ContainerScreenEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RockCandyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ROCK_CANDY_MOD = CREATIVE_MODE_TABS.register("rock_candy_mod",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.CANDY_OF_BATTLE.get()))
                    .title(Component.translatable("creativetab.rock_candy_mod"))
                    .displayItems((pParameters, pOutput) ->  {

                        pOutput.accept(ModItems.CANDY_TOOLROD.get());
                        pOutput.accept(ModItems.CANDY_OF_BATTLE.get());
                        pOutput.accept(ModItems.CANDY_OF_HASTE.get());
                        pOutput.accept(ModItems.CANDY_OF_POWER.get());
                        pOutput.accept(ModItems.CANDY_OF_STEALTH.get());
                        pOutput.accept(ModItems.CANDY_OF_SWIFTNESS.get());
                        pOutput.accept(ModItems.CANDY_OF_ADRENALINE.get());
                        pOutput.accept(ModItems.CANDY_OF_AGILITY.get());
                        pOutput.accept(ModItems.CANDY_OF_DEFENSE.get());
                        pOutput.accept(ModItems.CANDY_OF_PURITY.get());
                        pOutput.accept(ModItems.CANDY_OF_DESTRUCTION.get());

                        pOutput.accept(ModItems.SWORD_OF_BATTLE.get());
                        pOutput.accept(ModItems.PICKAXE_OF_BATTLE.get());
                        pOutput.accept(ModItems.AXE_OF_BATTLE.get());
                        pOutput.accept(ModItems.SHOVEL_OF_BATTLE.get());
                        pOutput.accept(ModItems.HOE_OF_BATTLE.get());

                        pOutput.accept(ModBlocks.CANDY_OF_BATTLE_ORE.get());
                        pOutput.accept(ModBlocks.CANDY_OF_HASTE_ORE.get());
                        pOutput.accept(ModBlocks.CANDY_OF_POWER_ORE.get());
                        pOutput.accept(ModBlocks.CANDY_OF_STEALTH_ORE.get());
                        pOutput.accept(ModBlocks.CANDY_OF_SWIFTNESS_ORE.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_BATTLE.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_HASTE.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_POWER.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_STEALTH.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_SWIFTNESS.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_ADRENALINE.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_AGILITY.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_DEFENSE.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_PURITY.get());
                        pOutput.accept(ModBlocks.CONDENSED_CANDY_OF_DESTRUCTION.get());

                   })
                    .withBackgroundLocation(new ResourceLocation(RockCandyMod.MOD_ID,   "textures/gui/container/creative_inventory/tab_candy.png"))
                    //.withTabsImage(new ResourceLocation(RockCandyMod.MOD_ID, "textures/gui/container/creative_inventory/candy_tabs.png"))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
