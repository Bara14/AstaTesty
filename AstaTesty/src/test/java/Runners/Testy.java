package Runners;

import Pages.Locators.BasketExecutors;
import Pages.Locators.BasketLocators;
import Pages.Locators.Task2Executors;
import Pages.Locators.Task3Executors;
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
public Task2Executors executors2;
public Task3Executors executors3;


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

    @Test
    public void Task2test() throws InterruptedException {

        //BasketExecutors exec = PageFactory.initElements(driver, BasketExecutors.class);
        executors2 = new Task2Executors(driver);

        Thread.sleep(2000);
        executors2.CountNumberofItem("Elektronika");
      executors2.ChooseCategory("Elektronika");
      executors2.CountNumberofItem("Elektronika");
        Thread.sleep(2000);
       executors2.ChooseCategory("Sport");
        executors2.CountNumberofItem("Sport");
        Thread.sleep(2000);
        executors2.ChooseCategory("Firma i usługi");
        executors2.CountNumberofItem("Firma i usługi");
    }
    @Test
    public void Task3test() throws InterruptedException {

        //BasketExecutors exec = PageFactory.initElements(driver, BasketExecutors.class);
        executors3 = new Task3Executors(driver);


        executors3.clickOnMenu();
        Thread.sleep(1000);
        executors3.chooseEdit();
        Thread.sleep(2000);
        executors3.putName("Rafaellllo");
        Thread.sleep(2000);
    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/home/rafal/Pobrane/chromedriver");
        String taskNumber ="3";
        driver = new ChromeDriver();
      //  driver.get("https://buggy-testingcup.pgs-soft.com/task_1");
        driver.get("https://buggy-testingcup.pgs-soft.com/task_"+taskNumber);

    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
