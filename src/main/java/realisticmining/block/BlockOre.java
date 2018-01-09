package realisticmining.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.oredict.OreDictionary;
import realisticmining.item.ItemOreDict;
import realisticmining.world.ModBiomeEntry;


public class BlockOre extends BlockBase implements ItemOreDict
{
	private String oreName;
	private BlockHeavyOre blockHeavyOre;
	
	public int minY, maxY, clumpSize, veinSize;
	
	public List<ModBiomeEntry> biomeEntries = new ArrayList();
	
	
	public BlockOre(String name, String oreName, BlockHeavyOre blockHeavyOre)
	{
		super(Material.IRON, name);
		
		this.oreName = oreName;
		this.blockHeavyOre = blockHeavyOre;
		this.minY = 16;
		this.maxY = 64;
		this.clumpSize = 5;
		this.veinSize = 25;
	}
	
	
	public int getVeinSize(Random rand)
	{
		if (rand.nextBoolean())
			return this.veinSize + rand.nextInt(this.veinSize)/2;
		else
			return this.veinSize - rand.nextInt(this.veinSize)/2;
	}

	public int getClumpSize(Random rand)
	{
		if (rand.nextBoolean())
			return this.clumpSize + rand.nextInt(this.clumpSize)/2;
		else
			return this.clumpSize - rand.nextInt(this.clumpSize)/2;
	}

	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab)
	{
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override
	public void initOreDict()
	{
		OreDictionary.registerOre(oreName, this);
	}
	

	public BlockHeavyOre getBlockHeavyOre()
	{
		return this.blockHeavyOre;
	}
	
}
