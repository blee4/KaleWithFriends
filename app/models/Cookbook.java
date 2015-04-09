package models;

import java.util.ArrayList;

/**
 * Cookbook database to hold all the recipes.
 * <p/>
 * Created by Jack on 4/4/2015.
 */
public class Cookbook {

  /**
   * The list that contains all the recipes.
   */
  public static ArrayList<Recipe> cookBook = new ArrayList<Recipe>();

  /**
   * Adds a recipe to the cookbook.
   *
   * @param recipe The recipe to add.
   */
  public static void addRecipe(Recipe recipe) {
    cookBook.add(recipe);
  }

  /**
   * The list of all recipes.
   *
   * @return The list of recipes.
   */
  public static ArrayList<Recipe> getCookBook() {
    return cookBook;
  }
}
