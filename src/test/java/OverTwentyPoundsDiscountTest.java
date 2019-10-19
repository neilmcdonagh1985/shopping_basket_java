import discounts.OverTwentyPoundsDiscount;
import discounts.TwoForOne;
import org.junit.Before;
import org.junit.Test;
import shop.Item;
import shop.ShoppingBasket;

import static org.junit.Assert.assertEquals;

public class OverTwentyPoundsDiscountTest {

    OverTwentyPoundsDiscount overTwentyPoundsDiscount;
    ShoppingBasket shoppingBasket;
    TwoForOne twoForOne;
    Item item1;
    Item item2;
    Item item3;
    Item item4;
    Item item5;
    Item item6;


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
        overTwentyPoundsDiscount = new OverTwentyPoundsDiscount(twoForOne);
    }

    @Test
    public void canDiscount() {
        assertEquals(15.30, overTwentyPoundsDiscount.discount(shoppingBasket), 0.01);
    }
}
