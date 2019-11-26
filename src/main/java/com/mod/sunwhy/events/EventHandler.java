package com.mod.sunwhy.events;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.Direction;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class EventHandler {
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onRenderPre(RenderGameOverlayEvent.Pre event)
	{
	if(event.type == RenderGameOverlayEvent.ElementType.DEBUG)

            event.setCanceled(true);
	{
	Minecraft mc = Minecraft.getMinecraft();
	event.setCanceled(true);
	  this.drawString(Minecraft.getMinecraft().fontRenderer, mc.debug.split(",", 2)[0], 10, 50, 0xFF0000);
	}
	}
	 
	@SideOnly(Side.CLIENT)
	   public void drawString(FontRenderer fontRenderer, String str, int x, int y, int color)
	   {
	       fontRenderer.drawStringWithShadow(str, x, y, color);
	    }
	}