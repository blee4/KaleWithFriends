package controllers;

import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

/**
 * A Security class for authentication.
 *
 * Created by Amy on 5/3/2015
 */
public class Secured extends Security.Authenticator {

  /**
   * Gets the current session user's username.
   * @param ctx the user session
   * @return the name of the user
   */
  @Override
  public String getUsername(Context ctx) {
    return ctx.session().get("username");
  }

  /**
   * Checks if current user has access.
   * @param ctx the user session
   * @return the resulting page if authorized
   */
  @Override
  public Result onUnauthorized(Context ctx) {
    return Application.index(null);
  }
}