package net.jimtendo.rockcandymod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CandyOfBattleOreItem extends Block {
    public CandyOfBattleOreItem(Properties pProperties, UniformInt uniformInt) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable("tooltip.rockcandymod.ore.line1"));
        pTooltip.add(Component.translatable("tooltip.rockcandymod.candy_of_battle"));
        pTooltip.add(Component.translatable("tooltip.rockcandymod.ore.line2"));
        pTooltip.add(Component.translatable("tooltip.rockcandymod.ore.line3"));
        pTooltip.add(Component.literal(""));
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }
}
