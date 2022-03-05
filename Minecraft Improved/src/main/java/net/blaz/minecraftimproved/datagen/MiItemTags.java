package net.blaz.minecraftimproved.datagen;

mport net.minecraft.data.DataGenerator;
import net.blaz.minecraftimproved.minecraftimproved;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MiItemTags extends ItemTagsProvider {

    public MiItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, minecraftimproved.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)

        tag(Tags.Items.INGOTS)



    }

    @Override
    public String getName() {
        return "MI Tags";
    }
}