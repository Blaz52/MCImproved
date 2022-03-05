package net.blaz.minecraftimproved.datagen;


import net.blaz.minecraftimproved.minecraftimproved;
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



public class MiBlockStates extends BlockStateProvider {

    public MiBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, minecraftimproved.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerGenerator();
        registerPowergen();
        registerPortal();


    }

    private void registerPortal() {

    }

    private void registerGenerator() {

    }

    private void registerPowergen() {

    }

    private void floatingCube(BlockModelBuilder builder, float fx, float fy, float fz, float tx, float ty, float tz) {

    }

    private void createPowergenModel(Block block, BlockModelBuilder frame) {



    }
}