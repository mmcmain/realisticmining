package realisticmining.block;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import realisticmining.general.RMLog;
import realisticmining.item.ItemBase;
import realisticmining.item.ModItems;

public class BlockHeavyOre extends BlockTileEntity<TileEntityHeavyOre>
{
	private Block dropProducer;
	private int dropMeta;
	public final static int EXPLOSION_STACK_SIZE = 2;

	
	
	public BlockHeavyOre(String name) 
	{
		super(Material.ROCK, name);

		this.dropProducer = Blocks.COBBLESTONE;
		this.dropMeta = 0;
		MinecraftForge.EVENT_BUS.register(this);
	}

	public void setDropProducer(Block block)
	{
		RMLog.info("Setting drop producer to " + block.getLocalizedName() + ".");
		this.dropProducer = block;
	}
	
	public Block getDropProducer()
	{
		return this.dropProducer;
	}

	public void setDropMeta(int dropMeta)
	{
		this.dropMeta = dropMeta;
	}

	public int getDropMeta()
	{
		return this.dropMeta;
	}

	
	@Nullable
	@Override
	public TileEntityHeavyOre createTileEntity(World world, IBlockState state)
	{
		return new TileEntityHeavyOre();
	}
	
	@Override
	public Class<TileEntityHeavyOre> getTileEntityClass()
	{
		return TileEntityHeavyOre.class;
	}

	
	@SubscribeEvent
	public void onBlockDestroyedByPlayer(BlockEvent.BreakEvent event) 
	{
		boolean isCreative = false;

		if (event.getPlayer() != null)
		{
			isCreative = event.getPlayer().isCreative();
		}
		
		RMLog.info("Checking for Creative.");
		if ( !isCreative )
		{
			RMLog.info("Not Creative.");
			boolean isMyBlock = removedByPlayer(event.getState(), event.getWorld(), event.getPos(), event.getPlayer(), false); 
			
			if ( isMyBlock )
			{
				event.setCanceled(true);
			}
			else
			{
				super.onBlockDestroyedByPlayer(event.getWorld(), event.getPos(), event.getState());
			}
		}
		else
		{
			RMLog.info("Is Creative.");
			super.onBlockDestroyedByPlayer(event.getWorld(), event.getPos(), event.getState());
		}
	
	}
	
	private IBlockState convertHeavyOreToBlock(World world, BlockPos blockPos, IBlockState blockState)
	{
		if ( blockState != null && blockState.getBlock() instanceof BlockOre )
		{
			BlockOre blockOre = (BlockOre)blockState.getBlock();
			BlockHeavyOre blockHeavyOre = blockOre.getBlockHeavyOre(); 
			world.setBlockState(blockPos, blockHeavyOre.getDefaultState());
			blockState = blockHeavyOre.getDefaultState();
		}
		return blockState;
	}
	
	@SubscribeEvent
	public void onBlockExplode(ExplosionEvent.Detonate event)
	{
	
		if (!event.getWorld().isRemote)
		{
			List<BlockPos> affectedBlocks = event.getExplosion().getAffectedBlockPositions();
			
			
			for (int i = 0; i < affectedBlocks.size(); i++)
			{
				BlockPos affectedBlock = affectedBlocks.get(i);
				IBlockState affectedBlockState = event.getWorld().getBlockState(affectedBlock);
				TileEntityHeavyOre affectedTile;

				affectedBlockState = convertHeavyOreToBlock(event.getWorld(), affectedBlock, affectedBlockState);
				affectedTile = getTileEntity(event.getWorld(), affectedBlock);

				if ( affectedBlockState != null && affectedBlockState.getBlock() instanceof BlockHeavyOre )
				{
					RMLog.info( affectedBlockState.getBlock().getLocalizedName() + " detected.");
					affectedBlocks.remove(i);
				}
				
				if ( affectedBlockState != null && affectedBlockState.getBlock() instanceof BlockHeavyOre )
				{
					RMLog.info("Detonating Tile.");

					detonateOre(event.getWorld(), affectedBlock, affectedBlockState, affectedTile);

					if (!affectedTile.hasOre())
					{
						RMLog.info("Destroying Tile.");
	
						event.getWorld().destroyBlock(affectedBlock, false);
					}
					
				}

			}
		}
	}

		
	
	@Override
	public boolean removedByPlayer(IBlockState state, 
			World world, 
			BlockPos affectedBlock, 
			EntityPlayer player,
			boolean willHarvest) 
	{
		boolean isHeaveOreBlock = false;
		IBlockState affectedBlockState = world.getBlockState(affectedBlock);
		TileEntityHeavyOre affectedTile = getTileEntity(world, affectedBlock);

		affectedBlockState = convertHeavyOreToBlock(world, affectedBlock, affectedBlockState);
		affectedTile = getTileEntity(world, affectedBlock);
		
		if ( !world.isRemote &&
				affectedTile != null && 
				affectedTile.hasOre() )
		{
			if ( affectedBlockState.getBlock() instanceof BlockHeavyOre )
			{
				isHeaveOreBlock = true;
				EntityItem item;
				BlockHeavyOre blockHeavyOre = (BlockHeavyOre) affectedBlockState.getBlock();
				int oreCount = affectedTile.produceOreFromPlayer();
				boolean canHarvest = false;
	
				if ( player != null )
				{
					ItemStack playerTool = player.inventory.getCurrentItem();
					Item playerToolItem = player.inventory.getCurrentItem().getItem();
					String requiredTool = blockHeavyOre.getHarvestTool(affectedBlockState);
					int playerToolLevel = playerToolItem.getHarvestLevel(playerTool, requiredTool, player, affectedBlockState);
					int requiredToolLevel = blockHeavyOre.getHarvestLevel(affectedBlockState);
					int toolLevelDelta = requiredToolLevel - playerToolLevel + 1;
					int toolDamage;
					float blockHardness = blockHeavyOre.getBlockHardness(affectedBlockState, world, affectedBlock);
					
						
					canHarvest = playerToolLevel >= requiredToolLevel;

					if ( toolLevelDelta < 1 )
					{
						toolLevelDelta = 1;
					}
					toolDamage = playerToolItem.getDamage(playerTool);
					toolDamage += Math.round(blockHardness * toolLevelDelta);
					playerToolItem.setDamage(playerTool, toolDamage);
				}

				if ( canHarvest  )
				{
					ItemStack itemStack = new ItemStack(blockHeavyOre.getDropProducer(), oreCount, blockHeavyOre.getDropMeta());
					
					item = new EntityItem(world, affectedBlock.getX(), affectedBlock.getY(), affectedBlock.getZ(), itemStack);
					world.spawnEntityInWorld(item);
				}
				
				if ( affectedTile != null && !affectedTile.hasOre())
				{
					isHeaveOreBlock = true;
					if ( !willHarvest )
					{
						world.destroyBlock(affectedBlock, false);
					}
				}
			}

		}
		
		
		return isHeaveOreBlock;
	}	
	
	public void detonateOre(World world, 
			BlockPos affectedBlock, 
			IBlockState affectedBlockState, 
			TileEntityHeavyOre affectedTile)
	{
		if (affectedTile.hasOre())
		{
			EntityItem item;
			BlockHeavyOre blockHeavyOre = (BlockHeavyOre) affectedBlockState.getBlock(); 

			RMLog.info("Producing " + blockHeavyOre.getDropProducer().getLocalizedName() + ".");

			ItemStack itemStack = new ItemStack(blockHeavyOre.getDropProducer(), affectedTile.produceOreFromExplosion(), blockHeavyOre.getDropMeta());
			
			item = new EntityItem(world, affectedBlock.getX(), 
					affectedBlock.getY(), affectedBlock.getZ(), itemStack);

			RMLog.info("Spawning Items.");

			world.spawnEntityInWorld(item);
		}

	}
	
	

	

}
