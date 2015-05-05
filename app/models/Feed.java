package models;

import java.util.Calendar;

/**
 * Model to represent a farmer's message feed that will appear on their dashboard/news food.
 *
 * Created by Jack on 5/4/2015.
 */
public class Feed {
  private Calendar time;
  private String entry;
  private Farmer farmer;
  private long id;

  public Feed(Calendar time, String entry, Farmer farmer) {
    this.time = time;
    this.entry = entry;
    this.farmer = farmer;
  }

  public Feed(String entry, Farmer farmer) {
    time =  Calendar.getInstance();
    this.entry = entry;
    this.farmer = farmer;
  }

  public Calendar getTime() {
    return time;
  }

  public void setTime(Calendar time) {
    this.time = time;
  }

  public String getEntry() {
    return entry;
  }

  public void setEntry(String entry) {
    this.entry = entry;
  }

  public Farmer getFarmer() {
    return farmer;
  }

  public void setFarmer(Farmer farmer) {
    this.farmer = farmer;
  }
}
