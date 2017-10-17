package shoarmakarma.theuselessmod.world.gen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import shoarmakarma.theuselessmod.init.BlockInit;

public class WorldGenOres implements IWorldGenerator {
	private final WorldGenMinable oreGenOverworld;
	private final WorldGenMinable oreGenNether;
	private final WorldGenMinable oreGenEnd;
	
	public WorldGenOres() {
		oreGenOverworld = new WorldGenMinable(BlockInit.ORE_EPIDOTE.getDefaultState(), 20,BlockMatcher.forBlock(Blocks.STONE));
		oreGenNether = new WorldGenMinable(BlockInit.ORE_EPIDOTE.getDefaultState(), 20, BlockMatcher.forBlock(Blocks.STONE));
		oreGenEnd = new WorldGenMinable(BlockInit.ORE_EPIDOTE.getDefaultState(), 20, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkGenerator chunkGenerator, final IChunkProvider chunkProvider) {
		final BlockPos chunkPos = new BlockPos(chunkX * 16, 0, chunkZ * 16);
		
		switch(world.provider.getDimensionType()) {
		
			case OVERWORLD:
				for(int i=0;i<16;i++) {
					oreGenOverworld.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(108), random.nextInt(16)));
				}
				break;
			case NETHER:
				for(int i = 0; i < 16; i++) {
					oreGenNether.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(108) + 10, random.nextInt(16)));
				}
				break;
			case THE_END:
				for(int i = 0; i < 16; i++) {
					oreGenEnd.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(128), random.nextInt(16)));
				}
				break;
		}
	}
}
