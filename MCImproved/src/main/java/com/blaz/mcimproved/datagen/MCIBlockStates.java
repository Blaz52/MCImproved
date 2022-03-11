package com.blaz.mcimproved.datagen;

import com.blaz.mcimproved.MCImproved;
import com.blaz.mcimproved.setup.Registration;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.CustomLoaderBuilder;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;




public class MCIBlockStates extends BlockStateProvider {

    public MCIBlockStates(DataGenerator gen, ExistingFileHelper helper) {

        super(gen, MCImproved.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(Registration.ALUMINUM_ORE.get());
        simpleBlock(Registration.ALUMINUM_ORE_DEEPSLATE.get());
        simpleBlock(Registration.ALUMINUM_BLOCK.get());

        simpleBlock(Registration.PLATINUM_ORE.get());
        simpleBlock(Registration.PLATINUM_ORE_NETHER.get());
        simpleBlock(Registration.PLATINUM_ORE_DEEPSLATE.get());
        simpleBlock(Registration.PLATINUM_BLOCK.get());

    }



}