package models;

import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Model for a recipe.
 * <p>
 * Created by Jack on 4/4/2015.
 */
@Entity
public class Recipe extends Model {

  @Id
  private long id;

  /**
   * The name of the recipe.
   */
  private String name;
  /**
   * A brief description of the recipe.
   */
  private String description;
  /**
   * The list of ingredients.
   */

  @OneToMany(mappedBy = "recipe", cascade = CascadeType.PERSIST)
  private List<TimedIngredient> ingredientList;


  /**
   * The steps to make the dish.
   */
  @OneToMany(mappedBy = "recipe", cascade = CascadeType.PERSIST)
  private List<Procedure> procedure;
  /**
   * The image file name.
   */
  private String imagePath = "images/kaluaPorkWithKale.jpg";


  /**
   * The EBean ORM finder method for database queries.
   *
   * @return The finder method.
   */
  public static Finder<Long, Recipe> find() {
    return new Finder<Long, Recipe>(Long.class, Recipe.class);
  }


  /**
   /*  * Creates a recipe object.
   *
   * @param id             The ID of the recipe.
   * @param name           The name of the recipe.
   * @param description    The description of the recipe.
   * @param ingredientList The list of ingredients needed for the recipe.
   * @param procedure      The directions to create the recipe.
   * @param imagePath      The file name for the image. Defaults to place holder image.
   *//*
  public Recipe(long id, String name, String description, ArrayList<TimedIngredient> ingredientList,
                ArrayList<String> procedure, String imagePath) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.ingredientList = ingredientList;
    this.procedure = procedure;
    this.imagePath = imagePath;
  }*/

 /* *//**
   * Creates a recipe object without id. Used for debugging purposes.
   *
   * @param name           The name of the recipe.
   * @param description    The description of the recipe.
   * @param ingredientList The list of ingredients needed for the recipe.
   * @param procedure      The directions to create the recipe.
   * @param imagePath      The file name for the image. Defaults to place holder image.
   *//*
  public Recipe(String name, String description, ArrayList<TimedIngredient> ingredientList,
                ArrayList<String> procedure, String imagePath) {
    this.name = name;
    this.description = description;
    this.ingredientList = ingredientList;
    this.procedure = procedure;
    this.imagePath = imagePath;
  }*/

  /**
   * Creates a recipe object without id. Used for debugging purposes.
   *
   * @param name           The name of the recipe.
   * @param description    The description of the recipe.
   * @param ingredientList The list of ingredients needed for the recipe.
   * @param procedure      The directions to create the recipe.
   * @param imagePath      The file name for the image. Defaults to place holder image.
   */
  public Recipe(String name, String description, ArrayList<TimedIngredient> ingredientList,
                List<Procedure> procedure, String imagePath) {
    this.name = name;
    this.description = description;
    this.ingredientList = ingredientList;
    this.procedure = procedure;
    this.imagePath = imagePath;
  }


  /**
   * Gets te name of the recipe.
   *
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description of the recipe.
   *
   * @return The description.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the list of incidents of the recipe.
   *
   * @return The list of ingredients.
   */
  public List<TimedIngredient> getIngredientList() {
    return ingredientList;
  }


  /**
   * Gets the directions to cook the recipe.
   *
   * @return The procedure.
   */

  public List<Procedure> getProcedure() {

    return procedure;

  }

  /**
   * Gets the file name for the image.
   *
   * @return The image.
   */
  public String getImagePath() {
    return imagePath;
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
   * Sets the ID for the recipe. This value is generated by the RecipeDB.add function.
   *
   * @param id the id.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Sets the name.
   *
   * @param name The name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the description.
   *
   * @param description The description.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the ingredient list.
   *
   * @param ingredientList The ingredient list.
   */
  public void setIngredientList(ArrayList<TimedIngredient> ingredientList) {
    this.ingredientList = ingredientList;
  }

  /**
   * Sets the procedure's list.
   *
   * @param procedure The list of procedures.
   */
  public void setProcedure(List<Procedure> procedure) {
    this.procedure = procedure;
  }

  /**
   * Sets the image path.
   *
   * @param imagePath The image path as a string.
   */
  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }


  /**
   * Sets the ingreident list.
   *
   * @param ingredientList The ingredientlist.
   */
  public void setIngredientList(List<TimedIngredient> ingredientList) {
    this.ingredientList = ingredientList;
  }
}
