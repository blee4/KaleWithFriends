package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the Available Now page.
 */
public class AvailableNowPage extends FluentPage {
  private String url;

  /**
   * Create the AvailableNow page.
   *
   * @param webDriver The driver.
   * @param port      The port.
   */
  public AvailableNowPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port + "/availablenow";
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("Available Now (Kale With Friends)");
  }

}
