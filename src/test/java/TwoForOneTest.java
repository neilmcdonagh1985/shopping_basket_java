import discounts.TwoForOne;
import org.junit.Before;
import org.junit.Test;
import shop.Item;
import shop.ShoppingBasket;

import static org.junit.Assert.assertEquals;

public class TwoForOneTest {

    private TwoForOne twoForOne;
    private ShoppingBasket shoppingBasket;
    private Item item1;
    private Item item2;
    private Item item3;
    private Item item4;
    private Item item5;
    private Item item6;

    @Before
    public void before() {
        item1 = new Item("sausage roll", 2.00, false);
        item2 = new Item("crisps", 2.00, true);
        item3 = new Item("chocolate", 1.50, true);
        item4 = new Item("orange juice", 2.00, false);
        item5 = new Item("cake", 3.40, true);
        item6 = new Item("cheese", 1.00, false);
        shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(item1);
        shoppingBasket.addMoreThanOneOfAnItem(item2, 2);
        shoppingBasket.addMoreThanOneOfAnItem(item3, 2);
        shoppingBasket.addItem(item4);
        shoppingBasket.addMoreThanOneOfAnItem(item5, 4);
        shoppingBasket.addItem(item6);
        twoForOne = new TwoForOne();

    }

    @Test
    public void canDiscount() {
        assertEquals(15.30, twoForOne.discount(shoppingBasket), 0.01);
    }

}
