package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Farmer database to hold all the farmers.
 * Created by Jack on 4/4/2015.
 */


public class FarmerDB {

  /**
   * The list that contains all the farmers.
   */
  public static Map<String, Farmer> farmerList = new HashMap<>();

  /**
   * Adds a farmer to the database.
   *
   * @param farmer The farmer.
   */
  public static void addFarmer(Farmer farmer) {
    farmerList.put(farmer.getName(), farmer);
  }

  /**
   * Gets a farmer given the name.
   *
   * @param name The farmer name.
   * @return The corresponding farmer.
   */
  public static Farmer getFarmer(String name) {
    return farmerList.get(name);
  }

  /**
   * Gets a list of all the farmers.
   *
   * @return The list of farmers.
   */
  public static List<Farmer> getFarmers() {
    return new ArrayList(farmerList.values());
  }


}
