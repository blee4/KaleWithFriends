package views.loginData;

import models.User;
import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amytakayesu on 4/6/15.
 */
public class LoginData {
  /**
   * User name field.
   */
  public String name;

  /**
   * Login type field.
   */
  public String type;


  /**
   * Default constructor.
   */
  public LoginData() {
  }

  /**
   * Constructor using existing login.
   *
   * @param user existing contact
   */
  public LoginData(User user) {
    this.type = user.getType();
    this.name = user.getName();
  }


  /**
   * Checks for field validations.
   *
   * @return List of errors or null if there are no errors
   */
  public List<ValidationError> validate() {
    List<ValidationError> errors = new ArrayList<>();

    if(name == null || !User.isName(name)) {
      errors.add(new ValidationError("name", "Username is invalid."));
    }
    if (type == null || !LoginTypes.isType(type)) {
      errors.add(new ValidationError("loginType", "Login type is invalid."));
    }
      return errors.isEmpty() ? null : errors;
  }

  public String getName() {
    return name;
  }

}
