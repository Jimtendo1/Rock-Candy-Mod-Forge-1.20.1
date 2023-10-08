package net.jimtendo.rockcandymod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CANDY_OF_BATTLE = new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 1),1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800),1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 800, 1),1F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 800),1F).build();
    public static final FoodProperties CANDY_OF_HASTE = new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 800),1F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 800,2),1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200),1F).build();
    public static final FoodProperties CANDY_OF_POWER = new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 800),1F)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 800),1F).build();
    public static final FoodProperties CANDY_OF_STEALTH = new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 800,1),1F)
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 800),1F).build();
    public static final FoodProperties CANDY_OF_SWIFTNESS = new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 800,1),1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 800),1F).build();
    public static final FoodProperties CANDY_OF_ADRENALINE = new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 800,4),1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 800,1),1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800),1F)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 800,1),1F).build();
    public static final FoodProperties CANDY_OF_AGILITY = new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 800,3),1F)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 800,3),1F)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 800),1F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 800),1F).build();
    public static final FoodProperties CANDY_OF_DEFENSE = new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 800),1F)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 800),1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 800,2),1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800),1F).build();
    public static final FoodProperties CANDY_OF_PURITY = new FoodProperties.Builder()
            .alwaysEat().nutrition(3)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1,2),1F)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 800),1F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200,9),1F).build();
    public static final FoodProperties CANDY_OF_DESTRUCTION = new FoodProperties.Builder()
            .alwaysEat().nutrition(6).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 500,3),1F)
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 500),1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500,2),1F).build();
}
