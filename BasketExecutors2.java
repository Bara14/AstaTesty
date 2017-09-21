package Pages.Locators;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasketExecutors2 {
    private WebDriver driver;


    private BasketLocators locators;
    private BasketItem basketItem;
    private Basket basket;


    public BasketExecutors2(WebDriver driver)

    {
this.driver=driver;
        locators = new BasketLocators();
        PageFactory.initElements(driver, locators);


        System.out.println("Driver to: " + driver);
    }






    public void dodajProdukt(String product, String quantity)
    {

Basket basket = new Basket();
        PageFactory.initElements(driver, basket);

int size = locators.productName.size();
int index = 0;
        for(int i=0;i<size;i++)
    {

        if (locators.productName.get(i).getText().equals(product))
        {
            index = i;
        }
    }





      //  List<WebElement> prices = driver.findElements(
     //           (By.xpath("//div[@class='caption']/p[contains(text(),'Cena:')]")));

       String cena = locators.prices.get(index).getText();
        String nowa = cena.replaceAll("Cena: ", "");
        String ostateczna = nowa.replace(" zł", "");
        System.out.println("Cena po obcieciu:" + ostateczna);
        double finalPrice = Double.parseDouble(ostateczna);
        System.out.println("A teraz int!!: " + finalPrice);

        locators.productCount.get(index).clear();
        locators.productCount.get(index).sendKeys(quantity);
        locators.dodajButton.get(index).click();
        BasketItem basketItem = new BasketItem();
        PageFactory.initElements(driver, basketItem);
       // System.out.println("Nazwa z lokator: "+ locators.productName.get(index).getText());
        basketItem.setName(locators.productName.get(index).getText());
        basketItem.setQuantity(Integer.parseInt(quantity));
        basketItem.setPrice(finalPrice);

        basket.ListOfAddedItems.add(basketItem);
        System.out.println("Dodany produkt z koszyka to:" + basket.ListOfAddedItems.get(0).getName());

    }







}
