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
        buildIronHorseArmorRecipe(pRecipeOutput);
        buildGoldenHouseArmorRecipe(pRecipeOutput);
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

    private void buildIronHorseArmorRecipe(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR)
                .pattern("i i")
                .pattern("iii")
                .pattern("i i")
                .define('i', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pRecipeOutput);
    }

    private void buildGoldenHouseArmorRecipe(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR)
                .pattern("g g")
                .pattern("ggg")
                .pattern("g g")
                .define('g', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pRecipeOutput);
    }

}
