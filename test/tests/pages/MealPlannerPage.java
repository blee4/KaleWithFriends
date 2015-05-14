package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the meal planner page.
 *
 */
public class MealPlannerPage extends FluentPage {
  private String url;

  /**
   * Create the meal planner page.
   *
   * @param webDriver The driver.
   * @param port      The port.
   */
  public MealPlannerPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port + "/mealplanner";
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("Meal Planner (Kale With Friends)");
  }



}
