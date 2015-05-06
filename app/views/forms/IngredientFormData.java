package views.forms;

import models.Farmer;
import models.TimedIngredient;
import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Jack on 5/6/2015.
 */
public class IngredientFormData {

    public Farmer farmer;

    public String price = "";

    public String image;

    public String name;

    public int quantity;


    public Calendar startDate;
    public Calendar endDate;

    public long id;


    /**
     * Public no arg constructor for Play.
     */
    public IngredientFormData() {
      //no arg constructor
    }

    /**
     * Creates a ingredient given a ingredient.
     *
     * @param ingredient The contact.
     */
    public IngredientFormData(TimedIngredient ingredient) {
      this.price = ingredient.getPrice();
      this.endDate = ingredient.getEndDate();
      this.startDate = ingredient.getStartDate();
      this.id = ingredient.getId();
      this.quantity = ingredient.getQuantity();
      this.image = ingredient.getImage();
    }

    /**
     * Creates a model of a contact without the id. Method used for testing purposes.
     *
     * @param firstName     The first name.
     * @param lastName      the last name.
     * @param telephone     The telephone number.
     * @param telephoneType The telephone type.
     * @param dietTypes     The diet types.
     */
    public IngredientFormData(String name, String price, int quantity, String image, Calendar startDate, Calendar endDate) {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
      this.image = image;
      this.startDate = startDate;
      this.endDate = endDate;

    }

    /**
     * Validates the form's fields.
     *
     * @return null if valid, list of errors if there are any.
     */
    public List<ValidationError> validate() {
      List<ValidationError> errors = new ArrayList<>();

      if (name == null || name.length() == 0) {
        errors.add(new ValidationError("name", "Name is required."));
      }



      return errors.isEmpty() ? null : errors;
    }
}
