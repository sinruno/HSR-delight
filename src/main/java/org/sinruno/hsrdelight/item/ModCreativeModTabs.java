package org.sinruno.hsrdelight.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.sinruno.hsrdelight.HSRdelight;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HSRdelight.MODID);

    public static final RegistryObject<CreativeModeTab> HSRDELIGHT_TAB =CREATIVE_MODE_TABS.register("hsrdelight_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.OAK_CAKE_ROLLS.get()))
                    .title(Component.translatable("creativetab.hsrdelight_tab"))
                    .displayItems((pParameters, pOutput) ->{
                        pOutput.accept(Moditems.OAK_CAKE_ROLLS.get());
                        pOutput.accept(Moditems.MUNG_BEAN_SODA.get());
                        pOutput.accept(Moditems.ABUNDANCE_OF_LUCK.get());
                        pOutput.accept(Moditems.BERRYPHEASANT_SKEWERS.get());
                        pOutput.accept(Moditems.IMMORTALS_DELIGHT.get());
                        pOutput.accept(Moditems.TRICK_SNACK.get());

                    } )
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
