import discounts.TwoForOne;
import org.junit.Before;
import org.junit.Test;
import shop.Item;
import shop.ShoppingBasket;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Item item1;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item1 = new Item("sausage roll", 2.00, false);
    }

    @Test
    public void canAddItemToBasket() {
        shoppingBasket.addItem(item1);
        assertEquals(1, shoppingBasket.countItems());
    }

    @Test
    public void canBuyMoreThanOneOfAnItem() {
        shoppingBasket.addMoreThanOneOfAnItem(item1, 2);
        assertEquals(1, shoppingBasket.countItems());
        assertEquals(4.00, item1.getPrice(), 0.01);
    }


}
