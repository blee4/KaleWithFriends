package models;

import java.util.ArrayList;

/**
 * Model for farmers. Contains a farmer's name, location, and their produces.
 * <p/>
 * Created by Jack on 4/4/2015.
 */
public class Farmer extends User {

  private String location;
  private ArrayList<TimedIngredient> ingredientList;
  private String markets;
  private String phone;


  /**
   * Creates a farmer object.
   * @param id The id of the farmer.
   * @param name The name of the farmer.
   * @param type The type of user. (Farmer or Consumer)
   * @param markets The location of the farmers markets.
   * @param phone The phone number of the farmer.
   * @param location The location of the farmer.
   * @param ingredientList The list of current farmer stock.
   */
  public Farmer(long id, String name, String type, String location,
                String markets, String phone, ArrayList<TimedIngredient> ingredientList) {
    super(id, name, type);
    this.location = location;
    this.markets = markets;
    this.phone = phone;
    this.ingredientList = ingredientList;
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
   * Gets the location of the farmer.
   *
   * @return The location.
   */
  public String getMarkets() {
    return markets;
  }

  /**
   * Gets the location of the farmer.
   *
   * @return The location.
   */
  public String getPhone() {
    return phone;
  }

  /**
   * Gets the current stock of the farmer.
   *
   * @return The list of farmer's produce.
   */
  public ArrayList<TimedIngredient> getIngredientList() {
    return ingredientList;
  }
}
