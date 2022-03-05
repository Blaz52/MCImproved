package com.blaz.mcimproved.datagen;


import com.blaz.mcimproved.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class MCIRecipes extends RecipeProvider {

    public MCIRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.ALUMINUM_ORE_ITEM_ALL),
                        Registration.ALUMINUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.ALUMINUM_ORE_ITEM_ALL))
                .save(consumer, "aluminum_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_ALUMINUM.get()),
                        Registration.ALUMINUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_raw_aluminum", has(Registration.RAW_ALUMINUM.get()))
                .save(consumer, "aluminum_ingot2");




    }
}