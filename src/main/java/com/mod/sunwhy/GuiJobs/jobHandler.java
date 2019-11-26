package com.mod.sunwhy.GuiJobs;

import com.mod.sunwhy.ModTuto;
import com.mod.sunwhy.proxy.CommonProxy;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class jobHandler implements IExtendedEntityProperties{
	
	   public final static String EXT_PROP_NAME = "ExtPropTuto";
	   
	    private final EntityPlayer player;
	 
	    public long money;
	    public long maxMoney;
		
		
		protected DataWatcher dataWatcher;

		
	
	    
	public jobHandler(EntityPlayer player) {
     this.player = player;
     this.money = 0;
     this.maxMoney = 200;

	}
     public static final void register(EntityPlayer player) {
     player.registerExtendedProperties(jobHandler.EXT_PROP_NAME,
             new jobHandler(player));
 }

 public static final jobHandler get(EntityPlayer player) {
     return (jobHandler) player.getExtendedProperties(EXT_PROP_NAME);
 
 }
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
		
		
	}
     public final void sync()
     {
         if (!player.worldObj.isRemote)
         {
             EntityPlayerMP player1 = (EntityPlayerMP) player;
             ModTuto.network21.sendTo((IMessage)new PacketMoney(), player1);
         }
         else
         {
             PacketMoney packetcaracteristique = new PacketMoney(this.maxMoney , this.money);
             ModTuto.network21.sendToServer((IMessage)new PacketMoney());
         }
     }

	private static String getSaveKey(EntityPlayer player) {
     return player.getDisplayName() + ":" + EXT_PROP_NAME;
 }
 public static void saveProxyData(EntityPlayer player) {
     jobHandler playerData = jobHandler.get(player);
     NBTTagCompound savedData = new NBTTagCompound();

     playerData.saveNBTData(savedData);
     CommonProxy.storeEntityData(getSaveKey(player), savedData);
 }

 public static void loadProxyData(EntityPlayer player) {
     jobHandler playerData = jobHandler.get(player);
     NBTTagCompound savedData = CommonProxy
             .getEntityData(getSaveKey(player));

     if (savedData != null) {
         playerData.loadNBTData(savedData);
     }
     playerData.sync();
 }
 public boolean pay(long amount) {
     boolean sufficient = amount <= this.money;

     if (sufficient) {
         this.money -= amount;
         this.sync();
     } else {
         return false;
     }

     return sufficient;
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
 public void update(long money, long maxMoney){
 	
 }
	public long getMaxMoney(long money2) {
	
		return this.maxMoney;
	}
	    
}
 
