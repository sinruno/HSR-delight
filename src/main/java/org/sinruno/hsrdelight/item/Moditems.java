package org.sinruno.hsrdelight.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.sinruno.hsrdelight.HSRdelight;

import java.util.zip.Deflater;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HSRdelight.MODID);

    public static final RegistryObject<Item> OAK_CAKE_ROLLS=ITEMS.register("oak_cake_rolls",
            () -> new Item(new Item.Properties().food(ModFoods.OAK_CAKE_ROLLS)));
    public static final RegistryObject<Item> MUNG_BEAN_SODA=ITEMS.register("mung_bean_soda",
            () -> new Item(new Item.Properties().food(ModFoods.MUNG_BEAN_SODA)));
    public static final RegistryObject<Item> ABUNDANCE_OF_LUCK=ITEMS.register("abundance_of_luck",
            () -> new Item(new Item.Properties().food(ModFoods.ABUNDANCE_OF_LUCK)));
    public static final RegistryObject<Item> BERRYPHEASANT_SKEWERS=ITEMS.register("berrypheasant_skewers",
            () -> new Item(new Item.Properties().food(ModFoods.BERRYPHEASANT_SKEWERS)));
    public static final RegistryObject<Item> IMMORTALS_DELIGHT=ITEMS.register("immortals_delight",
            () -> new Item(new Item.Properties().food(ModFoods.IMMORTALS_DELIGHT)));
    public static final RegistryObject<Item> TRICK_SNACK=ITEMS.register("trick_snack",
            () -> new Item(new Item.Properties().food(ModFoods.TRICK_SNACK)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
