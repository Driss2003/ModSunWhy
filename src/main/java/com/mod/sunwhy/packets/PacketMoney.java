package com.mod.sunwhy.packets;

import com.mod.sunwhy.GuiJobs.jobHandler;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.NetHandlerPlayServer;

public class PacketMoney implements IMessage
{
public long maxMoney;
public long money;
 


	public void update(long money, long money2){
		 
		this.money = money;
		this.money = money2;
		}
                            
   


public PacketMoney()
{
 
}
 
public PacketMoney(long cooldown, long kamas)
{
this.maxMoney = cooldown;
this.money = kamas;
 
 
}
 
@Override
public void fromBytes(ByteBuf buf)
{
maxMoney = buf.readLong();
money = buf.readLong();
 
 
}
 
@Override
public void toBytes(ByteBuf buf)
{
buf.writeLong(maxMoney);
buf.writeLong(money);
 
 
}
 
public static class Handler implements IMessageHandler <PacketMoney, IMessage>{
@Override
public IMessage onMessage(PacketMoney message, MessageContext ctx)
{
if(ctx.netHandler instanceof NetHandlerPlayServer)
{
jobHandler prop = jobHandler.get(((NetHandlerPlayServer)ctx.netHandler).playerEntity);
prop.update(message.money, message.maxMoney);
 
}
if(ctx.netHandler instanceof NetHandlerPlayClient)
       {
jobHandler prop = jobHandler.get(getClientPlayer());
           prop.update(message.money, message.maxMoney);
          
       }
       return null;
}
   }
 
@SideOnly(Side.CLIENT)
   public static EntityPlayer getClientPlayer()
   {
   return Minecraft.getMinecraft().thePlayer;
   }
 
}