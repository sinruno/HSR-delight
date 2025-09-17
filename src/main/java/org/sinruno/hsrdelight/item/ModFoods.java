package org.sinruno.hsrdelight.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static final FoodProperties OAK_CAKE_ROLLS = new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).build();
    public static final FoodProperties MUNG_BEAN_SODA = new FoodProperties.Builder().nutrition(8).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,1200),1).build();
    public static final FoodProperties ABUNDANCE_OF_LUCK = new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).build();
    public static final FoodProperties BERRYPHEASANT_SKEWERS = new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).build();
    public static final FoodProperties IMMORTALS_DELIGHT = new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).build();
    public static final FoodProperties TRICK_SNACK = new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).build();
}
