import org.junit.Before;
import org.junit.Test;
import shop.Item;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before() {
        item = new Item("sandwich", 3.50, true);
    }

    @Test
    public void canGetType() {
        assertEquals("sandwich", item.getType());
    }

    @Test
    public void canGetPrice() {
        assertEquals(3.50, item.getPrice(), 0.01);
    }

    @Test
    public void canCheckIfOnOffer() {
        assertEquals(true, item.checkIfOnTwoForOneOffer());
    }

}
