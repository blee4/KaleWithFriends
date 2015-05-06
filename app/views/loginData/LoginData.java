package views.loginData;

import models.Farmer;
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
   * Checks for field validations.
   *
   * @return List of errors or null if there are no errors
   */
  public List<ValidationError> validate() {
    List<ValidationError> errors = new ArrayList<>();
    if (name == null || !Farmer.isName(name)) {
      errors.add(new ValidationError("name", "Username is invalid."));
    }
    if (!password.equals(Farmer.getFarmer(name).getPassword())) {
      errors.add(new ValidationError("password", "Password is invalid."));
    }
    return errors.isEmpty() ? null : errors;
  }

  /**
   * Gets the current user's name.
   * @return The user's name
   */
  public String getName() {
    return name;
  }

}
