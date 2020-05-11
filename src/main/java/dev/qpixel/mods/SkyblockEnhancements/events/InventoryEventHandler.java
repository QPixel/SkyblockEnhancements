package dev.qpixel.mods.SkyblockEnhancements.events;

import dev.qpixel.mods.SkyblockEnhancements.SkyblockEnhancements;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;


public class InventoryEventHandler {
    private boolean inventory_open = false;
    private static GuiContainer lastInventory;
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event)
    {
        GuiScreen current = Minecraft.getMinecraft().currentScreen;

        if (current != lastInventory) {
            inventory_open = true;
            SkyblockEnhancements.logger.info("Inventory has been opened");
        }

        lastInventory = current instanceof GuiContainer ? (GuiContainer)current: null;

    }
}
