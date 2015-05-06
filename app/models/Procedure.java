package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Jack on 5/5/2015.
 */
@Entity
public class Procedure extends Model {

  @Id
  private long id;

  @ManyToOne
  private Recipe recipe;

  private String procedure;


  /**
   * The EBean ORM finder method for database queries.
   *
   * @return The finder method.
   */
  public static Finder<Long, Procedure> find() {
    return new Finder<Long, Procedure>(Long.class, Procedure.class);
  }


  /**
   * Creates a procedure.
   *
   * @param procedure The proceure string.
   */
  public Procedure(String procedure) {
    this.procedure = procedure;
  }

  /**
   * Gets the id.
   *
   * @return The id.
   */
  public long getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id The id to set.
   */
  public void setId(long id) {
    this.id = id;
  }


  /**
   * Gets the procedure string.
   *
   * @return The procedure string.
   */
  public String getProcedure() {
    return procedure;
  }

  /**
   * Sets the procedure.
   *
   * @param procedure The procedure to set.
   */
  public void setProcedure(String procedure) {
    this.procedure = procedure;
  }
}
