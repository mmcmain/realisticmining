package realisticmining;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import realisticmining.block.ModBlocks;
import realisticmining.item.ModItems;

public class RealisticMiningTab extends CreativeTabs
{

	public RealisticMiningTab()
	{
		super(RealisticMiningMod.modId);
	}
	
	
	@Override
	public Item getTabIconItem() 
	{
		return ModItems.dustHeavyIron;
	}

}
