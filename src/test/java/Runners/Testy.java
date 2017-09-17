package Runners;

import Pages.Locators.BasketExecutors;
import Pages.Locators.BasketLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.support.PageFactory.initElements;

public class Testy {
    public WebDriver driver;

public BasketExecutors executors;


      //  public BasketLocators locators;

  //  private BasketPage basketPage;



    @Test
    public void testEasy() throws InterruptedException {

 //BasketExecutors exec = PageFactory.initElements(driver, BasketExecutors.class);
   executors = new BasketExecutors(driver);

        Thread.sleep(2000);

        executors.dodajProdukt("Kubek", "4");
        executors.dodajProdukt("Okulary", "5");
        executors.dodajProdukt("Piłka","3");
     //   executors.dodajProdukt("Aparat","8");
        executors.showBasket();
        executors.checkTotalQuantity();
       executors.numberItemsInBasket();
        executors.checkNumber();
        executors.parsePriceInBasket();
        executors.checkTotalPrice();

      //  Thread.sleep(6000);

    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/home/rafal/Pobrane/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://buggy-testingcup.pgs-soft.com/task_1");


    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
