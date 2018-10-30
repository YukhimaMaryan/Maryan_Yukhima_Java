/*
Prepare testing application for portal http://.com/ use your own credentials provided

        Testing application should contai at least following tests:

        Verify that user with valid credentials can login into site
        Verify that user with invalid credentials cannot login into site.
        Please count several cases - when username is invalid and password valid, empty or oversized string.
        Verify that product can be created and all product attributes are correctly recorded
        Please count that some fields are optional and some are required. One can`t submit when required attributes are not filled in
        Use the features that special green bubble message appears on success, and red colored message appears when required fields are not filled
        Verify that product can be edited (each property can be changes and changes are correctly recorded)
        Please count that some fields are optional and some are required. One can`t submit when required attributes are not filled in
        Use the features that special green bubble message appears on success, and red colored message appears when required fields are not filled
        Verify that product can be successfully deleted
        After deletion verify that product does not appear in the list
        Use the features that special green bubble message appears on success
        Important features

        Use TestNG for writing tests
        Use TestNGs data provider feature where applicable
        Tests should run with maven from commandline
        Enable multibrowser testing (use factory method). Browser name can be passed via environment variable or surefire plugin configuration or in testng.xml
        Use PageObject/PageFactory pattern
        Page object constructor should wait on specific element on the page
        Use Allure reporter to report steps and tests
        Store a screenshot on test failure (should be integrated into Allure report)
        Don't use Thread.sleep(), use fluent wait instead
*/


        package TestApp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class App {

    WebDriver driver;

    LoginPage logpage;


    @BeforeSuite
    public void setUp( ) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http:/.com/login");
        logpage = new LoginPage(driver);
        /*   WebElement loginButton = driver.findElement(By.xpath("/html/body/app/main/login/div/div/div/div/div/button"));*/
        /*loginButton.click();*/
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    /*    @Optional({username})*/
    @Parameters({"username", "incorrectpassword"})
    @Test(priority = 4)
    public void LoginNoOK(String username, String incorrectpassword) {
        LoginPage lp = new LoginPage(driver);
        Error er = lp.incorrectLogin(username, incorrectpassword);

    }

    @Parameters({"username", "password"})
    @Test(priority = 1)
    public void loginOK(String username, String password) {

        LoginPage lp = new LoginPage(driver);
        ProductPage pp = lp.correctLogin(username, password);
    }

    @Test(priority = 2)
    public void AddProduct( ) throws InterruptedException {


        AdminPage adminPage = new AdminPage(driver);
        adminPage.adminButton.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("/html/body/app/main/administration/div[2]/div/div/projects/div/div[1]/div[1]/div[3]/div/div/a/span[2]")));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        actions.click();
//      actions.sendKeys(" ");
        actions.build().perform();

        adminPage.adProduct.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        Actions actions2 = new Actions(driver);
        actions2.moveToElement(driver.findElement(new By.ByClassName("form-horizontal")));
        actions2.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//      actions.sendKeys(" ");
        actions2.build().perform();

        Actions actions3 = new Actions(driver);
        actions3.sendKeys("Product_5");
        actions3.build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Actions actions4 = new Actions(driver);
        actions4.moveToElement(driver.findElement(new By.ByClassName("dropdown")));
        actions4.click();
//      actions.sendKeys(" ");
        actions4.build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Actions actions5 = new Actions(driver);
        actions5.sendKeys("Product Family 1");
        actions5.build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Actions actions6 = new Actions(driver);
        actions6.click();
        actions6.build().perform();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test(priority = 3)
    public void deleteProduct( ) throws InterruptedException {
    AdminPage adminPage = new AdminPage(driver);
        adminPage.adminButton.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        Actions actions7 = new Actions(driver);
        actions7.moveToElement(driver.findElement(new By.ByXPath("/html/body/app/main/administration/div[2]/div/div/projects/div/div[1]/div[1]/div[2]/search-field/div/input")));
        actions7.click();
        actions7.sendKeys("Product_5");
        actions7.build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        Actions actions8 = new Actions(driver);
        actions8.moveToElement(driver.findElement(new By.ByXPath("xpath /html/body/app/main/administration/div[2]/div/div/projects/div/div[1]/div[1]/div[2]/search-field/div/span[1]/span")));
        actions8.click();
        actions8.build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Actions actions9 = new Actions(driver);
        actions9.moveToElement(driver.findElement(new By.ByXPath("/html/body/app/main/administration/div[2]/div/div/projects/div/div[1]/div[2]/project/div/div[1]/div/div[1]/div[2]/button[1]")));
        actions9.click();
        actions9.build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.quit();
}
        @AfterSuite
    public void tearDown() {
   driver.quit();

    }
}


    /*WebDriver driver;
    LoginPage objLogin;

    @BeforeSuite
    public void setUp( ) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("http://.com/login");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        objLogin.clickLogin();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Parameters ({"username", "password"})
    @Test
    public void LogIn( ) {

        objLogin.loginTo("username", "password");{

            LoginPage loginPage = new LoginPage(driver);

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.quit();
        }

    }
        @AfterSuite
        public void tearDown () {

            driver.quit();
        }
    }*/
