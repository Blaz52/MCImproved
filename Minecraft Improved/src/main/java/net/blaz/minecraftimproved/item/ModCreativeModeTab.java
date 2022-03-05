package net.blaz.minecraftimproved.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MINECRAFTIMPROVED_TAB = new CreativeModeTab("minecraftimprovedTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHROMIUM_INGOT.get());
        }
    };
}
