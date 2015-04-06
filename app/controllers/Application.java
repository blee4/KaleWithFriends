package controllers;

import models.FarmerDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Cookbook;
import views.html.Dashboard;
import views.html.FarmersDashboard;
import views.html.FarmersProfile;
import views.html.FriendsProfile;
import views.html.Index;
import views.html.Local;
import views.html.MealPlanner;
import views.html.Dashboard;
import views.html.Recipe;
import views.loginData.LoginData;
import views.loginData.LoginTypes;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   *
   * @return The resulting home page.
   */
  public static Result index() {

    Form<LoginData> formData = Form.form(LoginData.class).bindFromRequest();
    return ok(Index.render(formData, LoginTypes.getTypes()));
  }


  /**
   * Returns the Friend's profile page.
   *
   * @return The resulting Friend's profile page.
   */
  public static Result friendsProfile() {
    return ok(FriendsProfile.render("Welcome to Friend's Profile."));
  }

  /**
   * Returns the Farmer's profile page.
   *
   * @return The resulting Farmer's profile page.
   */
  public static Result farmersProfile() {
    return ok(FarmersProfile.render(FarmerDB.getFarmers()));
  }

  /**
   * Returns the cookbook page.
   *
   * @return The resulting cookbook page.
   */
  public static Result cookbook() {
    return ok(Cookbook.render("Welcome to cookbook."));
  }

  /**
   * Returns the recipe page.
   *
   * @return The resulting recipe page.
   */
  public static Result recipe() {
    return ok(Recipe.render("Welcome to recipe."));
  }

  /**
   * Returns the local page.
   *
   * @return The resulting local page.
   */
  public static Result local() {
    return ok(Local.render("Welcome to local."));
  }

  /**
   * Returns the Meal Planner page.
   *
   * @return The resulting Meal Planner page.
   */
  public static Result mealPlanner() {
    return ok(MealPlanner.render("Welcome to Meal Planner."));
  }

  /**
   * Processes the form submitted from the Login page.
   *
   * @return The appropriate user home page
   */
  public static Result login() {
    Form<LoginData> formData = Form.form(LoginData.class).bindFromRequest();

    if (formData.hasErrors()) {
      System.out.println("Errors found.");
      return badRequest(Index.render(formData, LoginTypes.getTypes()));
    }
    else {
      LoginData data = formData.get();
      System.out.println("OK: " + data.name + " " + data.loginType);
      if (data.loginType.equals("Farmer")){
        return ok(FarmersDashboard.render(formData));

      }
      else {
        return ok(Dashboard.render(formData));
      }
    }
  }
}
