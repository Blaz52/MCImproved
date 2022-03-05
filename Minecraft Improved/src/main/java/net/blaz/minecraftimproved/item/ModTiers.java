package net.blaz.minecraftimproved.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier SILVER = new ForgeTier(2, 600, 6F, 2.5F, 12, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.SILVER_INGOT.get()));
    public static final ForgeTier CHROMIUM = new ForgeTier(4, 3000, 9F, 4F, 15, Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.CHROMIUM_INGOT.get()));
    public static final ForgeTier END = new ForgeTier(5, 5000, 10F, 6F, 20, Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.END_INGOT.get()));






        }
