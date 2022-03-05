package com.blaz.mcimproved.datagen;


import com.blaz.mcimproved.setup.Registration;
import net.minecraft.data.DataGenerator;

public class MCILootTables extends BaseLootTableProvider {

    public MCILootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {

       lootTables.put(Registration.POWERGEN.get(), createStandardTable("powergen", Registration.POWERGEN.get(), Registration.POWERGEN_BE.get()));
       lootTables.put(Registration.ALUMINUM_ORE.get(), createSilkTouchTable("aluminum_ore", Registration.ALUMINUM_ORE.get(), Registration.RAW_ALUMINUM.get(), 1, 1));
       lootTables.put(Registration.ALUMINUM_ORE_NETHER.get(), createSilkTouchTable("aluminum_ore_nether", Registration.ALUMINUM_ORE_NETHER.get(), Registration.RAW_ALUMINUM.get(), 1, 1));
       lootTables.put(Registration.ALUMINUM_ORE_DEEPSLATE.get(), createSilkTouchTable("aluminum_ore_deepslate", Registration.ALUMINUM_ORE_DEEPSLATE.get(), Registration.RAW_ALUMINUM.get(), 1, 1));
    }
}