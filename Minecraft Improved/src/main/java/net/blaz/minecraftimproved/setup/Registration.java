package net.blaz.minecraftimproved.setup;

import net.blaz.minecraftimproved.block.custom.ModFlammableRotatedPillarBlock;
import net.blaz.minecraftimproved.item.ModCreativeModeTab;
import net.blaz.minecraftimproved.item.ModItems;
import net.blaz.minecraftimproved.minecraftimproved;
import net.blaz.minecraftimproved.world.features.tree.RedwoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
        import net.minecraft.tags.BlockTags;
        import net.minecraft.tags.ItemTags;
        import net.minecraft.world.entity.EntityType;
        import net.minecraft.world.entity.MobCategory;
        import net.minecraft.world.inventory.MenuType;
        import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
        import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
        import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
        import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ForgeSpawnEggItem;
        import net.minecraftforge.common.Tags;
        import net.minecraftforge.common.extensions.IForgeMenuType;
        import net.minecraftforge.eventbus.api.IEventBus;
        import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
        import net.minecraftforge.registries.DeferredRegister;
        import net.minecraftforge.registries.ForgeRegistries;
        import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, minecraftimproved.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, minecraftimproved.MOD_ID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, minecraftimproved.MOD_ID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, minecraftimproved.MOD_ID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, minecraftimproved.MOD_ID);
    private static final DeferredRegister<StructureFeature<?>> STRUCTURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, minecraftimproved.MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
        CONTAINERS.register(bus);
        ENTITIES.register(bus);
        STRUCTURES.register(bus);
    }

    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(minecraftimproved);



}

