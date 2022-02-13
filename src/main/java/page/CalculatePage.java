package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalculatePage {
    @FindBy(css = "[jsname='j93WEe']")
    private WebElement buttonLeftBracket;

    @FindBy(css = "[jsname='N10B9']")
    private WebElement button1;

    @FindBy(css = "[jsname='XSr6wc']")
    private WebElement buttonPlus;

    @FindBy(css = "[jsname='lVjWed']")
    private WebElement button2;

    @FindBy(css = "[jsname='qCp9A']")
    private WebElement buttonRightBracket;

    @FindBy(css = "[jsname='YovRWb']")
    private WebElement buttonMultiplication;

    @FindBy(css = "[jsname='KN1kY']")
    private WebElement button3;

    @FindBy(css = "[jsname='pPHzQc']")
    private WebElement buttonMinus;

    @FindBy(css = "[jsname='xAP7E']")
    private WebElement button4;

    @FindBy(css = "[jsname='bkEvMb']")
    private WebElement button0;

    @FindBy(css = "[jsname='WxTTNd']")
    private WebElement buttonDivision;

    @FindBy(css = "[jsname='Ax5wH']")
    private WebElement button5;

    @FindBy(css = "[jsname='Pt8tGc']")
    private WebElement buttonEqualMark;

    @FindBy(css = "[jsname='VssY5c']")
    private WebElement result;


    public CalculatePage(WebDriver driver) {
        initElements(driver, this);
    }

    public CalculatePage clickButtonLeftBracket(){
        buttonLeftBracket.click();
        return this;
    }
    public CalculatePage clickButton1(){
        button1.click();
        return this;
    }
    public CalculatePage clickButtonPlus(){
        buttonPlus.click();
        return this;
    }

    public CalculatePage clickButton2(){
        button2.click();
        return this;
    }
    public CalculatePage clickButtonRightBracket(){
        buttonRightBracket.click();
        return this;
    }

    public CalculatePage clickButtonMultiplication(){
        buttonMultiplication.click();
        return this;
    }
    public CalculatePage clickButton3(){
        button3.click();
        return this;
    }

    public CalculatePage clickButtonMinus(){
        buttonMinus.click();
        return this;
    }

    public CalculatePage clickButton4(){
        button4.click();
        return this;
    }
    public CalculatePage clickButton0(){
        button0.click();
        return this;
    }
    public CalculatePage clickButtonDivision(){
        buttonDivision.click();
        return this;
    }
    public CalculatePage clickButton5(){
        button5.click();
        return this;
    }

    public void clickButtonEqualMark(){
        buttonEqualMark.click();
    }

    public String getResult() {
        return result.getText();
    }

}
