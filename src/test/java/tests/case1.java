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
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class case1 {
    private static WebDriver driver;


    @BeforeAll
public static void init() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("http://google.com");
        WebElement searchInput = driver.findElement(By.cssSelector("input[title='Поиск']"));
        searchInput.sendKeys("Калькулятор");
        searchInput.sendKeys(Keys.ENTER);
}

    @Test
    public void test1(){
       WebElement buttonLeftBracket = driver.findElement(By.cssSelector("[jsname='j93WEe']"));
       buttonLeftBracket.click();
        WebElement button1 = driver.findElement(By.cssSelector("[jsname='N10B9']"));
        button1.click();
        WebElement buttonPlus = driver.findElement(By.cssSelector("[jsname='XSr6wc']"));
        buttonPlus.click();
        WebElement button2 = driver.findElement(By.cssSelector("[jsname='lVjWed']"));
        button2.click();
        WebElement buttonRightBracket = driver.findElement(By.cssSelector("[jsname='qCp9A']"));
        buttonRightBracket.click();
        WebElement buttonMultiplication = driver.findElement(By.cssSelector("[jsname='YovRWb']"));
        buttonMultiplication.click();
        WebElement button3 = driver.findElement(By.cssSelector("[jsname='KN1kY']"));
        button3.click();
        WebElement buttonMinus = driver.findElement(By.cssSelector("[jsname='pPHzQc']"));
        buttonMinus.click();
        WebElement button4 = driver.findElement(By.cssSelector("[jsname='xAP7E']"));
        WebElement button0 = driver.findElement(By.cssSelector("[jsname='bkEvMb']"));
        button4.click();
        button0.click();
        WebElement buttonDivision = driver.findElement(By.cssSelector("[jsname='WxTTNd']"));
        buttonDivision.click();
        WebElement button5 = driver.findElement(By.cssSelector("[jsname='Ax5wH']"));
        button5.click();
        WebElement buttonEqualMark = driver.findElement(By.cssSelector("[jsname='Pt8tGc']"));
        buttonEqualMark.click();
        WebElement result = driver.findElement(By.cssSelector("[jsname='VssY5c']"));
        assertEquals(result.getText(), "1");

    }
@AfterAll
    public static void teardown() {
    driver.quit();
}

}
