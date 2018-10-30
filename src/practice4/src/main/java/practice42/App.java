package practice4.src.main.java.practice42;
//Create script for logging in to http:.com/login

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class App {

        private static WebDriver driver;

        @BeforeClass
        public static void setup( ) {
//        System.setProperty("webdriver.chrome.driver", "/home/user/Work/chromedriver");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://.com/login");
        }

        @Test
        public void userLogin( ) {
            WebElement loginButton = driver.findElement(By.xpath("/html/body/app/main/login/div/div/div/div/div/button"));
            loginButton.click();
            WebElement loginField = driver.findElement(By.id("email"));
            loginField.sendKeys("");
            WebElement passwordField = driver.findElement(By.id("userPassword"));
            passwordField.sendKeys("");
            WebElement loginButton2 = driver.findElement(By.xpath("/html/body/app/main/login/div/div/div[2]/div/div/div[3]/button"));
            loginButton2.click();

        }

        @AfterClass
        public static void tearDown( ) {
                driver.quit();
            }

        }
