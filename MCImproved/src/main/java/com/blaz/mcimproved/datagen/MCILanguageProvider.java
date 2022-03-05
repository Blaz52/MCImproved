package com.blaz.mcimproved.datagen;

import com.blaz.mcimproved.MCImproved;
import com.blaz.mcimproved.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.blaz.mcimproved.blocks.PowergenBlock.MESSAGE_POWERGEN;
import static com.blaz.mcimproved.blocks.PowergenBlock.SCREEN_MCI_POWERGEN;
import static com.blaz.mcimproved.setup.ModSetup.TAB_NAME;


public class MCILanguageProvider extends LanguageProvider {

    public MCILanguageProvider(DataGenerator gen, String locale) {
        super(gen, MCImproved.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "MCI");
        add(MESSAGE_POWERGEN, "%s/tick!");
        add(SCREEN_MCI_POWERGEN, "Power generator");

        add(Registration.POWERGEN.get(), "Power Generator");


        add(Registration.ALUMINUM_ORE.get(), "Aluminum ore");
        add(Registration.ALUMINUM_ORE_NETHER.get(), "Aluminum ore");
        add(Registration.ALUMINUM_ORE_DEEPSLATE.get(), "Aluminum ore");
        add(Registration.ALUMINUM_INGOT.get(), "Aluminum Ingot");
        add(Registration.RAW_ALUMINUM.get(), "Raw Aluminum");
        
    }
}