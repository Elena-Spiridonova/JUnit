
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


        import static org.junit.jupiter.api.Assertions.assertEquals;

public class case2 {
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
    public void test2(){
        WebElement button6 = driver.findElement(By.cssSelector("[jsname='abcgof']"));
        button6.click();
        WebElement buttonDivision = driver.findElement(By.cssSelector("[jsname='WxTTNd']"));
        buttonDivision.click();
        WebElement button0 = driver.findElement(By.cssSelector("[jsname='bkEvMb']"));
        button0.click();
        WebElement buttonEqualMark = driver.findElement(By.cssSelector("[jsname='Pt8tGc']"));
        buttonEqualMark.click();
        WebElement result = driver.findElement(By.cssSelector("[jsname='VssY5c']"));
        assertEquals(result.getText(), "Infinity");

    }
    @AfterAll
    public static void teardown() {
        driver.quit();
    }

}
