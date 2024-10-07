package net.jimtendo.rockcandymod.datagen;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.jimtendo.rockcandymod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, RockCandyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.HELMET_OF_BATTLE.get(),
                        ModItems.CHESTPLATE_OF_BATTLE.get(),
                        ModItems.LEGGINGS_OF_BATTLE.get(),
                        ModItems.BOOTS_OF_BATTLE.get(),
                        ModItems.HELMET_OF_HASTE.get(),
                        ModItems.CHESTPLATE_OF_HASTE.get(),
                        ModItems.LEGGINGS_OF_HASTE.get(),
                        ModItems.BOOTS_OF_HASTE.get(),
                        ModItems.HELMET_OF_POWER.get(),
                        ModItems.CHESTPLATE_OF_POWER.get(),
                        ModItems.LEGGINGS_OF_POWER.get(),
                        ModItems.BOOTS_OF_POWER.get(),
                        ModItems.HELMET_OF_STEALTH.get(),
                        ModItems.CHESTPLATE_OF_STEALTH.get(),
                        ModItems.LEGGINGS_OF_STEALTH.get(),
                        ModItems.BOOTS_OF_STEALTH.get(),
                        ModItems.HELMET_OF_SWIFTNESS.get(),
                        ModItems.CHESTPLATE_OF_SWIFTNESS.get(),
                        ModItems.LEGGINGS_OF_SWIFTNESS.get(),
                        ModItems.BOOTS_OF_SWIFTNESS.get(),
                        ModItems.HELMET_OF_ADRENALINE.get(),
                        ModItems.CHESTPLATE_OF_ADRENALINE.get(),
                        ModItems.LEGGINGS_OF_ADRENALINE.get(),
                        ModItems.BOOTS_OF_ADRENALINE.get(),
                        ModItems.HELMET_OF_AGILITY.get(),
                        ModItems.CHESTPLATE_OF_AGILITY.get(),
                        ModItems.LEGGINGS_OF_AGILITY.get(),
                        ModItems.BOOTS_OF_AGILITY.get(),
                        ModItems.HELMET_OF_DEFENSE.get(),
                        ModItems.CHESTPLATE_OF_DEFENSE.get(),
                        ModItems.LEGGINGS_OF_DEFENSE.get(),
                        ModItems.BOOTS_OF_DEFENSE.get(),
                        ModItems.HELMET_OF_PURITY.get(),
                        ModItems.CHESTPLATE_OF_PURITY.get(),
                        ModItems.LEGGINGS_OF_PURITY.get(),
                        ModItems.BOOTS_OF_PURITY.get(),
                        ModItems.HELMET_OF_DESTRUCTION.get(),
                        ModItems.CHESTPLATE_OF_DESTRUCTION.get(),
                        ModItems.LEGGINGS_OF_DESTRUCTION.get(),
                        ModItems.BOOTS_OF_DESTRUCTION.get()
                );
    }
}