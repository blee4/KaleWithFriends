package controllers;

import models.Consumer;
import models.ConsumerDB;
import models.Farmer;
import models.FarmerDB;
import models.RecipeDB;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.AvailableNow;
import views.html.Cookbook;
import views.html.Dashboard;
import views.html.FarmersDashboard;
import views.html.FarmersProfile;
import views.html.FriendsProfile;
import views.html.Index;
import views.html.Local;
import views.html.MealPlanner;
import views.html.Recipe;
import views.html.SignUp;
import views.loginData.LoginData;
import views.loginData.LoginTypes;
import views.loginData.SignUpForm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   *
   * @param username the current user, if there is one
   * @return The resulting home page.
   */
  public static Result index(String username) {
    if (username == null) {
      LoginData data = new LoginData();

      Form<LoginData> formData = Form.form(LoginData.class).fill(data);
      Map<String, Boolean> loginTypeMap = LoginTypes.getTypes();
      return ok(Index.render(formData, loginTypeMap));
    }
    else {
      User data = User.getUser(username);
      if (data.getType().equals("Farmer")) {
        return ok(FarmersDashboard.render(FarmerDB.getFarmer(data.getName())));
      }
      else {
        return ok(Dashboard.render(ConsumerDB.getConsumer(data.getName())));
      }
    }
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
      System.out.println("OK: " + data.name + " " + data.type);
      session("username", data.name);
      if (data.type.equals("Farmer")) {
        return ok(FarmersDashboard.render(FarmerDB.getFarmer(data.name)));
      }
      else {
        return ok(Dashboard.render(ConsumerDB.getConsumer(data.name)));
      }
    }
  }

  /**
   * Logs the current user out.
   * @return The login page
   */
  public static Result logout() {
    session().clear();
    flash("success", "You've been logged out");
    return index(null);
  }


  /**
   * Returns the sign up page.
   *
   * @return The resulting sign up page.
   */
  public static Result signUp() {
      SignUpForm data = new SignUpForm();

      Form<SignUpForm> formData = Form.form(SignUpForm.class).fill(data);
      Map<String, Boolean> loginTypeMap = LoginTypes.getTypes();
      return ok(SignUp.render(formData, loginTypeMap));
  }

  /**
   * Processes a new user form.
   * @return The new user's dashboard.
   */
  public static Result postSignUp() {
    Form<SignUpForm> formData = Form.form(SignUpForm.class).bindFromRequest();
    if (formData.hasErrors()) {
      System.out.println("Errors found.");
      return badRequest(SignUp.render(formData, LoginTypes.getTypes()));
    }
    else {
      SignUpForm data = formData.get();
      System.out.println("OK: " + data.name + " " + data.type);
      session("username", data.name);
      if (data.type.equals("Farmer")) {
        FarmerDB.addFarmer(new Farmer(data.name, data.type, data.location));
        return ok(FarmersDashboard.render(FarmerDB.getFarmer(data.name)));
      }
      else {
        ConsumerDB.addConsumer(new Consumer(data.name, data.type, data.location));
        return ok(Dashboard.render(ConsumerDB.getConsumer(data.name)));
      }
    }
  }

  /**
   * Returns the Friend's profile page.
   *
   * @return The resulting Friend's profile page.
   */
  public static Result friendsProfile() {
    return ok(FriendsProfile.render("Welcome to friend profile."));
  }

  /**
   * Returns the Farmer's profile page.
   *
   * @param name The name of the farmer.
   * @return The resulting Farmer's profile page.
   */
  public static Result farmersProfile(String name) {
    Farmer farmer = FarmerDB.getFarmer(name);
    return ok(FarmersProfile.render(farmer));
  }

  /**
   * Returns the cookbook page.
   *
   * @return The resulting cookbook page.
   */
  public static Result cookbook() {
    return ok(Cookbook.render(RecipeDB.getRecipe()));
  }

  /**
   * Returns the recipe page.
   *
   * @param id The id for the recipe.
   * @return The resulting recipe page.
   */
  public static Result recipe(long id) {
    ArrayList<models.Recipe> r = new ArrayList<>();
    r.add(RecipeDB.getRecipe(id));

    return ok(Recipe.render(r));
  }

  /**
   * Returns the local page.
   *
   * @return The resulting local page.
   */
  public static Result local() {
    List<String> addresses = new ArrayList<>();

    for (Farmer f : FarmerDB.getFarmers()) {
      addresses.add(f.getName() + "|" + f.getLocation());
    }

    return ok(Local.render("Welcome to local.", addresses));
  }

  /**
   * Returns the Meal Planner page.
   *
   * @return The resulting Meal Planner page.
   */
  public static Result mealPlanner() {
    return ok(MealPlanner.render("Welcome to Meal Planner.", RecipeDB.getFreshRecipeList()));
  }


  /**
   * Returns the available now page.
   *
   * @return The resulting available now page.
   */
  public static Result availableNow() {
    return ok(AvailableNow.render(FarmerDB.getFarmers()));
  }

  /**
   * Deletes the ingredient from the farmer's stock.
   * @param farmer the current farmer
   * @param ingredient the ingredient to delete
   * @return Result the resulting page
   */
  public static Result deleteIngredient(String farmer, String ingredient) {
    Farmer.deleteIngredient(farmer, ingredient);
    return ok(FarmersDashboard.render(Farmer.findFarmer(farmer)));
  }
}
