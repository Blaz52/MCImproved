package net.blaz.minecraftimproved.datagen;


import net.blaz.minecraftimproved.minecraftimproved;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MiItemModels extends ItemModelProvider {

    public MiItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, minecraftimproved.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


    }
}