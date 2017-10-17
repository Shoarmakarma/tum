package shoarmakarma.theuselessmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import shoarmakarma.theuselessmod.objects.blocks.BlockBase;
import shoarmakarma.theuselessmod.objects.blocks.BlockOres;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_EPIDOTE = new BlockBase("block_epidote", Material.IRON);
	public static final Block ORE_EPIDOTE = new BlockBase("ore_epidote", Material.ROCK);
	
	
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	public static final Block ORE_END = new BlockOres("ore_end", "end");
}
