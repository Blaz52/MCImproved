package net.blaz.minecraftimproved.block;

import net.blaz.minecraftimproved.block.custom.ModFlammableRotatedPillarBlock;
import net.blaz.minecraftimproved.item.ModCreativeModeTab;
import net.blaz.minecraftimproved.minecraftimproved;
import net.blaz.minecraftimproved.item.ModItems;
import net.blaz.minecraftimproved.world.features.tree.RedwoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, minecraftimproved.MOD_ID);


    //ORE

    public static final RegistryObject<Block> CHROMIUM_BLOCK = registerBlock("chromium_block",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.METAL).strength(20f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHROMIUM_ORE = registerBlock("chromium_ore",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.METAL).strength(15f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_BLOCK = registerBlock("end_block",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.METAL).strength(80f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_ORE = registerBlock("end_ore",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.METAL).strength(40f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock("sulfur_block",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_DIRT = registerBlock("red_dirt",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> DARKAETHER_BLOCK = registerBlock("darkaether_block",
            ()  ->  new Block(BlockBehaviour.Properties.of(Material.METAL).strength(60f).requiresCorrectToolForDrops()));

    //WOOD

    public static final RegistryObject<Block> REDWOOD_LOG = registerBlock("redwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> REDWOOD_WOOD = registerBlock("redwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> REDWOOD_PLANKS = registerBlock("redwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> REDWOOD_LEAVES = registerBlock("redwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> REDWOOD_SAPLING = registerBlock("redwood_sapling",
            () -> new SaplingBlock(new RedwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));






    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));

    }  private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.MINECRAFTIMPROVED_TAB)));

    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
