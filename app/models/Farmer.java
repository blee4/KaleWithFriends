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
  private String markets;
  private String phone;



  /**
   * Creates a farmer object.
   * @param name The name of the farmer.
   * @param type The type of user. (Farmer or Consumer)
   * @param location The location of the farmer.
   */
  public Farmer(String name, String type, String location) {
    super(0, name, type);
    this.location = location;
  }

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
   * Creates a farmer object with an associated picture location.
   * @param id The id of the farmer.
   * @param name The name of the farmer.
   * @param type The type of user. (Farmer or Consumer)
   * @param markets The location of the farmers markets.
   * @param phone The phone number of the farmer.
   * @param location The location of the farmer.
   * @param pictureLocation The location of the picture.
   * @param ingredientList The list of current farmer stock.
   */
  public Farmer(long id, String name, String type, String location,
                String markets, String phone, String pictureLocation, ArrayList<TimedIngredient> ingredientList) {
    super(id, name, type);
    this.location = location;
    this.markets = markets;
    this.phone = phone;
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

  /**
   * Finds and returns a Farmer based on a name. Null if not found.
   * @param farmer the Farmer name.
   * @return f the Farmer object
   */
  public static Farmer findFarmer(String farmer) {
    for (Farmer f : FarmerDB.getFarmers()) {
      if (f.getName().equals(farmer)) {
        return f;
      }
    }
    return null;
  }

  /**
   * Finds and returns a Farmer's TimedIngredient based on a name. Null if not found.
   * @param ingredient the Ingredient name
   * @return i the Ingredient object
   */
  public TimedIngredient findIngredient(String ingredient) {
    for (TimedIngredient i : ingredientList) {
      if (i.getName().equals(ingredient)) {
        return i;
      }
    }
    return null;
  }

  /**
   * Deletes an ingredient from this farmer's ingredient list.
   * @param farmer the farmer whose ingredient is being deleted
   * @param ingredient the ingredient to delete
   */
  public static void deleteIngredient(String farmer, String ingredient) {
    Farmer f = findFarmer(farmer);
    if (f == null) {
      throw new RuntimeException("Farmer cannot be found.");
    }
    TimedIngredient i = f.findIngredient(ingredient);
    if (i == null) {
      throw new RuntimeException("Ingredient cannot be found.");
    }
    f.ingredientList.remove(i);
  }

  /**
   * Adds an ingredient to this farmer's ingredient list.
   * @param ingredient the ingredient to delete
   */
  public void addIngredient(String ingredient) {
    TimedIngredient i = findIngredient(ingredient);
    if (i == null) {
      throw new RuntimeException("Ingredient cannot be found.");
    }
    if (!ingredientList.contains(i)) {
      ingredientList.add(i);
    }
    else {
      throw new RuntimeException("Ingredient already exists in farmer's ingredient list.");
    }
  }
}
