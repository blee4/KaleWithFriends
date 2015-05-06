package models;

import java.util.List;

/**
 * Procedure database to hold all the procedures.
 * Created by Jack on 4/4/2015.
 */


public class ProcedureDB {

  /**
   * Adds a recipe to the database.
   *
   * @param procedure The procedure to be added.
   */
  public static void addProcedure(Procedure procedure) {
    procedure.save();
  }

  /**
   * Gets a procedure given the id.
   *
   * @param id The procedure id.
   * @return The corresponding procedure.
   */
  public static Procedure getProcedure(long id) {
    return Procedure.find().byId(id);
  }

  /**
   * Gets a list of procedures for a given recipe.
   *
   * @param recipe The recipe name.
   * @return The list of procedures.
   */
  public static List<Procedure> getProcedureForRecipe(String recipe) {
    return Procedure.find().where().eq("recipe", recipe).findList();
  }



}
