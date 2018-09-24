package practice43;
//Create script for logging in to http://eds_university.eleks.com/login
//Refactor your code using Page Object and Page Factory
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

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
    @Test()
    public void loginOK(String username, String password) {

        LoginPage lp = new LoginPage(driver);
        ProductPage pp = lp.correctLogin(username, password);
    }


        @AfterSuite
    public void tearDown() {
   driver.quit();

    }
}


