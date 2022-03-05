package net.blaz.minecraftimproved;

import com.google.common.collect.ImmutableMap;
import net.blaz.minecraftimproved.block.ModBlocks;
import net.blaz.minecraftimproved.enchantment.ModEnchantments;
import net.blaz.minecraftimproved.entity.ModEntityTypes;
import net.blaz.minecraftimproved.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(minecraftimproved.MOD_ID)
public class minecraftimproved {
    public static final String MOD_ID = "minecraftimproved";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();


    public minecraftimproved() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModEnchantments.register(eventBus);

        ModEntityTypes.register(eventBus);


        eventBus.addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupClient(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDWOOD_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDWOOD_SAPLING.get(), RenderType.cutout());
    }

    private void setup(final FMLCommonSetupEvent event) {
     event.enqueueWork(()-> {
         AxeItem.STRIPPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPPABLES)
                 .put(ModBlocks.REDWOOD_LOG.get(), ModBlocks.STRIPPED_REDWOOD_LOG.get())
                 .put(ModBlocks.REDWOOD_WOOD.get(), ModBlocks.STRIPPED_REDWOOD_WOOD.get()).build();
     });
    }
}
