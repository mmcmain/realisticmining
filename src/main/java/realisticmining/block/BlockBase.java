package realisticmining.block;

import realisticmining.RealisticMiningMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBase extends Block 
{
	protected String name;
	
	public BlockBase(Material material, String name)
	{
		super(material);
		
		this.name = name;
		
		this.setHardness(30f);
		this.setResistance(2f);
		this.setHarvestLevel("pickaxe", 1);

		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RealisticMiningMod.creativeTab);
	}

	
	public void registerItemModel(ItemBlock itemBlock)
	{
		
		RealisticMiningMod.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab)
	{
		super.setCreativeTab(tab);
		return this;
	}
}
