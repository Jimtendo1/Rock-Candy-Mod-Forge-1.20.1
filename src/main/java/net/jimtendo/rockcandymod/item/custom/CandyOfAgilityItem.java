package net.jimtendo.rockcandymod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CandyOfAgilityItem extends Item {
    public CandyOfAgilityItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.line1"));
        pTooltipComponents.add(Component.literal(""));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.buffs40"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.swiftness4"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.jump4"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.weakness1"));
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.candy.mining_fatique1"));
        pTooltipComponents.add(Component.literal(""));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}