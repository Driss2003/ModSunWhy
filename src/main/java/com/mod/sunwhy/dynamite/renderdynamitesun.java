package com.mod.sunwhy.dynamite;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class renderdynamitesun extends Render
{
    private Item dynamite;
    private int renderdynamitesun;
       private static final String __OBFID = "CL_00001008";
 
    public renderdynamitesun(Item dynamite, int RenderDynamite)
    {
        this.dynamite = dynamite;
        this.renderdynamitesun = RenderDynamite;
    }
 
    public renderdynamitesun(Item dynamite)
    {
        this(dynamite, 0);
    }
 
    @Override
    public void doRender(Entity dynamite, double x, double y, double z, float dynamite1, float RenderDynamite)
    {
        // TODO Auto-generated method stub
 
    }
 
    @Override
    protected ResourceLocation getEntityTexture(Entity Dynamite)
    {
        // TODO Auto-generated method stub
        return null;
    }
{

}
}