package discounts;

import behaviours.IDiscount;
import shop.ShoppingBasket;

public class OverTwentyPoundsDiscount extends TwoForOne implements IDiscount {

    private IDiscount previousDiscount;


    public OverTwentyPoundsDiscount(IDiscount twoForOne) {
        this.previousDiscount = twoForOne;

    }

    public double discount(ShoppingBasket basket) {
        double currentTotal = this.previousDiscount.discount(basket);
        if (currentTotal > 20) {
            currentTotal -= currentTotal / 100 * 10;
        }
        return currentTotal;

    }
}
