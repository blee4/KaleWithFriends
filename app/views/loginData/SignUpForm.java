package views.loginData;

import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amytakayesu on 5/3/15.
 */
public class SignUpForm {
  /**
   * User name field.
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
    if (type == null || !LoginTypes.isType(type)) {
      errors.add(new ValidationError("loginType", "Login type is invalid."));
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
