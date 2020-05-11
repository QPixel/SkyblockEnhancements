package dev.qpixel.mods.SkyblockEnhancements;

import dev.qpixel.mods.SkyblockEnhancements.events.InventoryEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SkyblockEnhancements.MODID, version = SkyblockEnhancements.VERSION)
public class SkyblockEnhancements
{
    public static final String MODID = "Skyblock Enhancements";
    public static final String VERSION = "1.0";


    public static Logger logger;
    private static InventoryEventHandler INVEventHandler;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code

        
        logger.info("started");

    }
}
