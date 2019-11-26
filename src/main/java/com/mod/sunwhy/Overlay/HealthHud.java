package com.mod.sunwhy.Overlay;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import com.mod.sunwhy.Reference;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.main.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;





import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
//–----------------------------------------------------------------------------------------

	 

    import java.awt.Color;
    
    import org.lwjgl.opengl.GL11;
 
    import net.minecraft.client.Minecraft;
    import net.minecraft.client.gui.Gui;
    import net.minecraft.client.gui.ScaledResolution;
    import net.minecraft.entity.player.EntityPlayer;
    import net.minecraft.util.ResourceLocation;
    import net.minecraftforge.client.event.RenderGameOverlayEvent;
    import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

 
    @SideOnly(Side.CLIENT)
    public class HealthHud {
     
    	private static final ResourceLocation emptyLife = new ResourceLocation(Reference.MOD_ID, "textures/gui/emptylife.png");
    	private static final ResourceLocation fullLife = new ResourceLocation(Reference.MOD_ID, "textures/gui/fulllife.png");
     
    	public static final Minecraft MC = Minecraft.getMinecraft();
     
    	@SubscribeEvent
    	public static void renderGameOverlayPre(RenderGameOverlayEvent.Pre event)
     
    	{
     
    	}
     
    	@SubscribeEvent
     
    	public static void renderGameOverlayPost(RenderGameOverlayEvent.Post event, EntityPlayer player)
     
    	{
    		if (event.getPhase().equals(ElementType.ALL)) {
     
    			ExtendedProperties props = ExtendedProperties.get(player);
    			String s = "Argent :" + props.money + "$";
     
    			Gui.drawRect(MC.displayWidth - 5 - MC.fontRenderer.getStringWidth(s), 2, MC.displayWidth - 2,
    					4 + MC.fontRenderer.FONT_HEIGHT, Integer.MIN_VALUE);
     
    			MC.fontRenderer.drawString(s, MC.displayWidth - 3 - MC.fontRenderer.getStringWidth(s), 4,
    					255);
    			
     
    		}
    		// drawHealth(event.(), MC.player);
     
    		/*
    		 * String s = MC.getConnection().getPlayerInfoMap().size() + "/" +
    		 * MC.getConnection().currentServerMaxPlayers + " joueurs";
    		 * 
    		 * Gui.drawRect(width - 5 - MC.fontRendererObj.getStringWidth(s), 2, width - 2,
    		 * 4 + MC.fontRendererObj.FONT_HEIGHT, Integer.MIN_VALUE);
    		 * 
    		 * MC.fontRendererObj.drawString(s, width - 3 -
    		 * MC.fontRendererObj.getStringWidth(s), 4, Color.WHITE.getRGB());
    		 */
     
    	}
     
    }