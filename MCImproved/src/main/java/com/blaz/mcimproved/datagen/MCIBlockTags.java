package com.blaz.mcimproved.datagen;


import com.blaz.mcimproved.MCImproved;
import com.blaz.mcimproved.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MCIBlockTags extends BlockTagsProvider {

    public MCIBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, MCImproved.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.POWERGEN.get())
                .add(Registration.ALUMINUM_ORE.get())
                .add(Registration.ALUMINUM_ORE_NETHER.get())
                .add(Registration.ALUMINUM_ORE_DEEPSLATE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.POWERGEN.get())
                .add(Registration.ALUMINUM_ORE.get())
                .add(Registration.ALUMINUM_ORE_NETHER.get())
                .add(Registration.ALUMINUM_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.ALUMINUM_ORE.get())
                .add(Registration.ALUMINUM_ORE_NETHER.get())
                .add(Registration.ALUMINUM_ORE_DEEPSLATE.get());
        tag(Registration.ALUMINUM_ORE_ALL)
                 .add(Registration.ALUMINUM_ORE.get())
                 .add(Registration.ALUMINUM_ORE_NETHER.get())
                 .add(Registration.ALUMINUM_ORE_DEEPSLATE.get());
    }

    @Override
    public String getName() {
        return "MCI Tags";
    }
}