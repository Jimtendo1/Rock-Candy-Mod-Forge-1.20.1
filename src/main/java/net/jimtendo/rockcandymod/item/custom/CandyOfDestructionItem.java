package net.jimtendo.rockcandymod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CandyOfDestructionItem extends Item {
    public CandyOfDestructionItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.line1"));
        pTooltipComponents.add(Component.literal(""));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.buffs25"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.strength4"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.blindness"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.slowness3"));
        pTooltipComponents.add(Component.literal(""));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
