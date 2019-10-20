package discounts;

import behaviours.IDiscount;
import shop.ShoppingBasket;

public class LoyaltyCardDiscount implements IDiscount {

    private IDiscount previousDiscount;

    public LoyaltyCardDiscount(IDiscount overTwentyPoundsDiscount) {
        this.previousDiscount = overTwentyPoundsDiscount;

    }

    public double discount(ShoppingBasket basket) {
        double currentTotal = this.previousDiscount.discount(basket);
        if (basket.checkIfLoyaltyCardHolder()) {
            currentTotal -= currentTotal / 100 * 2;
        }
        return currentTotal;
    }


}
