package com.mod.sunwhy.dynamite;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class entitydynamitesun extends EntityThrowable implements IEntityAdditionalSpawnData
{
	   private int fuseTime = 200;
	 
	   public entitydynamitesun(World world)
	   {
	       super(world);
	   }
	 
	   public entitydynamitesun(World world, EntityLivingBase thrower)
	   {
	       super(world, thrower);
	   }
	 
	   public entitydynamitesun(World world, double x, double y, double z)
	   {
	       super(world, x, y, z);
	   }
	 
	   protected void onImpact(MovingObjectPosition mop)
	   {
	       this.motionX = 0;
	       this.motionY = 0;
	       this.motionZ = 0;
	       if (!this.worldObj.isRemote)
	       {
	 
	       }
	   }       
	   @Override
	   public void onUpdate()
	   {
	       super.onUpdate();
	       if(this.fuseTime > 0)
	       {
	           this.fuseTime --;
	       }
	 
	       else if(!this.worldObj.isRemote)
	       {
	           this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 20.0F, true, true);
	           this.setDead();

	       }
	 
	   }
	 
	   @Override
	   public void writeSpawnData(ByteBuf buffer)
	   
	   {
	       buffer.writeInt(this.fuseTime);
	       buffer.writeDouble(this.motionX);
	       buffer.writeDouble(this.motionY);
	       buffer.writeDouble(this.motionZ);
	       
	   }
	 
	   
	   @Override
	   public void readSpawnData(ByteBuf additionalData)
	   {
	       this.fuseTime = additionalData.readInt();
	       this.motionX = additionalData.readDouble();
	       this.motionY = additionalData.readDouble();
	       this.motionZ = additionalData.readDouble();
	   }
	}