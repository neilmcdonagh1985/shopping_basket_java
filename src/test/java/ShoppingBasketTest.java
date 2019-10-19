import discounts.TwoForOne;
import org.junit.Before;
import org.junit.Test;
import shop.Item;
import shop.ShoppingBasket;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Item item1;
    Item item2;
    private Item item3;
    private Item item4;
    private Item item5;
    private Item item6;
    private Item item7;
    private Item item8;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item1 = new Item("sausage roll", 2.00, false);
        item2 = new Item("crisps", 1.65, true);
        item3 = new Item("chocolate", 1.50, true);
        item4 = new Item("orange juice", 2.00, false);
        item5 = new Item("cake", 3.40, true);
        item6 = new Item("crisps", 1.65, true);
        item7 = new Item("chocolate", 1.50, true);
        item8 = new Item("cake", 3.40, true);
        shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        shoppingBasket.addItem(item3);
        shoppingBasket.addItem(item4);
        shoppingBasket.addItem(item5);
        shoppingBasket.addItem(item6);
        shoppingBasket.addItem(item7);
        shoppingBasket.addItem(item8);
    }



    @Test
    public void canAddItemToBasket() {
        assertEquals(8, shoppingBasket.countItems());
    }


}
