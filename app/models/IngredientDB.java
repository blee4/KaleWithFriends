package models;

/**
 * Ingredient db model to interface with timed ingredients.
 * Created by Jack on 5/6/2015.
 */
public class IngredientDB {


  /**
   * Adds a new ingredient.
   * @param timedIngredient The new ingredient.
   */
  public static void addIngredient(TimedIngredient timedIngredient) {
    timedIngredient.save();
  }


  /**
   * Gets an ingredient using the name.
   * @param name The name.
   * @return the ingredient.s
   */
  public static TimedIngredient getIngredient(String name) {
    return TimedIngredient.find().where().eq("name", name).findUnique();

  }
}
