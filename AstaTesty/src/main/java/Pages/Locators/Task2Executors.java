package Pages.Locators;

//import org.junit.Test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Task2Executors {
    private WebDriver driver;


    private Task2Locators locators;



    public Task2Executors(WebDriver driver)

    {
this.driver=driver;
        locators = new Task2Locators();
        PageFactory.initElements(driver, locators);


    }


public void ChooseCategory(String name)
{
    locators.arrow.click();
  //  locators.dropdownList.get(1).click();

    for(int i=0; i<locators.dropdownList.size();i++) {
      //  System.out.println("Jestem w ifie na i= " + i + ": " + locators.dropdownList.get(i).getText()+ " a name to: "+ name);
        if (locators.dropdownList.get(i).getText().equals(name)) {
       //     System.out.println("Klikam na i= " + i);
            locators.dropdownList.get(i).click();
        }

    }


}

public void CountNumberofItem(String name)
{int count=0;
int inne =0;
    for(int i=0;i<locators.totalNumberofItem.size();i++) {
      //  System.out.println("element "+ );
        if (locators.totalNumberofItem.get(i).getText().equals(name))
            count = count + 1;
        else
            inne = inne+1;
    }
    System.out.println("Liczba elementow "+name+" to:"+count);
    System.out.println("a innych to "+inne);
}







}
