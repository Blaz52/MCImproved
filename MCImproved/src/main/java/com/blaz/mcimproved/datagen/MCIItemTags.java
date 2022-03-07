package com.blaz.mcimproved.datagen;

import com.blaz.mcimproved.MCImproved;
import com.blaz.mcimproved.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;



public class MCIItemTags extends ItemTagsProvider {

    public MCIItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, MCImproved.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.ALUMINUM_ORE_ITEM.get())
                .add(Registration.ALUMINUM_ORE_NETHER_ITEM.get())
                .add(Registration.ALUMINUM_ORE_DEEPSLATE_ITEM.get())
                .add(Registration.PLATINUM_ORE_ITEM.get())
                .add(Registration.PLATINUM_ORE_NETHER_ITEM.get())
                .add(Registration.PLATINUM_ORE_DEEPSLATE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.ALUMINUM_INGOT.get())
                .add(Registration.PLATINUM_INGOT.get());
        tag(Registration.ALUMINUM_ORE_ITEM_ALL)
                .add(Registration.ALUMINUM_ORE_ITEM.get())
                .add(Registration.ALUMINUM_ORE_NETHER_ITEM.get())
                .add(Registration.ALUMINUM_ORE_DEEPSLATE_ITEM.get());
        tag(Registration.PLATINUM_ORE_ITEM_ALL)
                .add(Registration.PLATINUM_ORE_ITEM.get())
                .add(Registration.PLATINUM_ORE_NETHER_ITEM.get())
                .add(Registration.PLATINUM_ORE_DEEPSLATE_ITEM.get());
    }

    @Override
    public String getName() {
        return "MCI Tags";
    }
}