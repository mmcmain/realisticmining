package realisticmining.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static ItemBase dustHeavyIron;
	
	public static void init()
	{
		dustHeavyIron = register(new ItemOre("dustHeavyIron", "dustHeavyIron"));
	}
	
	private static <T extends Item> T register(T item)
	{
		GameRegistry.register(item);
		
		if (item instanceof ItemBase)
		{
			((ItemBase)item).registerItemModel();
		}
		
		if(item instanceof ItemOreDict)
		{
			((ItemOreDict)item).initOreDict();
		}
		
		return item;
	}
	
}
