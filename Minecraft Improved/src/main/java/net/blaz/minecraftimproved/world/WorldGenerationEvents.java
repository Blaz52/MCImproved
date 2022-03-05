package net.blaz.minecraftimproved.world;

import net.blaz.minecraftimproved.minecraftimproved;
import net.blaz.minecraftimproved.world.gen.ModOreGeneration;
import net.blaz.minecraftimproved.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = minecraftimproved.MOD_ID)
public class WorldGenerationEvents {
    @SubscribeEvent
    public static void ModWorldGeneration(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);


    }
}
