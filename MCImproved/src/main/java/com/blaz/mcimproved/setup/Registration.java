package com.blaz.mcimproved.setup;


import com.blaz.mcimproved.MCImproved;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.blaz.mcimproved.MCImproved.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);



    public static void init() {
          IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
          BLOCKS.register(bus);
          ITEMS.register(bus);
          BLOCK_ENTITIES.register(bus);
          CONTAINERS.register(bus);



      }

    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);
   
    //ORES - INGOTS - BLOCKS
    //ALUMINUM
    public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> ALUMINUM_ORE_ITEM = fromBlock(ALUMINUM_ORE);
    public static final RegistryObject<Block> ALUMINUM_ORE_DEEPSLATE = BLOCKS.register("aluminum_ore_deepslate", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> ALUMINUM_ORE_DEEPSLATE_ITEM = fromBlock(ALUMINUM_ORE_DEEPSLATE);
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> ALUMINUM_BLOCK_ITEM = fromBlock(ALUMINUM_BLOCK);

    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(ITEM_PROPERTIES));

    public static final TagKey<Block> ALUMINUM_ORE1 = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(MCImproved.MODID, "aluminum_ore"));
    public static final TagKey<Item> ALUMINUM_ORE_ITEM1 = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(MCImproved.MODID, "aluminum_ore"));


    //PLATINUM
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_ORE_ITEM = fromBlock(PLATINUM_ORE);
    public static final RegistryObject<Block> PLATINUM_ORE_DEEPSLATE = BLOCKS.register("platinum_ore_deepslate", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_ORE_DEEPSLATE_ITEM = fromBlock(PLATINUM_ORE_DEEPSLATE);
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_BLOCK_ITEM = fromBlock(PLATINUM_BLOCK);

    public static final RegistryObject<Item> RAW_PLATINUM= ITEMS.register("raw_platinum", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(ITEM_PROPERTIES));

    public static final TagKey<Block> PLATINUM_ORE1 = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(MCImproved.MODID, "platinum_ore"));
    public static final TagKey<Item> PLATINUM_ORE_ITEM1 = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(MCImproved.MODID, "platinum_ore"));


    //SPECIAL



    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
