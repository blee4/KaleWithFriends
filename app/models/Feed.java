package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Calendar;

/**
 * Model to represent a farmer's message feed that will appear on their dashboard/news food.
 * <p>
 * Created by Jack on 5/4/2015.
 */
@Entity
public class Feed extends Model {
  private Calendar time;
  private String entry;


  @ManyToOne
  private Farmer farmer;

  @Id
  private long id;

  /**
   * The EBean ORM finder method for database queries.
   *
   * @return The finder method.
   */
  public static Finder<Long, Feed> find() {
    return new Finder<Long, Feed>(Long.class, Feed.class);
  }

  public Feed(Calendar time, String entry, Farmer farmer) {
    this.time = time;
    this.entry = entry;
    this.farmer = farmer;
  }

  public Feed(String entry, Farmer farmer) {
    time = Calendar.getInstance();
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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
