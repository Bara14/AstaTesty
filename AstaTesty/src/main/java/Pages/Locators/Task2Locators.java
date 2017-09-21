package Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Task2Locators {


    // Products
    @FindBy(how = How.XPATH, using = "//button[text()='Dodaj']")
    public List<WebElement> dodajButton;

    @FindBy(how = How.XPATH, using = "//div[@class='caption']/h4")
    public List<WebElement> productName;

    @FindBy(how = How.XPATH, using = "//div[@class='caption']/p[contains(text(),'Cena:')]")
    public List<WebElement> prices;

    @FindBy(how = How.XPATH, using = "//ul[@class='select2-results__options']/li")
    public List<WebElement> dropdownList;


    @FindBy(how = How.CLASS_NAME, using = "select2-selection__arrow")
    public WebElement arrow;

    @FindBy(how = How.XPATH, using = "//div[@class='caption']/p/strong")
    public List<WebElement> totalNumberofItem;


}
