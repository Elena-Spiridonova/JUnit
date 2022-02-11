package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class case1 {
   @Test

    public void test1(){
      System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
      driver.get("http://google.com");
       WebElement searchInput = driver.findElement(By.cssSelector("input[title]"));
       searchInput.sendKeys("Калькулятор");
       driver.quit();


    }


}
