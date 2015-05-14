package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the Farmer's profile page.
 *
 */
public class FarmerProfilePage extends FluentPage {
  private String url;

  /**
   * Create the farmer's profile page.
   *
   * @param webDriver The driver.
   * @param port      The port.
   */
  public FarmerProfilePage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port + "/farmersprofile";
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("Farmer's Dashboard (Kale With Friends)");
  }



}
