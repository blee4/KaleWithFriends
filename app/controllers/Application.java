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
   * Returns the profile page.
   * @return The resulting profile page.
   */
  public static Result profile() {
    return ok(Profile.render("Welcome to profile."));
  }

  /**
   * Returns the Friend's profile page.
   * @return The resulting Friend's profile page.
   */
  public static Result friendsProfile() {
    return ok(FriendsProfile.render("Welcome to Friend's Profile."));
  }

  /**
   * Returns the Farmer's profile page.
   * @return The resulting Farmer's profile page.
   */
  public static Result farmersProfile() {
    return ok(FarmersProfile.render("Welcome to Farmer's Profile."));
  }

  /**
   * Returns the cookbook page.
   * @return The resulting cookbook page.
   */
  public static Result cookbook() {
    return ok(Cookbook.render("Welcome to cookbook."));
  }

  /**
   * Returns the recipe page.
   * @return The resulting recipe page.
   */
  public static Result recipe() {
    return ok(Recipe.render("Welcome to recipe."));
  }

  /**
   * Returns the local page.
   * @return The resulting local page.
   */
  public static Result local() {
    return ok(Local.render("Welcome to local."));
  }

  /**
   * Returns the Meal Planner page.
   * @return The resulting Meal Planner page.
   */
  public static Result mealPlanner() {
    return ok(MealPlanner.render("Welcome to Meal Planner."));
  }

}
