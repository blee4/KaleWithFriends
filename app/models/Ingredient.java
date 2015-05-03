package models;

/**
 * Model for Ingredients.
 * <p/>
 * Created by Jack on 4/4/2015.
 */
public class Ingredient {

  protected String name;
  protected int quantity;

  /**
   * Creates an ingredient object.
   *
   * @param name     The name of the ingreident.
   * @param quantity The quantity of the ingredient.
   */
  public Ingredient(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  /**
   * Gets the name of the ingredient.
   *
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the quantity of the ingredient.
   *
   * @return The quantity.
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * Adds an amount to the quantity.
   * @param add The amount of stock to add.
   */
  public void addQuantity(int add) {
    quantity = quantity + add;
  }

  /**
   * Subtracts an amount from the quantity
   * @param sub The amount of stock to subtract.
   */
  public void subtractQuantity(int sub) {
    if(quantity - sub >= 0) {
      quantity = quantity - sub;
    }
    else {
      throw new RuntimeException("You cannot have a negative amount of stock.");
    }
  }
}
