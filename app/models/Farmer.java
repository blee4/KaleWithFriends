package models;

import java.util.ArrayList;

/**
 * Model for farmers. Contains a farmer's name, location, and their produces.
 * <p/>
 * Created by Jack on 4/4/2015.
 */
public class Farmer extends User{

  private String location;
  private ArrayList<TimedIngredient> ingredientList;



  /**
   * Creates a farmer object.
   * @param name The name of the farmer.
   * @param location The location of the farmer.
   * @param ingredientList The list of the farmer's produce.
   */
  public Farmer(long id, String name, String type, String location, ArrayList<TimedIngredient> ingredientList) {
    super(id, name, type);
    this.location = location;
    this.ingredientList = ingredientList;
  }

  /**
   * Gets the name of the farmer.
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the location of the farmer.
   * @return The location.
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the current stock of the farmer.
   * @return The list of farmer's produce.
   */
  public ArrayList<TimedIngredient> getIngredientList() {
    return ingredientList;
  }
}
