package Pages.Locators;

//import org.junit.Test;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
import static jdk.nashorn.internal.objects.NativeMath.round;

public class BasketExecutors {
    private WebDriver driver;


    private BasketLocators locators;
    private BasketItem basketItem;
    private Basket basket;


    public BasketExecutors(WebDriver driver)

    {
this.driver=driver;
        locators = new BasketLocators();
        PageFactory.initElements(driver, locators);
         basket = new Basket();
        PageFactory.initElements(driver, basket);

      //  System.out.println("Driver to: " + driver);
    }


public Integer FindIndex(String product)
{
    int size = locators.productName.size();
    int index = 0;
    for(int i=0;i<size;i++)
    {

        if (locators.productName.get(i).getText().equals(product))
        {
            index = i;
        }
    }
    return index;

}

    public void showBasket()
    {
        for (Integer i =0; i<basket.ListOfAddedItems.size(); i++) {
            System.out.println("Dodany produkt z koszyka to: " + basket.ListOfAddedItems.get(i).getName());
            System.out.println("W ilości: " + basket.ListOfAddedItems.get(i).getQuantity());
            System.out.println("I z cena: " + basket.ListOfAddedItems.get(i).getPrice());
            //   System.out.println("Dodany produkt z koszyka to:" + basket.ListOfAddedItems.get(1).getName());
        }
    }

    public Integer numberItemsInBasket()
    {
        Integer count =0;
        Integer temp=0;
        for (Integer i =0; i<basket.ListOfAddedItems.size(); i++)
        {
            temp=basket.ListOfAddedItems.get(i).getQuantity();
            count=count+temp;

        }
      //  System.out.println("count: "+count);
        return count;

    }

    public Double totalPriceInBAsket()
    {
        Double temp ;
        Double count;
        count =0.0;
        Integer ilosc =0;
        double roundOff=0.0;
        for (Integer i =0; i<basket.ListOfAddedItems.size(); i++)
        {
           ilosc=basket.ListOfAddedItems.get(i).getQuantity();
            temp=basket.ListOfAddedItems.get(i).getPrice()*ilosc;
            count=count+temp;
             roundOff = Math.round(count * 100.0) / 100.0;
        }
        System.out.println("count: "+ roundOff);
        return roundOff;
    }
    public Double parsePriceInBasket()
    {
      String kk =  locators.summaryPriceText.getText();
      String ostateczna = kk.replace(" zł", "");
      Double dd  =Double.parseDouble(ostateczna);
      System.out.println("ParsePriceInBasket: "+ostateczna);
      return dd;

    }

    public void checkTotalPrice()
    {
        Assert.assertEquals(totalPriceInBAsket(),parsePriceInBasket());

    }

    public void checkNumber()

    {
       try {

           Assert.assertEquals(checkTotalQuantity(),numberItemsInBasket());

       }
      catch (java.lang.AssertionError error)
      {
          System.out.println("ZLEE!!!");
      }


    }



    //   public void addProductToBasket(String product, String quantity)
//    {

 //       Basket basket = new Basket();
  //      PageFactory.initElements(driver, basket);
  //      dodajProdukt(product, quantity);

  //  }

    public Double ParsePrice(String product)
    {
        String cena = locators.prices.get(FindIndex(product)).getText();
        String nowa = cena.replaceAll("Cena: ", "");
        String ostateczna = nowa.replace(" zł", "");
        double finalPrice = Double.parseDouble(ostateczna);

        return finalPrice;

    }

    public void dodajProdukt(String product, String quantity)
    {

   //     ParsePrice(product);

        locators.productCount.get(FindIndex(product)).clear();
        locators.productCount.get(FindIndex(product)).sendKeys(quantity);
        locators.dodajButton.get(FindIndex(product)).click();
//add new item
        BasketItem basketItem = new BasketItem();
        PageFactory.initElements(driver, basketItem);
        basketItem.setName(locators.productName.get(FindIndex(product)).getText());
        basketItem.setQuantity(Integer.parseInt(quantity));
        basketItem.setPrice(ParsePrice(product));
//add item to basket
        basket.ListOfAddedItems.add(basketItem);
     //  System.out.println("Dodany produkt z koszyka to:" + basket.ListOfAddedItems.get(0).getName());

    }

    public Integer checkTotalQuantity()
    {
     String ss= locators.summaryQuantityText.getText();

    Integer aa=Integer.parseInt(ss);
        return aa;
    }







}
