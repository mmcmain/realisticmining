package realisticmining.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import realisticmining.item.ModItems;

public class TileEntityHeavyOre extends TileEntity 
{
	public static final int MAX_DROPS = 200;
	public static final int EXPLOSION_DROP_PRODUCTION = 3;
	public static final int EXPLOSION_MIN_DECREMENT = 20;
	public static final int EXPLOSION_DECREMENT_VARIANCE = 10;
	public static final int PLAYER_DROP_PRODUCTION = 1;
	public static final int PLAYER_MIN_DECREMENT = 40;
	public static final int PLAYER_DECREMENT_VARIANCE = 15;
	public static final String NBT_TAG = "oreCounter"; 
	
	
	private int oreCounter = this.MAX_DROPS;

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		compound.setInteger(this.NBT_TAG, oreCounter);
		return super.writeToNBT(compound);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		oreCounter = compound.getInteger(this.NBT_TAG);
		super.readFromNBT(compound);
	}
	

	public boolean hasOre()
	{
		return oreCounter > 0;
	}
	
	public int getCurrentOreCount()
	{
		return oreCounter;
	}
	
	public int produceOreFromExplosion()
	{
		int oresDestroyed = this.EXPLOSION_MIN_DECREMENT + this.getWorld().rand.nextInt(this.EXPLOSION_DECREMENT_VARIANCE);
		oreCounter -= oresDestroyed;
		markDirty();
		return this.EXPLOSION_DROP_PRODUCTION;
	}
	
	public int produceOreFromPlayer()
	{
		int oresDestroyed = this.PLAYER_MIN_DECREMENT + this.getWorld().rand.nextInt(this.PLAYER_DECREMENT_VARIANCE);
		oreCounter -= oresDestroyed;
		markDirty();
		return this.PLAYER_DROP_PRODUCTION;
	}
	
}
