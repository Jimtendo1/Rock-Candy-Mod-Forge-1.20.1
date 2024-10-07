package net.jimtendo.rockcandymod.datagen;

import net.jimtendo.rockcandymod.RockCandyMod;
import net.jimtendo.rockcandymod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RockCandyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        trimmedArmorItem(ModItems.HELMET_OF_BATTLE);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_BATTLE);
        trimmedArmorItem(ModItems.LEGGINGS_OF_BATTLE);
        trimmedArmorItem(ModItems.BOOTS_OF_BATTLE);
        trimmedArmorItem(ModItems.HELMET_OF_HASTE);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_HASTE);
        trimmedArmorItem(ModItems.LEGGINGS_OF_HASTE);
        trimmedArmorItem(ModItems.BOOTS_OF_HASTE);
        trimmedArmorItem(ModItems.HELMET_OF_POWER);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_POWER);
        trimmedArmorItem(ModItems.LEGGINGS_OF_POWER);
        trimmedArmorItem(ModItems.BOOTS_OF_POWER);
        trimmedArmorItem(ModItems.HELMET_OF_STEALTH);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_STEALTH);
        trimmedArmorItem(ModItems.LEGGINGS_OF_STEALTH);
        trimmedArmorItem(ModItems.BOOTS_OF_STEALTH);
        trimmedArmorItem(ModItems.HELMET_OF_SWIFTNESS);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_SWIFTNESS);
        trimmedArmorItem(ModItems.LEGGINGS_OF_SWIFTNESS);
        trimmedArmorItem(ModItems.BOOTS_OF_SWIFTNESS);
        trimmedArmorItem(ModItems.HELMET_OF_ADRENALINE);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_ADRENALINE);
        trimmedArmorItem(ModItems.LEGGINGS_OF_ADRENALINE);
        trimmedArmorItem(ModItems.BOOTS_OF_ADRENALINE);
        trimmedArmorItem(ModItems.HELMET_OF_AGILITY);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_AGILITY);
        trimmedArmorItem(ModItems.LEGGINGS_OF_AGILITY);
        trimmedArmorItem(ModItems.BOOTS_OF_AGILITY);
        trimmedArmorItem(ModItems.HELMET_OF_DEFENSE);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_DEFENSE);
        trimmedArmorItem(ModItems.LEGGINGS_OF_DEFENSE);
        trimmedArmorItem(ModItems.BOOTS_OF_DEFENSE);
        trimmedArmorItem(ModItems.HELMET_OF_PURITY);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_PURITY);
        trimmedArmorItem(ModItems.LEGGINGS_OF_PURITY);
        trimmedArmorItem(ModItems.BOOTS_OF_PURITY);
        trimmedArmorItem(ModItems.HELMET_OF_DESTRUCTION);
        trimmedArmorItem(ModItems.CHESTPLATE_OF_DESTRUCTION);
        trimmedArmorItem(ModItems.LEGGINGS_OF_DESTRUCTION);
        trimmedArmorItem(ModItems.BOOTS_OF_DESTRUCTION);
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = RockCandyMod.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
}