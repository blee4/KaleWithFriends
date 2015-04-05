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
    ArrayList<TimedIngredients> ingredientses = new ArrayList<TimedIngredients>();
    ingredientses.add(new TimedIngredients("Kale", 10, Calendar.getInstance(), Calendar.getInstance(), 1.99));
    ingredientses.add(new TimedIngredients("Orange", 5, Calendar.getInstance(), Calendar.getInstance(), 2.49));
    Farmer farmer = new Farmer("Joe", "KCC", ingredientses);
    FarmerDB.addFarmer(farmer);
  }

}
