package net.blaz.minecraftimproved.datagen;

import net.blaz.minecraftimproved.minecraftimproved;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = minecraftimproved.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new MiRecipes(generator));
            generator.addProvider(new MiLootTables(generator));
            MiBlockTags blockTags = new MiBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new MiItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new MiBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new MiItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new MiLanguageProvider(generator, "en_us"));
        }
    }
