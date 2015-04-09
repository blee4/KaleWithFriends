import models.Farmer;
import models.FarmerDB;
import models.Ingredient;
import models.Recipe;
import models.RecipeDB;
import models.TimedIngredient;
import play.Application;
import play.GlobalSettings;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Initializes application with some data.
 * Created by Jack on 4/4/2015.
 */
public class Global extends GlobalSettings {
  @Override
  public void onStart(Application application) {
    super.onStart(application);

<<<<<<< HEAD
    ArrayList<TimedIngredients> ingredients = new ArrayList<TimedIngredients>();
    ingredients.add(new TimedIngredients("Kale", 10, Calendar.getInstance(), Calendar.getInstance(), 1.99));
    ingredients.add(new TimedIngredients("Orange", 5, Calendar.getInstance(), Calendar.getInstance(), 2.49));
    Farmer farmer = new Farmer(1, "Nalo LIFE", "Farmer", "4303 Diamond Head Rd, Honolulu, HI", ingredients);
    FarmerDB.addFarmer(farmer);

    ArrayList<TimedIngredients> ingredients2 = new ArrayList<TimedIngredients>();
    ingredients2.add(new TimedIngredients("Celery", 100, Calendar.getInstance(), Calendar.getInstance(), 0.50));
    ingredients2.add(new TimedIngredients("Carrots", 40, Calendar.getInstance(), Calendar.getInstance(), 5.00));
    Farmer farmer2 = new Farmer(2, "Aloun Farms", "Farmer", "1050 Ala Moana Blvd Honolulu, HI", ingredients2);
=======
    ArrayList<TimedIngredient> ingredients = new ArrayList<TimedIngredient>();
    ingredients.add(new TimedIngredient("Kale", 10, Calendar.getInstance(), Calendar.getInstance(), 1.99));
    ingredients.add(new TimedIngredient("Tomato", 5, Calendar.getInstance(), Calendar.getInstance(), 2.49));
    Farmer farmer = new Farmer(1, "Nalo LIFE", "Farmer", "KCC Farmers Market", ingredients);
    FarmerDB.addFarmer(farmer);

    ArrayList<TimedIngredient> ingredients2 = new ArrayList<TimedIngredient>();
    ingredients2.add(new TimedIngredient("Celery", 100, Calendar.getInstance(), Calendar.getInstance(), 0.50));
    ingredients2.add(new TimedIngredient("Carrots", 40, Calendar.getInstance(), Calendar.getInstance(), 5.00));
    Farmer farmer2 = new Farmer(2, "Aloun Farms", "Farmer", "KCC Farmers Market", ingredients2);
>>>>>>> origin/Ingredients-mealplanner
    FarmerDB.addFarmer(farmer2);


    ArrayList<Ingredient> saladIngredients = new ArrayList<Ingredient>();
    saladIngredients.add(new Ingredient("Kale", 2));
    saladIngredients.add(new Ingredient("Tomato", 1));
    saladIngredients.add(new Ingredient("Oranges", 2));
    ArrayList<String> saladProcedure = new ArrayList<String>();
    saladProcedure.add("Chop Tomato and Kale");
    saladProcedure.add("Mix chopped Kale and Tomato");
    saladProcedure.add("Add choice of salad dressing and enjoy.");
    Recipe kaleSalad = new Recipe(1, "Kale Salad", saladIngredients, saladProcedure);
    RecipeDB.addRecipe(kaleSalad);


  }

}
