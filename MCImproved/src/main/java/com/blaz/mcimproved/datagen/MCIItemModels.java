package com.blaz.mcimproved.datagen;

import com.blaz.mcimproved.MCImproved;
import com.blaz.mcimproved.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MCIItemModels extends ItemModelProvider {

    public MCIItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MCImproved.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.ALUMINUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/aluminum_ore"));
        withExistingParent(Registration.ALUMINUM_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/aluminum_ore_deepslate"));
        withExistingParent(Registration.ALUMINUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/aluminum_block"));

        withExistingParent(Registration.PLATINUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/platinum_ore"));
        withExistingParent(Registration.PLATINUM_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/platinum_ore_deepslate"));
        withExistingParent(Registration.PLATINUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/platinum_block"));


        singleTexture(Registration.RAW_PLATINUM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_platinum"));
        singleTexture(Registration.PLATINUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_ingot"));

        singleTexture(Registration.RAW_ALUMINUM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_aluminum"));
        singleTexture(Registration.ALUMINUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/aluminum_ingot"));
        



    }
}