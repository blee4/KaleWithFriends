package views.loginData;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by amytakayesu on 4/6/15.
 */
public class LoginTypes {
  /**
   * Returns a map of all login types.
   *
   * @return a map of all login types.
   */
  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> loginTypes = new HashMap<>();
    loginTypes.put("Farmer", false);
    loginTypes.put("Consumer", false);
    return loginTypes;
  }

  /**
   * Checks if a string is a legal login type.
   *
   * @param type a string type.
   * @return true or false.
   */
  public static boolean isType(String type) {
    return getTypes().containsKey(type);
  }

  /**
   * Returns a map of all login types, setting type to true.
   *
   * @param type the login type to set to true.
   * @return a map of all login types.
   */
  public static Map<String, Boolean> getTypes(String type) {
    Map<String, Boolean> temp = getTypes();
    if (isType(type)) {
      temp.put(type, true);
    }
    return temp;
  }
}
