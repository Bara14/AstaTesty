package Pages.Locators;

//import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Task3Executors {
    private WebDriver driver;


    private Task3Locators locators;



    public Task3Executors(WebDriver driver)

    {
this.driver=driver;
        locators = new Task3Locators();
        PageFactory.initElements(driver, locators);


    }


    public void clickOnMenu()
    {
        Actions builder = new Actions(driver);
        builder.moveToElement(locators.menu2).perform();

    }

    public void chooseEdit()
    {
        Actions builder = new Actions(driver);
builder.moveToElement(locators.formular.get(0));
        builder.moveToElement(locators.edycja).click().perform();

    }

    public void putName(String imie)
    {
        locators.name.clear();
        locators.name.sendKeys(imie);

    }


}
