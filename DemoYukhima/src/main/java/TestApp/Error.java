package TestApp;


    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class Error {

        private WebDriver driver;

        public Error(WebDriver driver) {

            this.driver = driver;
        }

        public String getErrorText() {

            return driver.findElement(By.className("error")).getText();
        }
    }

