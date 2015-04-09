import models.Farmer;
import models.FarmerDB;
import models.TimedIngredients;
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

    ArrayList<TimedIngredients> ingredients = new ArrayList<TimedIngredients>();
    ingredients.add(new TimedIngredients("Kale", 10, Calendar.getInstance(), Calendar.getInstance(), 1.99));
    ingredients.add(new TimedIngredients("Orange", 5, Calendar.getInstance(), Calendar.getInstance(), 2.49));
    Farmer farmer = new Farmer(1, "Nalo LIFE", "Farmer", "4303 Diamond Head Rd, Honolulu, HI", ingredients);
    FarmerDB.addFarmer(farmer);

    ArrayList<TimedIngredients> ingredients2 = new ArrayList<TimedIngredients>();
    ingredients2.add(new TimedIngredients("Celery", 100, Calendar.getInstance(), Calendar.getInstance(), 0.50));
    ingredients2.add(new TimedIngredients("Carrots", 40, Calendar.getInstance(), Calendar.getInstance(), 5.00));
    Farmer farmer2 = new Farmer(2, "Aloun Farms", "Farmer", "1050 Ala Moana Blvd Honolulu, HI", ingredients2);
    FarmerDB.addFarmer(farmer2);
  }

}
