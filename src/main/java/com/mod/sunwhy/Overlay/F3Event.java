package com.mod.sunwhy.Overlay;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.Direction;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class F3Event {
	 
    Minecraft mc = Minecraft.getMinecraft();
    private Minecraft mc1 = FMLClientHandler.instance().getClient();
    private String biomeString, fpsString;
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onRenderPre(RenderGameOverlayEvent.Pre event)
    
    {

        if(event.type == RenderGameOverlayEvent.ElementType.DEBUG)
        {
            event.setCanceled(true);
            //FPS
            this.drawString(Minecraft.getMinecraft().fontRenderer, mc.debug.split(",", 2)[0], 3, 6, 16777215);
 
            //COORDS
            int angle = MathHelper.floor_double((double)(Minecraft.getMinecraft().thePlayer.rotationYaw * 9.0F / 360.0F) + 2.5D) & 3;
            int x = (int) mc.thePlayer.posX;
            int y = (int) mc.thePlayer.posY;
            int z = (int) mc.thePlayer.posZ;
            biomeString = mc.theWorld.getBiomeGenForCoords(x, z).biomeName;
            FMLClientHandler.instance().getClient().fontRenderer.drawStringWithShadow("Biome : "+biomeString, 3, 30, 0x00ff00);
            String direction = Direction.directions[angle];
            String var5 = "    ";
            String var4 = EnumChatFormatting.AQUA + "X: " + x + "  Y: " + y + "  Z: " + z;
 
            this.drawString(mc.fontRenderer, EnumChatFormatting.WHITE + mc.theWorld.getBiomeGenForCoords(MathHelper.floor_double(mc.thePlayer.posX), MathHelper.floor_double(mc.thePlayer.posZ)).biomeName + var5 + direction, 3, 12, 167772215);
            event.setCanceled(true);
            this.drawString(mc.fontRenderer, var4, 3, 18, 16777215);
            
            
        }
        
        
    }
 
    @SideOnly(Side.CLIENT)
    private void drawString(FontRenderer fontRenderer, String str, int x, int y, int color) {
        fontRenderer.drawStringWithShadow(str, x, y, color);
        
    }
    
 
 
}