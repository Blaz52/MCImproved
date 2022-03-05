package com.blaz.mcimproved.setup;

import com.blaz.mcimproved.client.PowergenScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(Registration.POWERGEN_CONTAINER.get(), PowergenScreen::new);           // Attach our container to the screen
            ItemBlockRenderTypes.setRenderLayer(Registration.POWERGEN.get(), RenderType.translucent()); // Set the render type for our power generator to translucent
        });
    }
}