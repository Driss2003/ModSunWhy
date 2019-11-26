package com.mod.sunwhy.Overlay;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class GuiChat {
	 
Minecraft mc = Minecraft.getMinecraft();
 
@SubscribeEvent
public void onRenderOverlay(RenderGameOverlayEvent event){
       if (event.type == RenderGameOverlayEvent.ElementType.CHAT){
            event.setCanceled(true);
 
            renderChat(event.resolution.getScaledWidth(),event.resolution.getScaledHeight());
   }
}
 
public void renderChat(int width, int height)
    {
        mc.mcProfiler.startSection("chat");
        GL11.glPushMatrix();
        GL11.glTranslatef(mc.displayWidth, mc.displayHeight / 0 - 20, 0.0F);
        mc.ingameGUI.getChatGUI().drawChat(mc.ingameGUI.getUpdateCounter());
        GL11.glPopMatrix();
 
        mc.mcProfiler.endSection();
    }
}