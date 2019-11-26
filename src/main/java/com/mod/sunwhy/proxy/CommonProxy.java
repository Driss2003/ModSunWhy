package com.mod.sunwhy.proxy;
import com.mod.sunwhy.Overlay.F3Event;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
 
public class CommonProxy {
 
private static KeyBinding bankMenuKeybind;
private static KeyBinding XD;
 
public CommonProxy()



 
{
    MinecraftForge.EVENT_BUS.register(new F3Event());

}



 
public void preInit(FMLPreInitializationEvent e) {
 
    }
 

    
    
    
    
 
    public void postInit(FMLPostInitializationEvent e) {
 
    }


	public void registerOverlay() {
		// TODO Auto-generated method stub
		
	}

	
	public static NBTTagCompound getEntityData(String saveKey) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void storeEntityData(String saveKey, NBTTagCompound savedData) {
		// TODO Auto-generated method stub
		
	}

	public void registerRender() {
		// TODO Auto-generated method stub
		
	}

	
	
}