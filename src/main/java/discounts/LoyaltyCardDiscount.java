package discounts;

import behaviours.IDiscount;
import shop.ShoppingBasket;

public class LoyaltyCardDiscount implements IDiscount {

    private TwoForOne twoForOne;
    private OverTwentyPoundsDiscount overTwentyPoundsDiscount;

    public LoyaltyCardDiscount(TwoForOne twoForOne, OverTwentyPoundsDiscount overTwentyPoundsDiscount) {
        this.twoForOne = twoForOne;
        this.overTwentyPoundsDiscount = overTwentyPoundsDiscount;

    }

    public double discount(ShoppingBasket basket) {
        double currentTotal = this.overTwentyPoundsDiscount.discount(basket);
        return currentTotal;



    }


}
