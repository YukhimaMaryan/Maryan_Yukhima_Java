//Prepare testing application for portal http://.com/ use your own credentials provided
//
//Testing application should contai at least following tests:
//
//Verify that user with valid credentials can login into site
//Verify that user with invalid credentials cannot login into site.
//Please count several cases - when username is invalid and password valid, empty or oversized string.

//Verify that product can be created and all product attributes are correctly recorded
//Please count that some fields are optional and some are required. One can`t submit when required attributes are not filled in
//Use the features that special green bubble message appears on success, and red colored message appears when required fields are not filled

//Verify that product can be edited (each property can be changes and changes are correctly recorded)
//Please count that some fields are optional and some are required. One can`t submit when required attributes are not filled in
//Use the features that special green bubble message appears on success, and red colored message appears when required fields are not filled

//Verify that product can be successfully deleted
//After deletion verify that product does not appear in the list
//Use the features that special green bubble message appears on success
//Important features
//
//Use TestNG for writing tests
//Use TestNGs data provider feature where applicable
//Tests should run with maven from commandline
//Enable multibrowser testing (use factory method). Browser name can be passed via environment variable or surefire plugin configuration or in testng.xml
//Use PageObject/PageFactory pattern
//Page object constructor should wait on specific element on the page
//Use Allure reporter to report steps and tests
//Store a screenshot on test failure (should be integrated into Allure report)
//Don't use Thread.sleep(), use fluent wait instead

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

    public class App {

        private static WebDriver driver;

        @BeforeTest
        @Parameters("browser")
        public void setup(String browser) throws Exception{
            //Check if parameter passed from TestNG is 'firefox'
             if(browser.equalsIgnoreCase("Chrome")){
                //set path to chromedriver.exe
                 WebDriverManager.chromedriver().setup();
//                System.setProperty("webdriver.chrome.driver",".\\DemoYukhima\\chromedriver.exe");
                //create chrome instance
                driver = new ChromeDriver();
            }
            else if(browser.equalsIgnoreCase("Firefox")){
                //create firefox instance
                WebDriverManager.firefoxdriver().setup();
//                System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
            //Check if parameter passed as 'chrome'

            //Check if parameter passed as 'Edge'
            else if(browser.equalsIgnoreCase("Edge")){
                //set path to Edge.exe
                WebDriverManager.iedriver().setup();
//             System.setProperty("webdriver.ie.driver",".\\MicrosoftWebDriver.exe");
                //create Edge instance
                driver = new InternetExplorerDriver();
            }
            else{
                //If no browser passed throw exception
                throw new Exception("Browser is not correct");
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
//
//            @BeforeTest
//            @Parameters("browser")
//            public void beforeClass(String browser) throws MalformedURLException {
//                if (browser.equalsIgnoreCase("chrome")) {
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
//
//                } else if (browser.equalsIgnoreCase("firefox")) {
//                    WebDriverManager.firefoxdriver().setup();
//                    driver = new FirefoxDriver();
//
//                } else if (browser.equalsIgnoreCase("ie")) {
//                    WebDriverManager.iedriver().setup();
//                    driver = new InternetExplorerDriver();
//
//                }
//            public static void beforeTest () {
////        System.setProperty("webdriver.chrome.driver", "/home/user/Work/chromedriver");
//                driver.get("http://eds_university.eleks.com/login");
//            }

            @Test
            public void userLoginValid () {
                WebElement loginButton = driver.findElement(By.xpath("/html/body/app/main/login/div/div/div/div/div/button"));
                loginButton.click();
                WebElement loginField = driver.findElement(By.id("email"));
                loginField.sendKeys("yukhimarian@gmail.com");
                WebElement passwordField = driver.findElement(By.id("userPassword"));
                passwordField.sendKeys(">1p*cA1+5");
                WebElement loginButton2 = driver.findElement(By.xpath("/html/body/app/main/login/div/div/div[2]/div/div/div[3]/button"));
                loginButton2.click();
            }

            @AfterTest
            public void afterTest () {
                driver.quit();
            }
        }



