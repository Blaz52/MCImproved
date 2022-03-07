package com.blaz.mcimproved.datagen;


import com.blaz.mcimproved.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class MCIRecipes extends RecipeProvider {

    public MCIRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(Registration.ALUMINUM_BLOCK.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', Registration.ALUMINUM_INGOT.get())
                .group("mcimproved")
                .unlockedBy("aluminum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_BLOCK.get())
                .pattern("xxx")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', Registration.PLATINUM_INGOT.get())
                .group("mcimproved")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.ALUMINUM_ORE_ITEM_ALL),
                        Registration.ALUMINUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.ALUMINUM_ORE_ITEM_ALL))
                .save(consumer, "aluminum_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_ALUMINUM.get()),
                        Registration.ALUMINUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_raw_aluminum", has(Registration.RAW_ALUMINUM.get()))
                .save(consumer, "aluminum_ingot2");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PLATINUM_ORE_ITEM_ALL),
                        Registration.PLATINUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.PLATINUM_ORE_ITEM_ALL))
                .save(consumer, "platinum_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_PLATINUM.get()),
                        Registration.PLATINUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_raw_platinum", has(Registration.RAW_PLATINUM.get()))
                .save(consumer, "platinum_ingot2");




    }
}