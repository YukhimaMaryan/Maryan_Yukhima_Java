package practice4.src.main.java.practice43;

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

    //*/Set user name in textbox

    public void setUserName(String strUserName) {

        loginField.sendKeys(strUserName);

    }

    //Set password in password textbox

    public void setPassword(String strPassword) {

        passwordField.sendKeys(strPassword);

    }

    public void clickLogin( ) {

        loginButton.click();

    }

    //Click on login button

    public void clickLogin2( ) {

        loginButton2.click();

    }


    public void loginTo(String strUserName, String strPasword) {

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin2();


    }

}



