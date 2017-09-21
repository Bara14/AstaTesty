package Pages.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.*;

import java.util.List;

public class BasketLocators {
   // private WebDriver driver;


    //   public BasketLocators(WebDriver driver)
 //   {
 //       this.driver=driver;
 //   }

 //     List<WebElement> productName = driver.findElements(
      //      (By.xpath("//div[@class='caption']/h4")));
//

 // List<WebElement> productCount = driver.findElements(
  //          (By.xpath("//div[@class='input-group input-group-sm']/input[@type='number']")));


   //  List<WebElement>  dodajButton = driver.findElements(By.xpath("//button[text()='Dodaj']"));

  //  public  WebElement iloscDodanychTowarow = driver.findElement(By.className("summary-quantity"));

    // Products
    @FindBy(how = How.XPATH, using = "//button[text()='Dodaj']")
    public List<WebElement> dodajButton;

    @FindBy(how = How.XPATH, using = "//div[@class='caption']/h4")
    public List<WebElement> productName;

    @FindBy(how = How.XPATH, using = "//div[@class='caption']/p[contains(text(),'Cena:')]")
    public List<WebElement> prices;

    @FindBy(how = How.XPATH, using = "//div[@class='input-group input-group-sm']/input[@type='number']")
    public List<WebElement> productCount;


    // Basket
    @FindBy(how = How.CSS, using = ".col-md-9.text-on-button-level")
    public List<WebElement> basketItems;

    @FindBy(how = How.CSS, using = ".summary-quantity")
    public WebElement summaryQuantityText;

    @FindBy(how = How.CSS, using = ".summary-price")
    public WebElement BasketLocators;


}
