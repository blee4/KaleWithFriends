
import assets.TimeStamp;
import models.Farmer;
import models.FarmerDB;
import models.Market;
import models.MarketDB;
import models.Procedure;
import models.Recipe;
import models.RecipeDB;
import models.TimedIngredient;
import play.Application;
import play.GlobalSettings;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Initializes application with some data.
 * Created by Jack on 4/4/2015.
 */
public class Global extends GlobalSettings {

  @Override
  public void onStart(Application application) {
    super.onStart(application);

    Market mk1 = new Market("Honolulu@Night", "Neal Blaisdell Concert Hall, 777 Ward Ave, Honolulu, HI 96814");
    Market mk2 = new Market("Kapiolani Community College Farmers Market", "Mililani High School, 95-1200 Meheula Pkwy, Mililani, HI 96789");
    Market mk3 = new Market("Farmers Market at Windward Mall", "46-056 Kamehameha Hwy, Kaneohe, HI 96744");

    // Create a few markets
    if (MarketDB.getMarkets().isEmpty()) {

      MarketDB.addMarket(mk1);
      MarketDB.addMarket(mk2);
      MarketDB.addMarket(mk3);
    }

    if (TimedIngredient.find().all().isEmpty()) {
      ArrayList<TimedIngredient> ingredients = new ArrayList<TimedIngredient>();
      ingredients.add(new TimedIngredient("Nalo Greens", 20, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "6.00", "images/ingredient/nalo_greens.jpg"));
      ingredients.add(new TimedIngredient("Dandelion Greens", 15, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "6.00", "images/ingredient/dandelion_greens.jpg"));
      ingredients.add(new TimedIngredient("Braising Greens", 13, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "6.00", "images/ingredient/braising_greens.jpg"));
      ingredients.add(new TimedIngredient("Baby Kale", 21, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/baby_kale.jpg"));
      ingredients.add(new TimedIngredient("Baby Swiss Chard", 9, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/baby_swiss_chard.png"));
      ingredients.add(new TimedIngredient("Tat Soi", 7, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/tat_soi.jpg"));
      ingredients.add(new TimedIngredient("Purslane", 5, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/purslane.jpg"));
      ingredients.add(new TimedIngredient("Okra", 5, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.50", "images/ingredient/okra.jpg"));
      ingredients.add(new TimedIngredient("Baby Eggplant", 7, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/baby_eggplant.jpg"));
      ingredients.add(new TimedIngredient("Sweet Basil", 9, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.25", "images/ingredient/sweet_basil.jpg"));
      ingredients.add(new TimedIngredient("Italian Parsley", 5, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.75", "images/ingredient/italian_parsley.jpg"));
      ingredients.add(new TimedIngredient("American Parsley", 6, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.25", "images/ingredient/american_parsley.jpg"));
      ingredients.add(new TimedIngredient("Mint", 6, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/mint.jpg"));
      ingredients.add(new TimedIngredient("Cilantro", 6, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.25", "images/ingredient/cilantro.jpg"));
      ingredients.add(new TimedIngredient("Morimoto Tomato (Small)", 13,
          TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/morimoto_tomato.jpg"));
      ingredients.add(new TimedIngredient("Nalo Tomato (Large)", 10, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "1.50", "images/ingredient/nalo_tomato.jpg"));
      ingredients.add(new TimedIngredient("Sumida Watercress", 4, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/sumida_watercress.jpg"));
      ingredients.add(new TimedIngredient("Kamiya Papaya", 10, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "3.00", "images/ingredient/kamiya_papaya.jpg"));
      ingredients.add(new TimedIngredient("Fat Law Baby Cucumber", 9,
          TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/fat_law_baby_cucumber.jpg"));
      ingredients.add(new TimedIngredient("Nozawa Corn", 10, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/nozawa_corn.jpg"));
      ingredients.add(new TimedIngredient("Ho Farm Tomato", 14, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "1.00", "images/ingredient/ho_farm_tomato.jpg"));

      // Make list of markets for farmer
      List<Market> m = new ArrayList<>();
      m.add(mk1);
      m.add(mk2);
      m.add(mk3);

      Farmer farmer = new Farmer("Nalo LIFE", "41-574 Makakalo Street Waimanalo, HI 96795",
          m,
          "808-259-7698", "images/farmPicture.jpg", ingredients, "password");
      FarmerDB.addFarmer(farmer);

      m.clear();

      ArrayList<TimedIngredient> ingredients2 = new ArrayList<TimedIngredient>();
      ingredients2.add(new TimedIngredient("Green Onions", 21, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "0.50", "images/ingredient/green_onions.jpg"));
      ingredients2.add(new TimedIngredient("Pak Choy", 14, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/pak_choy.jpg"));
      ingredients2.add(new TimedIngredient("Choy Sum", 14, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/choy_sum.jpg"));
      ingredients2.add(new TimedIngredient("Kai Choy", 13, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/kai_choy.jpg"));
      ingredients2.add(new TimedIngredient("Daikon", 17, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "1.50", "images/ingredient/daikon.jpg"));
      ingredients2.add(new TimedIngredient("Radish", 9, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "1.50", "images/ingredient/radish.jpg"));
      ingredients2.add(new TimedIngredient("Zucchini", 12, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/zucchini.jpg"));
      ingredients2.add(new TimedIngredient("Won Bok (Chinese Cabbage)", 12,
          TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/won_bok.jpg"));
      ingredients2.add(new TimedIngredient("Apple Banana", 17, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "0.45", "images/ingredient/apple_banana.jpg"));
      ingredients2.add(new TimedIngredient("Mint", 16, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/mint.jpg"));
      ingredients2.add(new TimedIngredient("Basil", 14, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.25", "images/ingredient/basil.jpg"));
      ingredients2.add(new TimedIngredient("Chives", 16, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/chives.jpg"));
      ingredients2.add(new TimedIngredient("Chinese Parsley", 19, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/chinese_parsley.jpg"));
      ingredients2.add(new TimedIngredient("American Parsley", 24, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.50", "images/ingredient/american_parsley.jpg"));
      ingredients2.add(new TimedIngredient("Lemon Grass", 11, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/lemon_grass.jpg"));
      ingredients2.add(new TimedIngredient("Shanghai Pak Choy", 21, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/shanghai_pak_choy.jpg"));
      ingredients2.add(new TimedIngredient("Ewa Sweet Onion", 14, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "0.50", "images/ingredient/ewa_sweet_onion.jpg"));
      ingredients2.add(new TimedIngredient("Eggplant (Long)", 15, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/eggplant.jpg"));
      ingredients2.add(new TimedIngredient("Japanese Cucumber", 18, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/japanese_cucumber.jpg"));
      ingredients2.add(new TimedIngredient("Long Beans", 19, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "1.00", "images/ingredient/long_beans.jpg"));
      ingredients2.add(new TimedIngredient("String Beans", 21, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "1.00", "images/ingredient/string_beans.jpg"));
      ingredients2.add(new TimedIngredient("Paria Leaf (Bitter Melon Leaf)", 5,
          TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/paria_leaf.jpg"));
      ingredients2.add(new TimedIngredient("Camote Leaf (Potato Leaf)", 4,
          TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/camote_leaf.jpg"));
      ingredients2.add(new TimedIngredient("Saluyot", 22, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "1.00", "images/ingredient/saluyot.jpg"));
      ingredients2.add(new TimedIngredient("Horenso", 14, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "1.00", "images/ingredient/horenso.jpg"));
      ingredients2.add(new TimedIngredient("Head Cabbage", 10, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "0.50", "images/ingredient/head_cabbage.jpg"));
      ingredients2.add(new TimedIngredient("Cantaloupe", 20, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "1.00", "images/ingredient/cantaloupe.jpg"));
      ingredients2.add(new TimedIngredient("Honeydew", 21, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "0.50", "images/ingredient/honeydew.jpg"));
      ingredients2.add(new TimedIngredient("Sunburst", 25, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "3.00", "images/ingredient/cantaloupe.jpg"));
      ingredients2.add(new TimedIngredient("Ewa Sweet Onion", 14, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "0.50", "images/ingredient/ewa_sweet_onion.jpg"));
      ingredients2.add(new TimedIngredient("Broccoli", 19, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/broccoli.jpg"));
      ingredients2.add(new TimedIngredient("Sweet Corn", 20, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/sweet_corn.jpg"));
      ingredients2.add(new TimedIngredient("Halloween Pumpkin", 0, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "0.50", "images/ingredient/pumpkin.jpg"));
      ingredients2.add(new TimedIngredient("Kabocha Squash", 2, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "3.00", "images/ingredient/kabocha_squash.jpg"));
      ingredients2.add(new TimedIngredient("Thai Watermelon", 7, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "0.25", "images/ingredient/thai_watermelon.jpg"));
      ingredients2.add(new TimedIngredient("Curly Kale", 9, TimeStamp.makeCalendar(2015, Calendar.APRIL, 5),
          TimeStamp.makeCalendar(2016, Calendar.MAY, 30), "2.00", "images/ingredient/curly_kale.jpg"));

      // Make list of markets for farmer
      List<Market> m2 = new ArrayList<>();
      m.add(mk2);

      Farmer farmer2 = new Farmer("Aloun Farms", "91-1440 Farrington Hwy, Kapolei, HI 96707",
          m, "808-677-9516", "images/farmPicture.jpg", ingredients2, "password");
      FarmerDB.addFarmer(farmer2);

      m.clear();
    }



    if (Recipe.find().all().isEmpty()) {
      ArrayList<TimedIngredient> saladIngredients = new ArrayList<TimedIngredient>();
      saladIngredients.add(new TimedIngredient("Baby Kale", 2));
      saladIngredients.add(new TimedIngredient("Cantaloupe", 1));
      saladIngredients.add(new TimedIngredient("Nalo Greens", 2));
      List<Procedure> saladProcedure = new ArrayList<Procedure>();
      saladProcedure.add(new Procedure("Chop, Cantaloupe, Kale, and Nalo Greens"));
      saladProcedure.add(new Procedure("Mix chopped Kale, Cantaloupe, and Nalo Greens"));
      saladProcedure.add(new Procedure("Add choice of salad dressing and enjoy."));
      Recipe kaleSalad = new Recipe("Kale Salad",
          "A very simple kale salad made from kale, nalo greens and cantaloupe.",
          saladIngredients, saladProcedure, "images/kaleSalad.jpg");
      RecipeDB.addRecipe(kaleSalad);


      ArrayList<TimedIngredient> stirFryChoySumIngredients = new ArrayList<TimedIngredient>();
      stirFryChoySumIngredients.add(new TimedIngredient("Choy Sum", 2));
      stirFryChoySumIngredients.add(new TimedIngredient("Baby Eggplant", 2));
      stirFryChoySumIngredients.add(new TimedIngredient("String Beans", 1));
      List<Procedure> stirFryChoySumProcedure = new ArrayList<Procedure>();
      stirFryChoySumProcedure.add(new Procedure("Heat wok until it smokes."));
      stirFryChoySumProcedure.add(new Procedure("Add oil and heat until it shimmers and is about to start smoking."));
      stirFryChoySumProcedure.add(new Procedure("Add ginger and garlic, stir fry until very fragrant, about forty seconds"));
      stirFryChoySumProcedure.add(new Procedure("Add choy sum, string beans, and eggplant all at once, and stir fry"
          + " very vigorously; water will escape from the greens immediately."));
      stirFryChoySumProcedure.add(new Procedure("Stir and fry until the leaves are wilted and the stems are just starting to wilt"));
      stirFryChoySumProcedure.add(new Procedure("Immediately remove from heat and "
          + "scrape into a heated serving platter and serve right away."));
      Recipe stirFryChoySum = new Recipe("Stir Fry Choy Sum",
          "A simple stir fry of choy sum, eggplant, and string beans.",
          stirFryChoySumIngredients, stirFryChoySumProcedure, "images/stirFryChoySum.jpg");
      RecipeDB.addRecipe(stirFryChoySum);

      ArrayList<TimedIngredient> orangeIngredients = new ArrayList<TimedIngredient>();
      orangeIngredients.add(new TimedIngredient("Orange", 1));
      List<Procedure> orangeProcedure = new ArrayList<Procedure>();

      orangeProcedure.add(new Procedure("Peel skin and eat."));
      Recipe orange = new Recipe("Orange", "Just an orange.", orangeIngredients,
          orangeProcedure, "images/orange.jpg");
      RecipeDB.addRecipe(orange);


      ArrayList<TimedIngredient> cornIngredients = new ArrayList<TimedIngredient>();
      cornIngredients.add(new TimedIngredient("Sweet Corn", 1));
      List<Procedure> cornProcedure = new ArrayList<>();
      cornProcedure.add(new Procedure("Husk the corn."));
      cornProcedure.add(new Procedure("Rinse the corn."));
      cornProcedure.add(new Procedure("Bring a pot of water to a boil."));
      cornProcedure.add(new Procedure("Place corn in the water."));
      cornProcedure.add(new Procedure("Wait for the water to return to a boil."));
      cornProcedure.add(new Procedure("Cook the corn for about 5 to 7 minutes or until soft."));
      cornProcedure.add(new Procedure("Remove corn from water and serve."));
      Recipe corn = new Recipe("Corn on the Cob", "Corn on the Cob!", cornIngredients,
          cornProcedure, "images/cornOnTheCob.jpg");
      RecipeDB.addRecipe(corn);

      ArrayList<TimedIngredient> mintTeaIngredients = new ArrayList<TimedIngredient>();
      mintTeaIngredients.add(new TimedIngredient("Mint", 1));
      List<Procedure> mintTeaProcedure = new ArrayList<>();
      mintTeaProcedure.add(new Procedure("Put 2 cups of water into a cooking bowl."));
      mintTeaProcedure.add(new Procedure("Rinse the mint under clean water and mix into bowl."));
      mintTeaProcedure.add(new Procedure("Boil the water until boiling."));
      mintTeaProcedure.add(new Procedure("Turn off heat and stir for 3 minutes."));
      mintTeaProcedure.add(new Procedure("Strain the leaves."));
      mintTeaProcedure.add(new Procedure("Add sugar and serve."));
      Recipe mintTea = new Recipe("Mint Tea",
          "A simple tea created with mint leaves.", mintTeaIngredients,
          mintTeaProcedure, "images/mintTea.jpg");
      RecipeDB.addRecipe(mintTea);
    }

  }

}
