package com.mod.sunwhy.Overlay;


import com.mod.sunwhy.ModTuto;
import com.mod.sunwhy.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
 
public class ExtendedProperties implements IExtendedEntityProperties {
 
	public final static String EXT_PROP_NAME = "ExtProp";
 
	public final EntityPlayer player;
 
	public long money;
	public long maxMoney;
 
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
 
		properties.setLong("Money", this.money);
 
		properties.setLong("MaxMoney", this.maxMoney);
 
		compound.setTag(EXT_PROP_NAME, properties);
	}
 
	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound
 
				.getTag(EXT_PROP_NAME);
 
		this.money = properties.getLong("Money");
 
		this.maxMoney = properties.getLong("MaxMoney");
	}
 
	@Override
	public void init(Entity entity, World world) {
		// TODO Auto-generated method stub
 
	}
 
	public ExtendedProperties(EntityPlayer player) {
 
		this.player = player;
 
		this.money = 0;
 
		this.maxMoney = 2147483645;
 
	}
 
	public static final void register(EntityPlayer player) {
 
		player.registerExtendedProperties(ExtendedProperties.EXT_PROP_NAME,
 
				new ExtendedProperties(player));
 
	}
 
	public static final ExtendedProperties get(EntityPlayer player) {
 
		return (ExtendedProperties) player.getExtendedProperties(EXT_PROP_NAME);
 
	}
 
	public final void sync() {
 
		PacketMoney packetMoney = new PacketMoney(this.maxMoney, this.money);
 
		// La ligne suivante dépend de votre manière d'envoyer les packets. Celle-ci
		// vient de mon mod, je ne la changerais pas car je ne peux l'appliquer à votre
		// mod, mais elle reste bonne pour un exemple.
		
		ModTuto.network21.sendToServer(packetMoney);
 
		if (!player.worldObj.isRemote) {
 
			EntityPlayerMP player1 = (EntityPlayerMP) player;
 
			// Ici, même chose que précédemment, sauf que le packet est envoyé au player.
 
			ModTuto.network21.sendTo(packetMoney, player1);
 
		}
 
	}
 
	private static String getSaveKey(EntityPlayer player) {
 
		return player.getDisplayName() + ":" + EXT_PROP_NAME;
 
	}
 
	public static void saveProxyData(EntityPlayer player) {
 
		ExtendedProperties playerData = ExtendedProperties.get(player);
 
		NBTTagCompound savedData = new NBTTagCompound();
 
		playerData.saveNBTData(savedData);
 
		CommonProxy.storeEntityData(getSaveKey(player), savedData);
 
	}
 
	public static void loadProxyData(EntityPlayer player) {
 
		ExtendedProperties playerData = ExtendedProperties.get(player);
 
		NBTTagCompound savedData = CommonProxy
 
				.getEntityData(getSaveKey(player));
 
		if (savedData != null) {
 
			playerData.loadNBTData(savedData);
 
		}
 
		playerData.sync();
 
	}
 
	public boolean pay(long amount) {
 
		if (amount <= this.money) {
 
			this.money -= amount;
 
			this.sync();
 
		} else {
 
			return amount <= this.money;
 
		}
 
		return true;
 
	}
 
	public void addMoney(long amount) {
 
		this.money += amount;
 
		this.sync();
 
	}
 
	public long getMoney() {
 
		return this.money;
 
	}
 
	public void setMoney(long newMoney) {
 
		this.money = newMoney;
 
		this.sync();
 
	}
}