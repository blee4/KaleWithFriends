package models;

/**
 * Created by Jack on 5/6/2015.
 */
public class IngredientDB {



  public static void addIngredient(TimedIngredient timedIngredient) {
    timedIngredient.save();
  }


  public static TimedIngredient getIngredient(String name) {
    return TimedIngredient.find().where().eq("name", name).findUnique();

  }
}
