package models;

import java.util.List;

/**
 * Ingredient db model to interface with timed ingredients.
 * Created by Jack on 5/6/2015.
 */
public class MarketDB {


  /**
   * Adds a new ingredient.
   * @param market The new ingredient.
   */
  public static void addMarket(Market market) {
    market.save();
  }


  /**
   * Gets an ingredient using the name.
   * @param name The name.
   * @return the ingredient.s
   */
  public static Market getMarket(String name) {
    return Market.find().where().eq("marketName", name).findUnique();
  }

  /**
   * Get a market by id.
   * @param id The id of the market.
   * @return The market.
   */
  public static Market getMarket(long id) {
    return Market.find().byId(id);
  }

  /**
   * Get all markets.
   * @return The list of markets.
   */
  public static List<Market> getMarkets() {
    return Market.find().all();
  }
}
