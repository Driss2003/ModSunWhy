package com.mod.sunwhy.dynamite;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
 
public class RenderDynamite extends Render
{
	ResourceLocation textureDynamite = new ResourceLocation("ModTuto:textures/entity/incDynamite.png");
    public static final int DEFAULT = 0;
    public int type;
    public float pitch = 40.0F;
 
    public RenderDynamite(int type) {
        this.type = type;
    }
 
    public void renderDynamite(EntityDynamite e, double d, double d1, double d2, float f, float f1) {
        GL11.glPushMatrix();
        this.bindEntityTexture(e);
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(e.rotationYaw + 90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(e.prevRotationPitch + (e.rotationPitch - e.prevRotationPitch) * f1, 0.0F, 0.0F, 1.0F);
        Tessellator tessellator = Tessellator.instance;
        int i = 0;
        float f2 = 0.0F;
        float f3 = 0.5F;
        float f4 = (float)(0 + i * 10) / 32.0F;
        float f5 = (float)(5 + i * 10) / 32.0F;
        float f6 = 0.0F;
        float f7 = 0.15625F;
        float f8 = (float)(5 + i * 10) / 32.0F;
        float f9 = (float)(10 + i * 10) / 32.0F;
        float f10 = 0.05625F;
        GL11.glEnable(32826);
        float f11 = -f1;
        if (f11 > 0.0F) {
            float f12 = -MathHelper.sin(f11 * 3.0F) * f11;
            GL11.glRotatef(f12, 0.0F, 0.0F, 1.0F);
        }
 
        GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(f10, f10, f10);
        GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
        GL11.glNormal3f(f10, 0.0F, 0.0F);
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)f6, (double)f8);
        tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)f7, (double)f8);
        tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)f7, (double)f9);
        tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)f6, (double)f9);
        tessellator.draw();
        GL11.glNormal3f(-f10, 0.0F, 0.0F);
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)f6, (double)f8);
        tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)f7, (double)f8);
        tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)f7, (double)f9);
        tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)f6, (double)f9);
        tessellator.draw();
 
        for(int j = 0; j < 4; ++j) {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glNormal3f(0.0F, 0.0F, f10);
            tessellator.startDrawingQuads();
            tessellator.addVertexWithUV(-8.0D, -2.0D, 0.0D, (double)f2, (double)f4);
            tessellator.addVertexWithUV(8.0D, -2.0D, 0.0D, (double)f3, (double)f4);
            tessellator.addVertexWithUV(8.0D, 2.0D, 0.0D, (double)f3, (double)f5);
            tessellator.addVertexWithUV(-8.0D, 2.0D, 0.0D, (double)f2, (double)f5);
            tessellator.draw();
        }
 
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }
 
    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) 
    {
        this.renderDynamite((EntityDynamite)entity, d, d1, d2, f, f1);
    }
 
    public ResourceLocation getEntityTexture(Entity entity) 
    {
    	return this.type == 1 ? this.textureDynamite : this.textureDynamite;
    }
}