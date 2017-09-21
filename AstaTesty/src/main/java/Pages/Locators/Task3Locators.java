package Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Task3Locators {





    @FindBy(how = How.ID, using = "in-name")
    public WebElement name;



    @FindBy(how = How.XPATH, using = "//ul[@id='menu1']/li/a")
    public List<WebElement> formular;

    @FindBy(how = How.ID, using = "in-surname")
    public WebElement surname;

    @FindBy(how = How.ID, using = "in-notes")
    public WebElement notes;

    @FindBy(how = How.ID, using = "in-phone")
    public WebElement phone;

    @FindBy(how = How.ID, using = "span-file")
    public WebElement choosePicture;

    @FindBy(how = How.XPATH, using = " //a[@id='start-edit'] ")
    public WebElement edycja;


    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle menu-border']")
    public WebElement menu2;

    @FindBy(how = How.XPATH, using = "//ul[@class='dropdown-menu sub-menun']/li")
    public List<WebElement> submenu;


}
