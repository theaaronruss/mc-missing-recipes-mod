package com.theaaronrussell.missingrecipes.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        buildSaddleRecipe(pRecipeOutput);
        buildNameTagRecipe(pRecipeOutput);
    }

    private void buildSaddleRecipe(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, Items.SADDLE)
                .pattern("lll")
                .pattern("lll")
                .pattern(" i ")
                .define('l', Items.LEATHER)
                .define('i', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(pRecipeOutput);
    }

    private void buildNameTagRecipe(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.NAME_TAG)
                .pattern("spi")
                .define('s', Items.STRING)
                .define('p', Items.PAPER)
                .define('i', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .save(pRecipeOutput);
    }

}
