package discounts;

import behaviours.IDiscount;
import shop.ShoppingBasket;

public class OverTwentyPoundsDiscount implements IDiscount {

    private TwoForOne twoForOne;


    public OverTwentyPoundsDiscount(TwoForOne previousDiscount) {
        this.twoForOne = previousDiscount;

    }

    public double discount(ShoppingBasket basket) {
        double currentTotal = this.twoForOne.discount(basket);
        if (currentTotal > 20) {
            currentTotal = currentTotal - currentTotal / 100 * 10;
        }
        return currentTotal;

    }
}
