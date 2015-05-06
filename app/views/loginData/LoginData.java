package views.loginData;

import models.Farmer;
import models.FarmerDB;
import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amytakayesu on 4/6/15.
 */
public class LoginData {
  /**
   * Farmer name field.
   */
  public String name;

  /**
   * Login type field.
   */
  public String password;


  /**
   * Default constructor.
   */
  public LoginData() {
  }

  /**
   * Constructor using existing login.
   *
   * @param farmer existing contact
   */
  public LoginData(Farmer farmer) {
    this.name = farmer.getName();
    this.password = farmer.getPassword();
  }



  /**
   * Validates Form
   * Called automatically in the controller by bindFromRequest().
   * Checks to see that email and password are valid credentials.
   * @return Null if valid, or a List[ValidationError] if problems found.
   */
  public List<ValidationError> validate() {

    List<ValidationError> errors = new ArrayList<>();

    if (!FarmerDB.isValid(name, password)) {
      errors.add(new ValidationError("name", "Invalid"));
      errors.add(new ValidationError("password", "Invalid"));
    }

    return (errors.size() > 0) ? errors : null;
  }

  /**
   * Gets the current user's name.
   * @return The user's name
   */
  public String getName() {
    return name;
  }

}
