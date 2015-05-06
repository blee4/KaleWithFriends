package controllers;

import models.Farmer;
import models.FarmerDB;
import models.RecipeDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.forms.IngredientFormData;
import views.html.AvailableNow;
import views.html.Cookbook;
import views.html.FarmersDashboard;
import views.html.FarmersProfile;
import views.html.Index;
import views.html.Local;
import views.html.Login;
import views.html.MealPlanner;
import views.html.NewIngredient;
import views.html.Recipe;
import views.html.SignUp;
import views.loginData.LoginData;
import views.loginData.SignUpForm;

import java.util.ArrayList;
import java.util.List;

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
    return ok(Index.render("Index", Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));

  }


  /**
   * Logs the current user out.
   *
   * @return The login page
   */
  @Security.Authenticated(Secured.class)
  public static Result logout() {
    session().clear();
    flash("success", "You've been logged out");
    return index();
  }


  /**
   * Returns the login page.
   *
   * @return The resulting sign up page.
   */
  public static Result login() {
    LoginData data = new LoginData();

    Form<LoginData> formData = Form.form(LoginData.class).fill(data);
    return ok(Login.render(formData, Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));
  }

  /**
   * Processes a login form.
   *
   * @return The user's dashboard.
   */
  public static Result postLogin() {
    Form<LoginData> formData = Form.form(LoginData.class).bindFromRequest();
    if (formData.hasErrors()) {
      System.out.println("Errors found.");
      return badRequest(Login.render(formData, Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));
    }
    LoginData data = formData.get();
    System.out.println("OK: " + data.name + " " + data.password);
    session("username", data.name);
    return redirect(routes.Application.farmersDashboard());

  }

  /**
   * Returns the sign up page.
   *
   * @return The resulting sign up page.
   */
  public static Result signUp() {
    SignUpForm data = new SignUpForm();

    Form<SignUpForm> formData = Form.form(SignUpForm.class).fill(data);
    return ok(SignUp.render(formData, Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));
  }

  /**
   * Processes a new user form.
   *
   * @return The new user's dashboard.
   */
  public static Result postSignUp() {
    Form<SignUpForm> formData = Form.form(SignUpForm.class).bindFromRequest();
    if (formData.hasErrors()) {
      System.out.println("Errors found.");
      return badRequest(SignUp.render(formData, Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));
    }
    SignUpForm data = formData.get();
    System.out.println("OK: " + data.name + " " + data.password);
    session("username", data.name);
    FarmerDB.addFarmer(new Farmer(data.name, data.location));
    return redirect(routes.Application.farmersDashboard());

  }

  /**
   * Provides the Profile page (only to authenticated users).
   *
   * @return The Profile page.
   */
  @Security.Authenticated(Secured.class)
  public static Result farmersDashboard() {
    return ok(FarmersDashboard.render(Secured.getFarmer(ctx()), Secured.isLoggedIn(ctx())));
  }

  /**
   * Returns the Farmer's profile page.
   *
   * @param name The name of the farmer.
   * @return The resulting Farmer's profile page.
   */
  public static Result farmersProfile(String name) {
    Farmer farmer = FarmerDB.getFarmer(name);
    return ok(FarmersProfile.render(farmer, Secured.isLoggedIn(ctx())));
  }

  /**
   * Returns the cookbook page.
   *
   * @return The resulting cookbook page.
   */
  public static Result cookbook() {
    //return ok(Cookbook.render(RecipeDB.getRecipe()));
    return ok(Cookbook.render(RecipeDB.getRecipe(), Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));
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

    return ok(Recipe.render(r, Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));
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

    return ok(Local.render("Welcome to local.", addresses, Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));
  }

  /**
   * Returns the Meal Planner page.
   *
   * @return The resulting Meal Planner page.
   */
  public static Result mealPlanner() {
    return ok(MealPlanner.render("Welcome to Meal Planner.", RecipeDB.getFreshRecipeList(), Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));
  }


  /**
   * Returns the available now page.
   *
   * @return The resulting available now page.
   */
  public static Result availableNow() {
    return ok(AvailableNow.render(FarmerDB.getFarmers(), Secured.isLoggedIn(ctx()), Secured.getFarmer(ctx())));
  }

  /**
   * Deletes the ingredient from the farmer's stock.
   *
   * @param farmer     the current farmer
   * @param ingredient the ingredient to delete
   * @return Result the resulting page
   */
  @Security.Authenticated(Secured.class)
  public static Result deleteIngredient(String farmer, long ingredient) {
    Farmer.deleteIngredient(farmer, ingredient);
    return ok(FarmersDashboard.render(Farmer.findFarmer(farmer), Secured.isLoggedIn(ctx())));
  }

  //public static Result editStock(TimedIngredient ingredient) {

  //
  // }

  /**
   * Adds just one quantity to the ingredient.
   *
   * @param farmer     the current farmer name
   * @param ingredient the ingredient to increment
   * @return the Dashboard with the new ingredient amount
   */
  @Security.Authenticated(Secured.class)
  public static Result addOne(String farmer, long ingredient) {

    Farmer.addOneToIngredient(farmer, ingredient);
    return ok(FarmersDashboard.render(Farmer.findFarmer(farmer), Secured.isLoggedIn(ctx())));
  }

  /**
   * Subtracts just one quantity from the ingredient.
   *
   * @param farmer     the current farmer name
   * @param ingredient the ingredient to subtract
   * @return the Dashboard with the new ingredient amount
   */
  @Security.Authenticated(Secured.class)
  public static Result subOne(String farmer, long ingredient) {
    Farmer.subtractOneToIngredient(farmer, ingredient);
    return ok(FarmersDashboard.render(Farmer.findFarmer(farmer), Secured.isLoggedIn(ctx())));
  }


  /**
   *  Retrieves the new ingredient page for a user to add a new ingredient.
   * @param farmer the current farmer name.
   * @return new ingredient page.
   */
  @Security.Authenticated(Secured.class)
  public static Result newIngredient(String farmer) {
    IngredientFormData data = new IngredientFormData();
    Form<IngredientFormData> formData = Form.form(IngredientFormData.class).fill(data);
    return ok(NewIngredient.render(formData, Secured.isLoggedIn(ctx()), Farmer.findFarmer(farmer)));
  }

  /**
   * CURRENTLY BUGGED, farmer is hard coded
   *
   * Sends a post request to add the new ingredient using the form.
   * @param farmer the current farmer name.
   * @return the new ingredient page.
   */
  @Security.Authenticated(Secured.class)
  public static Result postIngredient(String farmer) {
    System.out.println("In post Ingredient.");
    Form<IngredientFormData> formData = Form.form(IngredientFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      System.out.println("Form has errors.");
      return badRequest(NewIngredient.render(formData, Secured.isLoggedIn(ctx()), Farmer.findFarmer(farmer)));
    }
    else {
      IngredientFormData data = formData.get();
      System.out.println("Trying to add ingredient");
      Farmer.findFarmer("Aloun Farms").addIngredient(data);
      return ok(NewIngredient.render(formData, Secured.isLoggedIn(ctx()), Farmer.findFarmer(farmer)));
    }
  }
}
