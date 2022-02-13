package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SearchPage {
    @FindBy(css = "input[title='Поиск']")
    private WebElement searchField;

    public SearchPage(WebDriver driver) {
        initElements(driver, this);
    }

    public void search(String text) {
        searchField.sendKeys(text, Keys.ENTER);
    }
}



