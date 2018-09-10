//Create script for logging in to http://eds_university.eleks.com/login
//link doesnt work so i used eleks university link
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class App {

        private static WebDriver driver;

        @BeforeClass
        public static void setup() {
//        System.setProperty("webdriver.chrome.driver", "/home/user/Work/chromedriver");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://university.eleks.com/login/index.php");
        }
        @Test
        public void userLogin() {
            WebElement loginField = driver.findElement(By.id("username"));
            loginField.sendKeys("marian");
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("Hendrix-1991");
            WebElement loginButton = driver.findElement(By.id("loginbtn"));
            loginButton.click();

        }
//    @AfterClass
//    public static void tearDown() {
//        WebElement menuUser = driver.findElement(By.id(".dropdown_1"));
//        menuUser.click();
//        WebElement logoutButton = driver.findElement(By.id("actionmenuaction-7"));
//        logoutButton.click();
//        driver.quit();
//    }
    }
