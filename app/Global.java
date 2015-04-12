import models.Farmer;
import models.FarmerDB;
import models.Ingredient;
import models.IngredientDate;
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

    ArrayList<TimedIngredient> ingredients = new ArrayList<TimedIngredient>();
    ingredients.add(new TimedIngredient("Kale", 10, IngredientDate.makeCalendar(2015, Calendar.APRIL, 8),
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 10), 1.99));
    ingredients.add(new TimedIngredient("Orange", 5, IngredientDate.makeCalendar(2015, Calendar.APRIL, 8),
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 20), 2.49));
    Farmer farmer = new Farmer(0, "Nalo LIFE", "Farmer", "4303 Diamond Head Rd, Honolulu, HI", "images/farmPicture.jpg", ingredients);
    FarmerDB.addFarmer(farmer);

    ArrayList<TimedIngredient> ingredients2 = new ArrayList<TimedIngredient>();
    ingredients2.add(new TimedIngredient("Celery", 100, IngredientDate.makeCalendar(2015, Calendar.APRIL, 1),
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 10), 0.50));
    ingredients2.add(new TimedIngredient("Carrot", 40, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 7), 5.00));
    ingredients2.add(new TimedIngredient("Green Apple", 40, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 19), 3.00));
    Farmer farmer2 = new Farmer(1, "Aloun Farms", "Farmer", "1050 Ala Moana Blvd Honolulu, HI", "images/farmPicture.jpg", ingredients2);
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
