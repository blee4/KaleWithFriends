package tests;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;
import tests.pages.FarmerProfilePage;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

/**
 * Runs a server with a fake in-memory database to test the system.
 */
public class IntegrationTest {

  /**
   * The port to be used for testing.
   */
  private final int port = 3333;


  /**
   * Check to see that both the index and page1 pages can be retrieved.
   */
  @Test
  public void test() {
    running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        browser.goTo("http://localhost:3333");
        assertThat(browser.pageSource()).contains("Kale With Friends");

        browser.goTo("http://localhost:3333/local");
        assertThat(browser.pageSource()).contains("List of Markets");

        browser.goTo("http://localhost:3333/farmersprofile");
        assertThat(browser.pageSource()).contains("Farm location");

        browser.goTo("http://localhost:3333/recipe");
        assertThat(browser.pageSource()).contains("Ingredients");

      }
    });
  }

  /**
   * Check to see that both the index page can be retrieved.
   */
  @Test
  public void testRetrieveFarmersProfilePage() {
    running(testServer(port, fakeApplication(inMemoryDatabase())), HTMLUNIT,
        new Callback<TestBrowser>() {
          public void invoke(TestBrowser browser) {
            browser.maximizeWindow();
            FarmerProfilePage farmerProfilePage = new FarmerProfilePage(browser.getDriver(), port);
            browser.goTo(farmerProfilePage);
            farmerProfilePage.isAt();
          }
        });
  }

}
