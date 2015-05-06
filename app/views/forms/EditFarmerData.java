package views.forms;

import models.Farmer;
import models.TimedIngredient;
import play.data.validation.ValidationError;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * The backend for the ingredient form data.
 * Created by Jack on 5/6/2015.
 */
public class EditFarmerData {

  private String location;
  private String pictureLocation = "images/farmPicture.jpg";
  private String markets;
  private String phone;
  private String password;
  private String name;

  @Id
  private long id;

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getPictureLocation() {
    return pictureLocation;
  }

  public void setPictureLocation(String pictureLocation) {
    this.pictureLocation = pictureLocation;
  }

  public String getMarkets() {
    return markets;
  }

  public void setMarkets(String markets) {
    this.markets = markets;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

    /**
     * Public no arg constructor for Play.
     */
    public EditFarmerData() {
      //no arg constructor
    }

  /**
   * Creates a farmer form given a farmer object.
   * @param farmer the farmer in question
   */
    public EditFarmerData(Farmer farmer) {
      this.location = farmer.getLocation();
      this.pictureLocation = farmer.getPictureLocation();
      this.markets = farmer.getMarkets();
      this.phone = farmer.getPhone();
      this.password = farmer.getPassword();
      this.name = farmer.getName();
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

      if (password == null || password.length() == 0) {
        errors.add(new ValidationError("password", "Password is required."));
      }

      return errors.isEmpty() ? null : errors;
    }
}
