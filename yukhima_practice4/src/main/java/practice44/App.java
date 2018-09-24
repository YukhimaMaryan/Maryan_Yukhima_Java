package practice44;
//1) Create a new product. Check if it exists and all fields are filled in correctly.
//2) Edit a new product. Check if all fields have been edited correctly.
//3) Remove the product. Check if it was deleted.
//4) Take a screenshot.
//5) Use Implicit and Explicit Waits instead of sleeps.
//Wait for an unique page element in the Page Object constructor.
//6) Use Actions, JS execution, switching between frames and windows where
//necessary.
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class App {

    WebDriver driver;

    LoginPage logpage;


    @BeforeSuite
    public void setUp( ) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://eds_university.eleks.com/login");
        logpage = new LoginPage(driver);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
        actions.build().perform();

        adminPage.adProduct.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        Actions actions2 = new Actions(driver);
        actions2.moveToElement(driver.findElement(new By.ByClassName("form-horizontal")));
        actions2.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        actions2.build().perform();

        Actions actions3 = new Actions(driver);
        actions3.sendKeys("Product_5");
        actions3.build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Actions actions4 = new Actions(driver);
        actions4.moveToElement(driver.findElement(new By.ByClassName("dropdown")));
        actions4.click();
        actions4.build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Actions actions5 = new Actions(driver);
        actions5.sendKeys("Marian_Yukhima Product Family 1");
        actions5.build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Actions actions6 = new Actions(driver);
        actions6.click();
        actions6.build().perform();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
    }
        @AfterSuite
    public void tearDown() {
   driver.quit();

    }
}


