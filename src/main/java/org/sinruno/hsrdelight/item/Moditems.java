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
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
