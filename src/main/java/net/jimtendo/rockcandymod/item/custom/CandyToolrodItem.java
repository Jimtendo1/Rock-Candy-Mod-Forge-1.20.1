package net.jimtendo.rockcandymod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CandyToolrodItem extends Item {
    public CandyToolrodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy_toolrod.line1"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy_toolrod.line2"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy_toolrod.line3"));
        pTooltipComponents.add(Component.literal(""));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
