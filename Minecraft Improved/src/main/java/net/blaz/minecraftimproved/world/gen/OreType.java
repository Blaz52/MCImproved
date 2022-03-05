package net.blaz.minecraftimproved.world.gen;

import net.blaz.minecraftimproved.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {

    CHROMIUM_ORE(Lazy.of(ModBlocks.CHROMIUM_ORE), 3, 1, 8, 2),
    END_ORE(Lazy.of(ModBlocks.END_ORE), 1, 1, 255, 5),
    SILVER_ORE(Lazy.of(ModBlocks.SILVER_ORE), 5, 10, 55, 6),
    SULFUR_ORE(Lazy.of(ModBlocks.SULFUR_ORE), 8, 10, 80, 8);



    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;


    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }
    public static OreType get(Block block) {
        for(OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
