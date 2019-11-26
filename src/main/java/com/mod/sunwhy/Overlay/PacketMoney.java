package com.mod.sunwhy.Overlay;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

public class PacketMoney implements IMessage {
	 
	public long maxMoney, Money;
 
	public PacketMoney() {
 
	}
 
	public PacketMoney(long maxMoney, long money) {
 
		this.maxMoney = maxMoney;
 
		this.Money = money;
 
	}
 
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
 
		buffer.writeLong(maxMoney);
 
		buffer.writeLong(Money);
 
	}
 
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
 
		this.maxMoney = buffer.readLong();
 
		this.Money = buffer.readLong();
 
	}
 
	public void handleClientSide(EntityPlayer player) {
 
		ExtendedProperties props = ExtendedProperties
 
				.get(player);
 
		props.maxMoney = this.maxMoney;
 
		props.money = this.Money;
 
	}
 
	public void handleServerSide(EntityPlayer player) {
 
		ExtendedProperties props = ExtendedProperties
 
				.get(player);
 
		props.maxMoney = this.maxMoney;
 
		props.money = this.Money;
 
	}
 
	@Override
	public void fromBytes(ByteBuf buf) {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void toBytes(ByteBuf buf) {
		// TODO Auto-generated method stub
		
	}
 
}