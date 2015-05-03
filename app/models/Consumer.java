package models;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Model for consumer. Contains a consumer's name, location, and their fridge contents.
 * <p/>
 * Created by Amy on 4/12/2015.
 */
public class Consumer extends User {

  private String location;
  private String pictureLocation = "";



  /**
   * Creates a farmer object.
   * @param id The id of the farmer.
   * @param name The name of the farmer.
   * @param type The type of user. (Farmer or Consumer)
   * @param location The location of the farmer.
   */
  public Consumer(long id, String name, String type, String location) {
    super(id, name, type);
    this.location = location;
  }


  /**
   * Creates a farmer object with an associated picture location.
   * @param id The id of the farmer.
   * @param name The name of the farmer.
   * @param type The type of user. (Farmer or Consumer)
   * @param location The location of the farmer.
   * @param pictureLocation The location of the picture.
   * @param ingredientList The list of current farmer stock.
   */
  public Consumer(long id, String name, String type, String location, String pictureLocation) {
    super(id, name, type);
    this.location = location;
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
   * Gets the location for the logo/picture for the farmer.
   *
   * @return The logo/picture of the farmer as a String.
   */
  public String getPictureLocation() {
    return pictureLocation;
  }

}
