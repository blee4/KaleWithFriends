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
    ingredients.add(new TimedIngredient("Nalo Greens", 20, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "6.00"));
    ingredients.add(new TimedIngredient("Dandelion Greens", 15, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "6.00"));
    ingredients.add(new TimedIngredient("Braising Greens", 13, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "6.00"));
    ingredients.add(new TimedIngredient("Baby Kale", 21, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Baby Swiss Chard", 9, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Tat Soi", 7, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Purslane", 5, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Okra", 5, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.50"));
    ingredients.add(new TimedIngredient("Baby Eggplant", 7, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Sweet Basil", 9, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.25"));
    ingredients.add(new TimedIngredient("Italian Parsley", 5, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.75"));
    ingredients.add(new TimedIngredient("American Parsley", 6, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.25"));
    ingredients.add(new TimedIngredient("Mint", 6, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Cilantro", 6, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.25"));
    ingredients.add(new TimedIngredient("Morimoto Tomato (Small)", 13,
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Nalo Tomato (Large)", 10, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "1.50"));
    ingredients.add(new TimedIngredient("Sumida Watercress", 4, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Kamiya Papaya", 10, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "3.00"));
    ingredients.add(new TimedIngredient("Fat Law Baby Cucumber", 9,
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Nozawa Corn", 10, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients.add(new TimedIngredient("Ho Farm Tomato", 14, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "1.00"));
    Farmer farmer = new Farmer(0, "Nalo LIFE", "Farmer", "41-574 Makakalo Street Waimanalo, HI 96795",
        "Farmers Market at Windward Mall, Honolulu@Night (Neal Blaisdell Concert Hall), "
            + "Kailua@Night (Longs Kailua Parking Structure), Farmers Market @ HMSA,"
            + " Kapiolani Community College Farmers Market, Mililani High School",
        "808-259-7698", "images/farmPicture.jpg", ingredients);
    FarmerDB.addFarmer(farmer);

    ArrayList<TimedIngredient> ingredients2 = new ArrayList<TimedIngredient>();
    ingredients2.add(new TimedIngredient("Green Onions", 21, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "0.50"));
    ingredients2.add(new TimedIngredient("Pak Choy", 14, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Choy Sum", 14, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Kai Choy", 13, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Daikon", 17, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "1.50"));
    ingredients2.add(new TimedIngredient("Radish", 9, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "1.50"));
    ingredients2.add(new TimedIngredient("Zucchini", 12, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Won Bok (Chinese Cabbage)", 12,
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Apple Banana", 17, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "0.45"));
    ingredients2.add(new TimedIngredient("Mint", 16, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Basil", 14, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.25"));
    ingredients2.add(new TimedIngredient("Chives", 16, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Chinese Parsley", 19, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("American Parsley", 24, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.50"));
    ingredients2.add(new TimedIngredient("Lemon Grass", 11, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Shanghai Pak Choy", 21, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Ewa Sweet Onion", 14, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "0.50"));
    ingredients2.add(new TimedIngredient("Eggplant (Long)", 15, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Japanese Cucumber", 18, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Long Beans", 19, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "1.00"));
    ingredients2.add(new TimedIngredient("String Beans", 21, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "1.00"));
    ingredients2.add(new TimedIngredient("Paria Leaf (Bitter Melon Leaf)", 5,
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Camote Leaf (Potato Leaf)", 4,
        IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Saluyot", 22, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "1.00"));
    ingredients2.add(new TimedIngredient("Horenso", 14, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "1.00"));
    ingredients2.add(new TimedIngredient("Head Cabbage", 10, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "0.50"));
    ingredients2.add(new TimedIngredient("Cantaloupe", 20, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "1.00"));
    ingredients2.add(new TimedIngredient("Honeydew", 21, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "0.50"));
    ingredients2.add(new TimedIngredient("Sunburst", 25, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "3.00"));
    ingredients2.add(new TimedIngredient("Ewa Sweet Onion", 14, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "0.50"));
    ingredients2.add(new TimedIngredient("Broccoli", 19, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Sweet Corn", 20, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    ingredients2.add(new TimedIngredient("Halloween Pumpkin", 0, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "0.50"));
    ingredients2.add(new TimedIngredient("Kabocha Squash", 2, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "3.00"));
    ingredients2.add(new TimedIngredient("Thai Watermelon", 7, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "0.25"));
    ingredients2.add(new TimedIngredient("Curly Kale", 9, IngredientDate.makeCalendar(2015, Calendar.APRIL, 5),
        IngredientDate.makeCalendar(2016, Calendar.MAY, 30), "2.00"));
    Farmer farmer2 = new Farmer(1, "Aloun Farms", "Farmer", "91-1440 Farrington Hwy, Kapolei, HI 96707",
        "Kapiolani Community College Farmers Market", "808-677-9516", "images/farmPicture.jpg", ingredients2);
    FarmerDB.addFarmer(farmer2);


    ArrayList<Ingredient> saladIngredients = new ArrayList<Ingredient>();
    saladIngredients.add(new Ingredient("Baby Kale", 2));
    saladIngredients.add(new Ingredient("Cantaloupe", 1));
    saladIngredients.add(new Ingredient("Nalo Greens", 2));
    ArrayList<String> saladProcedure = new ArrayList<String>();
    saladProcedure.add("Chop Cantaloupe, Kale, and Nalo Greens");
    saladProcedure.add("Mix chopped Kale, Cantaloupe, and Nalo Greens");
    saladProcedure.add("Add choice of salad dressing and enjoy.");
    Recipe kaleSalad = new Recipe(RecipeDB.getCurrentId(), "Kale Salad",
        "A very simple kale salad made from kale, nalo greens and cantaloupe.",
        saladIngredients, saladProcedure, "images/kaleSalad.jpg");
    RecipeDB.addRecipe(kaleSalad);


    ArrayList<Ingredient> stirFryChoySumIngredients = new ArrayList<Ingredient>();
    stirFryChoySumIngredients.add(new Ingredient("Choy Sum", 2));
    stirFryChoySumIngredients.add(new Ingredient("Baby Eggplant", 2));
    stirFryChoySumIngredients.add(new Ingredient("String Beans", 1));
    ArrayList<String> stirFryChoySumProcedure = new ArrayList<String>();
    stirFryChoySumProcedure.add("Heat wok until it smokes.");
    stirFryChoySumProcedure.add("Add oil and heat until it shimmers and is about to start smoking.");
    stirFryChoySumProcedure.add("Add ginger and garlic, stir fry until very fragrant, about forty seconds");
    stirFryChoySumProcedure.add("Add choy sum, string beans, and eggplant all at once, and stir fry"
       + " very vigorously; water will escape from the greens immediately.");
    stirFryChoySumProcedure.add("Stir and fry until the leaves are wilted and the stems are just starting to wilt");
    stirFryChoySumProcedure.add("Immediately remove from heat and "
        + "scrape into a heated serving platter and serve right away.");
    Recipe stirFryChoySum = new Recipe(RecipeDB.getCurrentId(), "Stir Fry Choy Sum",
        "A simple stir fry of choy sum, eggplant, and string beans.",
        stirFryChoySumIngredients, stirFryChoySumProcedure, "images/stirFryChoySum.jpg");
    RecipeDB.addRecipe(stirFryChoySum);

    ArrayList<Ingredient> orangeIngredients = new ArrayList<Ingredient>();
    orangeIngredients.add(new Ingredient("Orange", 1));
    ArrayList<String> orangeProcedure = new ArrayList<String>();
    orangeProcedure.add("Peel skin and eat.");
    Recipe orange = new Recipe(RecipeDB.getCurrentId(), "Orange", "Just an orange.", orangeIngredients,
        orangeProcedure, "images/orange.jpg");
    RecipeDB.addRecipe(orange);


    ArrayList<Ingredient> cornIngredients = new ArrayList<Ingredient>();
    cornIngredients.add(new Ingredient("Sweet Corn", 1));
    ArrayList<String> cornProcedure = new ArrayList<String>();
    cornProcedure.add("Husk the corn.");
    cornProcedure.add("Rinse the corn.");
    cornProcedure.add("Bring a pot of water to a boil.");
    cornProcedure.add("Place corn in the water.");
    cornProcedure.add("Wait for the water to return to a boil.");
    cornProcedure.add("Cook the corn for about 5 to 7 minutes or until soft.");
    cornProcedure.add("Remove corn from water and serve.");
    Recipe corn = new Recipe(RecipeDB.getCurrentId(), "Corn on the Cob", "Corn on the Cob!", cornIngredients,
        cornProcedure, "images/cornOnTheCob.jpg");
    RecipeDB.addRecipe(corn);

    ArrayList<Ingredient> mintTeaIngredients = new ArrayList<Ingredient>();
    mintTeaIngredients.add(new Ingredient("Mint", 1));
    ArrayList<String> mintTeaProcedure = new ArrayList<String>();
    mintTeaProcedure.add("Put 2 cups of water into a cooking bowl.");
    mintTeaProcedure.add("Rinse the mint under clean water and mix into bowl.");
    mintTeaProcedure.add("Boil the water until boiling.");
    mintTeaProcedure.add("Turn off heat and stir for 3 minutes.");
    mintTeaProcedure.add("Strain the leaves.");
    mintTeaProcedure.add("Add sugar and serve.");
    Recipe mintTea = new Recipe(RecipeDB.getCurrentId(), "Mint Tea", "A simple tea created with mint leaves.", mintTeaIngredients,
        mintTeaProcedure, "images/mintTea.jpg");
    RecipeDB.addRecipe(mintTea);


  }

}
