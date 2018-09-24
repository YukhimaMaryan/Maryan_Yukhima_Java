package practice44;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public ProductPage correctLogin(String username, String password) {
        clickLogin();
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        clickLogin2();
        return new ProductPage(driver);
    }


    @FindBy(how = How.XPATH, using = "/html/body/app/main/login/div/div/div/div/div/button")
    public WebElement loginButton;

    @FindBy(how = How.ID, using = "email")
    public WebElement loginField;

    @FindBy(how = How.ID, using = "userPassword")
    public WebElement passwordField;

    @FindBy(how = How.XPATH, using = "/html/body/app/main/login/div/div/div[2]/div/div/div[3]/button")
    public WebElement loginButton2;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String strUserName) {

        loginField.sendKeys(strUserName);

    }


    public void setPassword(String strPassword) {

        passwordField.sendKeys(strPassword);

    }

    public void clickLogin( ) {

        loginButton.click();

    }


    public void clickLogin2( ) {

        loginButton2.click();

    }


    public void loginTo(String strUserName, String strPasword) {


        this.setUserName(strUserName);


        this.setPassword(strPasword);


        this.clickLogin2();


    }

}



