
package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import page.CalculatePage;
import page.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorTest {
    private static WebDriver driver;
    private static CalculatePage calculatePage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("http://google.com");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.search("Калькулятор");
        calculatePage = new CalculatePage(driver);
    }
    @Test
    public void test3(){
        calculatePage.clickButtonSin()
                .clickButtonEqualMark();
                assertEquals(calculatePage.getResult(), "Error");
    }
    @AfterAll
    public static void teardown() {
        driver.quit();
    }

}
