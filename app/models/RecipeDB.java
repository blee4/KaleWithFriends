package models;

import assets.IngredientsToRecipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Recipe database to hold all the recipe.
 * Created by Jack on 4/4/2015.
 */


public class RecipeDB {

  /**
   * Adds a recipe to the database.
   *
   * @param recipe The recipe.
   * @return The index of the item added. This should be saved for future reference.
   */
  public static void addRecipe(Recipe recipe) {
    recipe.save();
  }

  /**
   * Gets a recipe given the id.
   *
   * @param id The Recipe id.
   * @return The corresponding recipe.
   */
  public static Recipe getRecipe(long id) {
    return Recipe.find().byId(id);
  }

  /**
   * Gets a list of all the recipes.
   *
   * @return The list of recipes.
   */
  public static List<Recipe> getRecipe() {

    return Recipe.find().findList();
  }

  /**
   * Gets a list of recipes that is currently available with fresh ingredients.
   * @return The list of recipes that can be made with fresh ingredients.
   */
  public static List<Recipe> getFreshRecipeList() {
    List<TimedIngredient> freshIngredients = new ArrayList<TimedIngredient>();
    List<Recipe> freshRecipeList;

    for (Farmer farmer : FarmerDB.getFarmers()) {
      for (TimedIngredient ingredient : farmer.getFreshIngredientList()) {
        freshIngredients.add(ingredient);
      }
    }

    freshRecipeList = IngredientsToRecipe.getRecipesFromIngredients(freshIngredients);
    return freshRecipeList;
  }
}
