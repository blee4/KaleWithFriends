package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the cookbook page.
 *
 */
public class CookbookPage extends FluentPage {
  private String url;

  /**
   * Create the cookbook page.
   *
   * @param webDriver The driver.
   * @param port      The port.
   */
  public CookbookPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port + "/cookbook";
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("Cookbook (Kale With Friends)");
  }



}
