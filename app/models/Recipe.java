package models;

import java.util.ArrayList;

/**
 * Model for a recipe.
 * <p/>
 * Created by Jack on 4/4/2015.
 */
public class Recipe {

  private String name;
  private ArrayList<Ingredient> ingredientList;
  private ArrayList<String> procedure;


  /**
   * Creates a recipe object.
   * @param name The name of the recipe.
   * @param ingredientList The list of ingredients needed for the recipe.
   * @param procedure The directions to create the recipe.
   */
  public Recipe(String name, ArrayList<Ingredient> ingredientList, ArrayList<String> procedure) {
    this.name = name;
    this.ingredientList = ingredientList;
    this.procedure = procedure;
  }

  /**
   * Gets te name of the recipe.
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the list of incidents of the recipe.
   * @return The list of ingredients.
   */
  public ArrayList<Ingredient> getIngredientList() {
    return ingredientList;
  }

  /**
   * Gets the directions to cook the recipe.
   * @return The procedure.
   */
  public ArrayList<String> getProcedure() {
    return procedure;
  }
}
