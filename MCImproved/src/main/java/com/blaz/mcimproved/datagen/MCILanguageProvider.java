package com.blaz.mcimproved.datagen;

import com.blaz.mcimproved.MCImproved;
import com.blaz.mcimproved.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;


import static com.blaz.mcimproved.setup.ModSetup.TAB_NAME;


public class MCILanguageProvider extends LanguageProvider {

    public MCILanguageProvider(DataGenerator gen, String locale) {
        super(gen, MCImproved.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "MCI");


        add(Registration.ALUMINUM_BLOCK.get(), "Block of Aluminum");
        add(Registration.ALUMINUM_ORE.get(), "Aluminum ore");
        add(Registration.ALUMINUM_ORE_DEEPSLATE.get(), "Deepslate Aluminum ore");
        add(Registration.ALUMINUM_INGOT.get(), "Aluminum Ingot");
        add(Registration.RAW_ALUMINUM.get(), "Raw Aluminum");

        add(Registration.PLATINUM_BLOCK.get(), "Block of Platinum");
        add(Registration.PLATINUM_ORE.get(), "Platinum ore");
        add(Registration.PLATINUM_ORE_DEEPSLATE.get(), "Deepslate Platinum ore");
        add(Registration.PLATINUM_INGOT.get(), "Platinum Ingot");
        add(Registration.RAW_PLATINUM.get(), "Raw Platinum");
        
    }
}