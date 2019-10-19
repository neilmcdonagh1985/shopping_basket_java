import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Item item1;
    Item item2;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item1 = new Item("sausage roll", 2.00);
        item2 = new Item("crisps", 1.65);
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, shoppingBasket.countItems());

    }

    @Test
    public void canAddItemToBasket() {
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        assertEquals(2, shoppingBasket.countItems());
    }
}
