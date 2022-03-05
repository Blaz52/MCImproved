package com.blaz.mcimproved.datagen;

import com.blaz.mcimproved.MCImproved;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MCImproved.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new MCIRecipes(generator));
            generator.addProvider(new MCILootTables(generator));
            MCIBlockTags blockTags = new MCIBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new MCIItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new MCIBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new MCIItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new MCILanguageProvider(generator, "en_us"));
        }
    }
}