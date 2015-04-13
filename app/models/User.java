package models;

/**
 * Model of a contact.
 * Created by amytakayesu on 3/16/15.
 */
public class User {
  String name;
  String type;
  long id;

  /**
   * Creates a contact object.
   *
   * @param name contact name
   * @param type contact type
   * @param id   contact id
   */
  public User(long id, String name, String type) {
    this.name = name;
    this.type = type;
    this.id = id;
  }

  /**
   * Gets user name.
   *
   * @return the user name.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the user name.
   *
   * @param name the user name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the user type.
   *
   * @return the user type
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the user type.
   *
   * @param type the user type
   */
  public void setType(String type) {
    this.type = type;
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

  public static boolean isName(String name) {
    if((ConsumerDB.getConsumer(name) == null) || (FarmerDB.getFarmer(name) == null)) {
      return false;
    }
    else {
      return true;
    }
  }
}
