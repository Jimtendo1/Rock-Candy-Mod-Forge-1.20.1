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
public class LeggingsOfDestructionItem extends CustomArmorItem {
    public LeggingsOfDestructionItem(ModArmorMaterials condensedCandyOfDestruction, Type leggings, Properties pProperties) {
        super(ModArmorMaterials.CONDENSED_CANDY_OF_DESTRUCTION, Type.LEGGINGS, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.leggings_of_destruction.line1"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy_of_destruction.line2"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy_of_battle.line3"));
        pTooltipComponents.add(Component.literal(""));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.strength"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.slowness3"));

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}