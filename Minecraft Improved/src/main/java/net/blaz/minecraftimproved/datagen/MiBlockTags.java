package net.blaz.minecraftimproved.datagen;

import net.blaz.minecraftimproved.minecraftimproved;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MiBlockTags {



    public class TutBlockTags extends BlockTagsProvider {

        public TutBlockTags(DataGenerator generator, ExistingFileHelper helper) {
            super(generator, minecraftimproved.MOD_ID, helper);
        }

        @Override
        protected void addTags() {
            tag(BlockTags.MINEABLE_WITH_PICKAXE)



            tag(BlockTags.NEEDS_IRON_TOOL)


            tag(Tags.Blocks.ORES)





        }

        @Override
        public String getName() {
            return "MI Tags";
        }
    }
}
