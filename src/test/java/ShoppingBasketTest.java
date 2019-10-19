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
    Item item3;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket(true);
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

    @Test
    public void canRemoveItems() {
        item2 = new Item("crisps", 2.00, true);
        item3 = new Item("chocolate", 1.50, true);
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        shoppingBasket.removeItem(item1);
        assertEquals(1, shoppingBasket.countItems());
    }

    @Test
    public void canCheckIfLoyaltycardHolder() {
        assertEquals(true, shoppingBasket.checkIfLoyaltyCardHolder());
    }

    @Test public void canExpireLoyaltyCard() {
        shoppingBasket.expireLoyaltyCard();
        assertEquals(false, shoppingBasket.checkIfLoyaltyCardHolder());
    }


}
