package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Recipe database to hold all the recipe.
 * Created by Jack on 4/4/2015.
 */


public class RecipeDB {

  /**
   * The list that contains all the recipes.
   */
  public static ArrayList<Recipe> recipeList = new ArrayList<Recipe>();

  /**
   * Adds a recipe to the database.
   *
   * @param recipe The recipe.
   */
  public static void addRecipe(Recipe recipe) {
    recipeList.add(recipe);
  }

  /**
   * Gets a recipe given the id.
   *
   * @param id The farmer id.
   * @return The corresponding recipe.
   */
  public static Recipe getRecipe(int id) {
    return recipeList.get(id);
  }

  /**
   * Gets a list of all the recipes.
   *
   * @return The list of recipes.
   */
  public static List<Recipe> getRecipe() {
    return recipeList;
  }




}
