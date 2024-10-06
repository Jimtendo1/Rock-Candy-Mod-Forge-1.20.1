package net.jimtendo.rockcandymod.item.custom;

import net.jimtendo.rockcandymod.item.ModArmorMaterials;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@Mod.EventBusSubscriber(modid = "rockcandymod")
public class ChestplateOfStealthItem extends CustomArmorItem {
    public ChestplateOfStealthItem(ModArmorMaterials condensedCandyOfStealth, Type chestplate, Properties pProperties) {
        super(ModArmorMaterials.CONDENSED_CANDY_OF_STEALTH, Type.CHESTPLATE, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.chestplate_of_stealth.line1"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy_of_stealth.line2"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy_of_battle.line3"));
        pTooltipComponents.add(Component.literal(""));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.armor.effects"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.swiftness"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.saturation"));

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}