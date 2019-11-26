package com.mod.sunwhy.proxy;

import com.mod.sunwhy.GuiJobs.Guijobs;
import com.mod.sunwhy.Overlay.F3Event;
import com.mod.sunwhy.Overlay.OverlayChestRadar;
import com.mod.sunwhy.dynamite.EntityDynamite;
import com.mod.sunwhy.dynamite.entitydynamitesun;
import com.mod.sunwhy.init.ItemMod;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.common.MinecraftForge;
public class ClientProxy extends CommonProxy

	{

	    
	    public void registerRenders()
	    {

	        RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, new RenderSnowball(ItemMod.lol));
	        RenderingRegistry.registerEntityRenderingHandler(entitydynamitesun.class, new RenderSnowball(ItemMod.lol));
	        MinecraftForge.EVENT_BUS.register(new GuiChat());

	        MinecraftForge.EVENT_BUS.register(new Guijobs());
	        MinecraftForge.EVENT_BUS.register(new F3Event());
	    }
	    @Override
	    public void registerOverlay() {
	    	MinecraftForge.EVENT_BUS.register(new OverlayChestRadar());
	    }
	}