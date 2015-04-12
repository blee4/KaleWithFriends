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

    ArrayList<TimedIngredient> ingredients = new ArrayList<TimedIngredient>();
    ingredients.add(new TimedIngredient("Nalo Greens", 20, Calendar.getInstance(), Calendar.getInstance(), "6.00"));
    ingredients.add(new TimedIngredient("Dandelion Greens", 15, Calendar.getInstance(), Calendar.getInstance(), "6.00"));
    ingredients.add(new TimedIngredient("Braising Greens", 13, Calendar.getInstance(), Calendar.getInstance(), "6.00"));
    ingredients.add(new TimedIngredient("Baby Kale", 21, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Baby Swiss Chard", 9, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Tat Soi", 7, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Purslane", 5, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Okra", 5, Calendar.getInstance(), Calendar.getInstance(), "2.50"));
    ingredients.add(new TimedIngredient("Baby Eggplant", 7, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Sweet Basil", 9, Calendar.getInstance(), Calendar.getInstance(), "2.25"));
    ingredients.add(new TimedIngredient("Italian Parsley", 5, Calendar.getInstance(), Calendar.getInstance(), "2.75"));
    ingredients.add(new TimedIngredient("American Parsley", 6, Calendar.getInstance(), Calendar.getInstance(), "2.25"));
    ingredients.add(new TimedIngredient("Mint", 6, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Cilantro", 6, Calendar.getInstance(), Calendar.getInstance(), "2.25"));
    ingredients.add(new TimedIngredient("Morimoto Tomato (Small)", 13, Calendar.getInstance(),
        Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Nalo Tomato (Large)", 10, Calendar.getInstance(),
        Calendar.getInstance(), "1.50"));
    ingredients.add(new TimedIngredient("Sumida Watercress", 4, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Kamiya Papaya", 10, Calendar.getInstance(), Calendar.getInstance(), "3.00"));
    ingredients.add(new TimedIngredient("Fat Law Baby Cucumber", 9, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Nozawa Corn", 10, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients.add(new TimedIngredient("Ho Farm Tomato", 14, Calendar.getInstance(), Calendar.getInstance(), "1.00"));
    Farmer farmer = new Farmer(1, "Nalo LIFE", "Farmer", "41-574 Makakalo Street Waimanalo, HI 96795",
        "Farmers Market at Windward Mall, Honolulu@Night (Neal Blaisdell Concert Hall), "
            + "Kailua@Night (Longs Kailua Parking Structure), Farmers Market @ HMSA,"
            + " Kapiolani Community College Farmers Market, Mililani High School", "808-259-7698", ingredients);
    FarmerDB.addFarmer(farmer);

    ArrayList<TimedIngredient> ingredients2 = new ArrayList<TimedIngredient>();
    ingredients2.add(new TimedIngredient("Green Onions", 21, Calendar.getInstance(), Calendar.getInstance(), "0.50"));
    ingredients2.add(new TimedIngredient("Pak Choy", 14, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Choy Sum", 14, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Kai Choy", 13, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Daikon", 17, Calendar.getInstance(), Calendar.getInstance(), "1.50"));
    ingredients2.add(new TimedIngredient("Radish", 9, Calendar.getInstance(), Calendar.getInstance(), "1.50"));
    ingredients2.add(new TimedIngredient("Zucchini", 12, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Won Bok (Chinese Cabbage)", 12, Calendar.getInstance(),
        Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Apple Banana", 17, Calendar.getInstance(), Calendar.getInstance(), "0.45"));
    ingredients2.add(new TimedIngredient("Mint", 16, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Basil", 14, Calendar.getInstance(), Calendar.getInstance(), "2.25"));
    ingredients2.add(new TimedIngredient("Chives", 16, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Chinese Parsley", 19, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("American Parsley", 24, Calendar.getInstance(), Calendar.getInstance(), "2.50"));
    ingredients2.add(new TimedIngredient("Lemon Grass", 11, Calendar.getInstance(), Calendar.getInstance(),"2.00"));
    ingredients2.add(new TimedIngredient("Shanghai Pak Choy", 21, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Ewa Sweet Onion", 14, Calendar.getInstance(), Calendar.getInstance(), "0.50"));
    ingredients2.add(new TimedIngredient("Eggplant (Long)", 15, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Japanese Cucumber", 18, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Long Beans", 19, Calendar.getInstance(), Calendar.getInstance(), "1.00"));
    ingredients2.add(new TimedIngredient("String Beans", 21, Calendar.getInstance(), Calendar.getInstance(), "1.00"));
    ingredients2.add(new TimedIngredient("Paria Leaf (Bitter Melon Leaf)", 5, Calendar.getInstance(),
        Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Camote Leaf (Potato Leaf)", 4, Calendar.getInstance(),
        Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Saluyot", 22, Calendar.getInstance(), Calendar.getInstance(), "1.00"));
    ingredients2.add(new TimedIngredient("Horenso", 14, Calendar.getInstance(), Calendar.getInstance(), "1.00"));
    ingredients2.add(new TimedIngredient("Head Cabbage", 10, Calendar.getInstance(), Calendar.getInstance(), "0.50"));
    ingredients2.add(new TimedIngredient("Cantaloupe", 20, Calendar.getInstance(), Calendar.getInstance(), "1.00"));
    ingredients2.add(new TimedIngredient("Honeydew", 21, Calendar.getInstance(), Calendar.getInstance(), "0.50"));
    ingredients2.add(new TimedIngredient("Sunburst", 25, Calendar.getInstance(), Calendar.getInstance(), "3.00"));
    ingredients2.add(new TimedIngredient("Ewa Sweet Onion", 14, Calendar.getInstance(), Calendar.getInstance(), "0.50"));
    ingredients2.add(new TimedIngredient("Broccoli", 19, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Sweet Corn", 20, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    ingredients2.add(new TimedIngredient("Halloween Pumpkin", 0, Calendar.getInstance(), Calendar.getInstance(), "0.50"));
    ingredients2.add(new TimedIngredient("Kabocha Squash", 2, Calendar.getInstance(), Calendar.getInstance(), "3.00"));
    ingredients2.add(new TimedIngredient("Thai Watermelon", 7, Calendar.getInstance(), Calendar.getInstance(), "0.25"));
    ingredients2.add(new TimedIngredient("Curly Kale", 9, Calendar.getInstance(), Calendar.getInstance(), "2.00"));
    Farmer farmer2 = new Farmer(2, "Aloun Farms", "Farmer", "91-1440 Farrington Hwy, Kapolei, HI 96707",
        "Kapiolani Community College Farmers Market", "808-677-9516", ingredients2);

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
