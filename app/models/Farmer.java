package models;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Model for farmers. Contains a farmer's name, location, and their produces.
 * <p/>
 * Created by Jack on 4/4/2015.
 */
public class Farmer extends User {

  private String location;
  private ArrayList<TimedIngredient> ingredientList;
  private String pictureLocation = "";


  /**
   * Creates a farmer object.
   *
   * @param id             The id of the farmer.
   * @param name           The name of the farmer.
   * @param type           The type of user. (Farmer or Consumer)
   * @param location       The location of the farmer.
   * @param ingredientList The list of produce the farmer has.
   */
  public Farmer(long id, String name, String type, String location, ArrayList<TimedIngredient> ingredientList) {
    super(id, name, type);
    this.location = location;
    this.ingredientList = ingredientList;
  }

  /**
   * Creates a farmer object with a picture location.
   *
   * @param id              The id of the farmer.
   * @param name            The name of the farmer.
   * @param type            The type of user. (Farmer or Consumer)
   * @param location        The location of the farmer.
   * @param pictureLocation The location for the farmer's logo/picture.
   * @param ingredientList  The list of produce the farmer has.
   */
  public Farmer(long id, String name, String type, String location, String pictureLocation,
                ArrayList<TimedIngredient> ingredientList) {
    super(id, name, type);
    this.location = location;
    this.ingredientList = ingredientList;
    this.pictureLocation = pictureLocation;

  }

  /**
   * Gets the name of the farmer.
   *
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the location of the farmer.
   *
   * @return The location.
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the current stock of the farmer.
   *
   * @return The list of farmer's produce.
   */
  public ArrayList<TimedIngredient> getIngredientList() {
    return ingredientList;
  }

  /**
   * Gets the location for the logo/picture for the farmer.
   *
   * @return The logo/picture of the farmer as a String.
   */
  public String getPictureLocation() {
    return pictureLocation;
  }

  /**
   * Gets the fresh ingredients the farmers has in stock.
   *
   * @return The list of fresh ingredients.
   */
  public ArrayList<TimedIngredient> getFreshIngredientList() {
    ArrayList<TimedIngredient> freshIngredients = new ArrayList<TimedIngredient>();

    for (TimedIngredient ingredient : ingredientList) {
      Calendar today = Calendar.getInstance();
      if (today.after(ingredient.getStartDate()) && today.before(ingredient.getEndDate())) {
        freshIngredients.add(ingredient);
      }
    }
    return freshIngredients;
  }
}
