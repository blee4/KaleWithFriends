package views.loginData;

import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amytakayesu on 5/3/15.
 */
public class SignUpForm {
  /**
   * Farmer name field.
   */
  public String name;

  /**
   * Login type field.
   */
  public String type;

  /**
   * Location field.
   */
  public String location;

  public String password;

  /**
   * Default constructor.
   */
  public SignUpForm() {
  }


  /**
   * Checks for field validations.
   *
   * @return List of errors or null if there are no errors
   */
  public List<ValidationError> validate() {
    List<ValidationError> errors = new ArrayList<>();

    if (name == null) {
      errors.add(new ValidationError("name", "Please enter a username."));
    }

      return errors.isEmpty() ? null : errors;
  }

  /**
   * Gets the current user's name.
   * @return the user's name
   */
  public String getName() {
    return name;
  }

}
