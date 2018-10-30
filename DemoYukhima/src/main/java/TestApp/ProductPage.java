package TestApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductPage {

        private WebDriver driver;

        public ProductPage(WebDriver driver) {

            this.driver = driver;
        }

        public String getErrorText() {

            return driver.findElement(By.name("product")).getText();
        }
    }

