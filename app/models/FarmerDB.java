package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Farmer database to hold all the farmers.
 * Created by Jack on 4/4/2015.
 */


public class FarmerDB {

  /**
   * The list that contains all the farmers.
   */
  public static ArrayList<Farmer> farmerList = new ArrayList<Farmer>();

  /**
   * Adds a farmer to the database.
   *
   * @param farmer The farmer.
   */
  public static void addFarmer(Farmer farmer) {
    farmerList.add(farmer);
  }

  /**
   * Gets a farmer given the id.
   *
   * @param id The farmer id.
   * @return The corresponding farmer.
   */
  public static Farmer getFarmer(int id) {
    return farmerList.get(id);
  }

  /**
   * Gets a list of all the farmers.
   *
   * @return The list of farmers.
   */
  public static List<Farmer> getFarmers() {
    return farmerList;
  }


}
