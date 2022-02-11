package tests;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class case1 {
    private static WebDriver driver;

    @BeforeAll
public static void init() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
}

    @Test
    public void test1(){
        driver.get("http://google.com");
       WebElement searchInput = driver.findElement(By.cssSelector("input[title='Поиск']"));
       searchInput.sendKeys("Калькулятор");
       searchInput.sendKeys(Keys.ENTER);
       WebElement button = driver.findElement(By.cssSelector("[jsname='j93WEe']"));
       button.click();


    }
@AfterAll
    public static void teardown() {
    driver.quit();
}

}
