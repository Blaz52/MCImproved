package net.blaz.minecraftimproved.datagen;

import net.blaz.minecraftimproved.minecraftimproved;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;



public class MiLanguageProvider extends LanguageProvider {

    public MiLanguageProvider(DataGenerator gen, String locale) {
        super(gen, minecraftimproved.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {

    }
}