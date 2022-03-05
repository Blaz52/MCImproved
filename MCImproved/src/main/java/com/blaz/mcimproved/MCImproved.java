package com.blaz.mcimproved;

import com.blaz.mcimproved.setup.ClientSetup;
import com.blaz.mcimproved.setup.ModSetup;
import com.blaz.mcimproved.setup.Registration;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("mcimproved")
public class MCImproved {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "mcimproved";

    public MCImproved() {

        Registration.init();


        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));


    }
}

