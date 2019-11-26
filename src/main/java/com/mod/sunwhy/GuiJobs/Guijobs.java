package com.mod.sunwhy.GuiJobs;

import org.lwjgl.opengl.GL11;

import com.mod.sunwhy.Overlay.DisplayHelper;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class Guijobs extends GuiScreen {
	
final ResourceLocation bg = new ResourceLocation("megamod", "textures/gui/XPJob.png");
final ResourceLocation bg2 = new ResourceLocation("megamod", "textures/gui/Cadre.png");
private static final ResourceLocation texture = new ResourceLocation("textures/gui/demo_background.png");
 
	   public Guijobs()
	   {
		  
	   }  
	   public boolean doesGuiPauseGame()
	    {
	        return false;
	    }	
	   @Override
	   public void initGui()
	   {
	       super.initGui();
	   }   
	   @Override
	   protected void keyTyped(char typedChar, int keyCode)
	   {
	       super.keyTyped(typedChar, keyCode);
	   }
	   @Override
	   protected void actionPerformed(GuiButton button)
	   {
			if (button.id == 0) {
				
			}
			if (button.id == 1) {
				
			}		    
	   }					  
	   @Override
	   public void updateScreen()
	   {
		  
	       super.updateScreen();
	   } 
	   public void drawScreen(int mouseX, int mouseY, float partialTick)
	   { 		
		   jobHandler props = jobHandler.get(mc.thePlayer);
		   
	       mc.getTextureManager().bindTexture(texture);
	       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	       
	       this.drawTexturedModalRect(this.width / 2 - 115, this.height / 2 - 105, 0, 0, 256, 250);	       
	       mc.renderEngine.bindTexture(this.bg2);
	       DisplayHelper.drawTexturedQuadFit(this.width/ 2.0D - 112.0D, this.height/ 2.0D - 50.5D, 50.0D, 9.0D, 0.0D);
	       
	       super.drawScreen(mouseX, mouseY, partialTick);       
	       mc.renderEngine.bindTexture(this.bg);				
	       DisplayHelper.drawTexturedQuadFit(this.width/ 2.0D - 110.0D, this.height/ 2.0D - 50.0D, props.getMoney(), 8.0D, 0.0D);       
	   }  
}
