package models;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Model for farmers. Contains a farmer's name, location, and their produces.
 * <p/>
 * Created by Jack on 4/4/2015.
 */
public class Farmer {

  private String location;
  private ArrayList<TimedIngredient> ingredientList;
  private String pictureLocation = "images/farmPicture.jpg";
  private String markets;
  private String phone;
  private String password;
  private String name;
  private long id;



  /**
   * Creates a farmer object with default id.
   * @param name The name of the farmer.
   * @param location The location of the farmer.
   */
  public Farmer(String name, String location) {
    this.id = 0;
    this.name = name;
    this.location = location;
  }

  /**
   * Creates a farmer object.
   * @param id The id of the farmer.
   * @param name The name of the farmer.
   * @param markets The location of the farmers markets.
   * @param phone The phone number of the farmer.
   * @param location The location of the farmer.
   * @param ingredientList The list of current farmer stock.
   */
  public Farmer(long id, String name, String location,
                String markets, String phone, ArrayList<TimedIngredient> ingredientList) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.markets = markets;
    this.phone = phone;
    this.ingredientList = ingredientList;
  }


  /**
   * Creates a farmer object with an associated picture location.
   * @param id The id of the farmer.
   * @param name The name of the farmer.
   * @param markets The location of the farmers markets.
   * @param phone The phone number of the farmer.
   * @param location The location of the farmer.
   * @param pictureLocation The location of the picture.
   * @param ingredientList The list of current farmer stock.
   */
  public Farmer(long id, String name, String location,
                String markets, String phone, String pictureLocation, ArrayList<TimedIngredient> ingredientList) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.markets = markets;
    this.phone = phone;
    this.ingredientList = ingredientList;
    this.pictureLocation = pictureLocation;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
   * @param ingredient the TimedIngredient name
   * @return i the TimedIngredient object
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
      throw new RuntimeException("TimedIngredient cannot be found.");
    }
    f.ingredientList.remove(i);
  }

  /**
   * Adds an ingredient to this farmer's ingredient list.
   * @param ingredient the ingredient to add
   * @param amount the amount of ingredient to add
   * @param start the start date of the ingredient to add
   * @param end the end date of the ingredient to add
   *
   */
  public void addIngredient(String ingredient, int amount, Calendar start, Calendar end, String price) {
    TimedIngredient i = new TimedIngredient(ingredient,amount,start,end,price);
    if (!ingredientList.contains(i)) {
      ingredientList.add(i);
    }
    else {
      throw new RuntimeException("TimedIngredient already exists in farmer's ingredient list.");
    }
  }

  //methods below are originally from the obsolete class

  /**
   * Sets the user name.
   *
   * @param name the user name
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Gets the user id.
   *
   * @return the user id
   */
  public long getId() {
    return id;
  }

  /**
   * Sets the user id.
   *
   * @param id the user id.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Checks if a user with a specified name exists.
   * @param name The username to check for
   * @return true or false if the name exists
   */
  public static boolean isName(String name) {
    if ((FarmerDB.getFarmer(name) == null)) {
      return false;
    }
    else {
      return true;
    }
  }

  /**
   * Gets a user given its name.
   * @param name The name of the user
   * @return The user object
   */
  public static Farmer getFarmer(String name) {
    if (isName(name)) {
      return FarmerDB.getFarmer(name);
    }
    else {
      return null;
    }
  }
}
