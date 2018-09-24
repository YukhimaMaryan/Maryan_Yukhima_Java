package practice44;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

    private WebDriver driver;


    @FindBy(how = How.XPATH, using = "/html/body/app/navbar/nav/div/div[2]/ul/li[2]/a")
    public WebElement adminButton;

    @FindBy(how = How.XPATH, using ="/html/body/app/main/administration/div[2]/div/div/projects/div/div[1]/div[1]/div[3]/div/div/a/span[2]")
    public WebElement adProduct;

    @FindBy(how = How.CLASS_NAME   , using = "form-horizontal")
    public WebElement productName;

    @FindBy(how = How.XPATH, using ="//*[@id=\"change-product-family-list\"]/dropdown-gds/ss-multiselect-dropdown/div")
    public WebElement productFamily;

    @FindBy(how = How.ID, using = "saveProductAdd")
    public WebElement saveProduct;


    public  AdminPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
