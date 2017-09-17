package Pages.Locators;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Basket {



    public List<BasketItem> ListOfAddedItems;
    private int summaryQuantity;


    public Basket() {
        this.ListOfAddedItems = new LinkedList<BasketItem>();

    }

}
