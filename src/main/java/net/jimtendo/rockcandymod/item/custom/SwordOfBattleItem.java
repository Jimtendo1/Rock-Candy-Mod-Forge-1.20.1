package net.jimtendo.rockcandymod.item.custom;

import net.jimtendo.rockcandymod.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SwordOfBattleItem extends SwordItem {
    public SwordOfBattleItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {


        if (player != null) {
            ItemStack mainHandItem = player.getMainHandItem();
            if (mainHandItem != null) {
                Item heldItem = mainHandItem.getItem();
                if (heldItem == (ModItems.SWORD_OF_BATTLE.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100));
                }
            }
        }
        super.onInventoryTick(stack, level, player, slotIndex, selectedIndex);
    }


    //apply effect when right clicked
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (hand == InteractionHand.MAIN_HAND) {
            if (player.getItemInHand(hand).getItem() == this) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100));
                return new InteractionResultHolder<>(InteractionResult.SUCCESS, player.getItemInHand(hand));
            }
        }
        return new InteractionResultHolder<>(InteractionResult.PASS, player.getItemInHand(hand));
    }



    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.rockcandymod.sword_of_battle.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}