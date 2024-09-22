package net.jimtendo.rockcandymod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CondensedCandyOfHasteItem extends Block {
    public CondensedCandyOfHasteItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable("tooltip.rockcandymod.condensed.line1"));
        pTooltip.add(Component.translatable("tooltip.rockcandymod.candy_of_haste"));
        pTooltip.add(Component.translatable("tooltip.rockcandymod.condensed.line2"));
        pTooltip.add(Component.translatable("tooltip.rockcandymod.condensed.line3"));
        pTooltip.add(Component.literal(""));
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }
}
