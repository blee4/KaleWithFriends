package models;

import java.util.List;

/**
 * Farmer database to hold all the farmers.
 * Created by Jack on 4/4/2015.
 */


public class FarmerDB {


  /**
   * Adds a farmer to the database.
   *
   * @param farmer The farmer.
   */
  public static void addFarmer(Farmer farmer) {
    farmer.save();
  }

  /**
   * Gets a farmer given the name.
   *
   * @param name The farmer name.
   * @return The corresponding farmer.
   */
  public static Farmer getFarmer(String name) {
    return Farmer.find().where().eq("name", name).findUnique();

  }

  /**
   * Gets a farmer given the id.
   *
   * @param id The farmer name.
   * @return The corresponding farmer.
   */
  public static Farmer getFarmer(long id) {
    return Farmer.find().byId(id);
  }

  /**
   * Gets a list of all the farmers.
   *
   * @return The list of farmers.
   */
  public static List<Farmer> getFarmers() {

    return Farmer.find().findList();
  }

  /**
   * Returns true if username and password are valid credentials.
   * @param username The username.
   * @param password The password.
   * @return True if username is a valid user email and password is valid for that username.
   */
  public static boolean isValid(String username, String password) {
    return ((username != null)
        &&
        (password != null)
        &&
        (getFarmer(username) != null)
        &&
        getFarmer(username).getPassword().equals(password));
  }

}
