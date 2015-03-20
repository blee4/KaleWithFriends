package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Profile;
import views.html.FriendsProfile;
import views.html.FarmersProfile;
import views.html.Cookbook;
import views.html.Recipe;
import views.html.Local;
import views.html.MealPlanner;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns the Profile page.
   * @return The resulting Profile page.
   */
  public static Result Profile() {
    return ok(Profile.render("Welcome to Profile."));
  }

  /**
   * Returns the Friend's Profile page.
   * @return The resulting Friend's Profile page.
   */
  public static Result FriendsProfile() {
    return ok(FriendsProfile.render("Welcome to Friend's Profile."));
  }

  /**
   * Returns the Farmer's Profile page.
   * @return The resulting Farmer's Profile page.
   */
  public static Result FarmersProfile() {
    return ok(FarmersProfile.render("Welcome to Farmer's Profile."));
  }

  /**
   * Returns the Cookbook page.
   * @return The resulting Cookbook page.
   */
  public static Result Cookbook() {
    return ok(Cookbook.render("Welcome to Cookbook."));
  }

  /**
   * Returns the Recipe page.
   * @return The resulting Recipe page.
   */
  public static Result Recipe() {
    return ok(Recipe.render("Welcome to Recipe."));
  }

  /**
   * Returns the Local page.
   * @return The resulting Local page.
   */
  public static Result Local() {
    return ok(Local.render("Welcome to Local."));
  }

  /**
   * Returns the Meal Planner page.
   * @return The resulting Meal Planner page.
   */
  public static Result MealPlanner() {
    return ok(MealPlanner.render("Welcome to Meal Planner."));
  }

}
