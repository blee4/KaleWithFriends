package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Recipe database to hold all the recipe.
 * Created by Jack on 4/4/2015.
 */


public class RecipeDB {

  /** The most recent index added to the list. */
  private static long currentId = 0;
  /**
   * The list that contains all the recipes.
   */
  public static ArrayList<Recipe> recipeList = new ArrayList<Recipe>();

  /**
   * Adds a recipe to the database.
   *
   * @param recipe The recipe.
   * @return The index of the item added. This should be saved for future reference.
   */
  public static long addRecipe(Recipe recipe) {
    recipeList.add(recipe);
    return currentId++;
  }

  /**
   * Gets the current id.
   * @return The current id.
   */
  public static long getCurrentId() {
    return currentId;
  }
  /**
   * Gets a recipe given the id.
   *
   * @param id The farmer id.
   * @return The corresponding recipe.
   */
  public static Recipe getRecipe(long id) {
    return recipeList.get((int) id);
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
