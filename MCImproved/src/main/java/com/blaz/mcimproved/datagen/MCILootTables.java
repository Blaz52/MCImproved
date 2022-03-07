package com.blaz.mcimproved.datagen;


import com.blaz.mcimproved.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

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
       lootTables.put(Registration.ALUMINUM_BLOCK.get(), createSimpleTable("aluminium_block", Registration.ALUMINUM_BLOCK.get()));

       lootTables.put(Registration.PLATINUM_ORE.get(), createSilkTouchTable("platinum_ore", Registration.PLATINUM_ORE.get(), Registration.RAW_PLATINUM.get(), 1, 1));
       lootTables.put(Registration.PLATINUM_ORE_NETHER.get(), createSilkTouchTable("platinum_ore_nether", Registration.PLATINUM_ORE_NETHER.get(), Registration.RAW_PLATINUM.get(), 1, 1));
       lootTables.put(Registration.PLATINUM_ORE_DEEPSLATE.get(), createSilkTouchTable("platinum_ore_deepslate", Registration.PLATINUM_ORE_DEEPSLATE.get(), Registration.RAW_PLATINUM.get(), 1, 1));
       lootTables.put(Registration.PLATINUM_BLOCK.get(), createSimpleTable("platinum_block", Registration.PLATINUM_BLOCK.get()));
    }
}