package models;

import java.util.Calendar;

/**
 * Helper class to initialize a calendar object easily for determining a start and end date of an ingredient.
 * <p>
 * Created by Jack on 4/9/2015.
 */
public class IngredientDate {
  /**
   * Create a calendar object and return it with the given parameters.
   *
   * @param year  The year.
   * @param month The month.
   * @param date  The date.
   * @return The calendar object.
   */
  public static Calendar makeCalendar(int year, int month, int date) {
    Calendar c = Calendar.getInstance();
    c.set(year, month, date);
    return c;
  }
}
