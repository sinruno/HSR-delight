package org.sinruno.hsrdelight;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.sinruno.hsrdelight.block.ModBlocks;
import org.sinruno.hsrdelight.item.ModCreativeModTabs;
import org.sinruno.hsrdelight.item.Moditems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HSRdelight.MODID)
public class HSRdelight {
    public static final String MODID = "hsrdelight";



    public HSRdelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        Moditems.register(modEventBus);
        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(Moditems.OAK_CAKE_ROLLS);
            event.accept(Moditems.MUNG_BEAN_SODA);
        }
    }




}
