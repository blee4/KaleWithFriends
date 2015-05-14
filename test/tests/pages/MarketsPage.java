package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the Markets page.
 */
public class MarketsPage extends FluentPage {
  private String url;

  /**
   * Create the Markets page.
   *
   * @param webDriver The driver.
   * @param port      The port.
   */
  public MarketsPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port + "/farmersmarkets";
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("Welcome to markets. (Kale With Friends)");
  }


}
