package controllers;

import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

/**
 * The security class for user authenticaiton.
 * Created by Amy on 5/3/2015
 */
public class Secured extends Security.Authenticator {

  @Override
  public String getUsername(Context ctx) {
    return ctx.session().get("username");
  }

  @Override
  public Result onUnauthorized(Context ctx) {
    return Application.index(null);
  }
}