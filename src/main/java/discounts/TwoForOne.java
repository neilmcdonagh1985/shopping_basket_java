package discounts;
import behaviours.IDiscount;
import shop.Item;
import shop.ShoppingBasket;

import java.util.ArrayList;

public class TwoForOne implements IDiscount {

//    private ShoppingBasket shoppingBasket;

    public TwoForOne() {
//        this.shoppingBasket = basket;

    }

//    public ArrayList<Item> getItemsInBasket() {
//        return this.shoppingBasket.getItems();
//    }

    public double discount(ShoppingBasket basket) {
        ArrayList<Item> list1 = basket.getItems();
        ArrayList<Item> twoForOneItems = new ArrayList<Item>();
        ArrayList<Item> nonOfferItems = new ArrayList<Item>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).checkIfOnTwoForOneOffer()) {
                Item removedItem  =list1.get(i);
                twoForOneItems.add(removedItem);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).checkIfOnTwoForOneOffer()) {
                Item removedFullPriceItem = list1.get(i);
                nonOfferItems.add(removedFullPriceItem);
            }
        }
        double totalOfFullPriceItems = 0;
        double totalOfDiscountItems = 0;

        for (Item item : nonOfferItems) {
            totalOfFullPriceItems += item.getPrice();
        }

        for (Item item : twoForOneItems) {
            totalOfDiscountItems += item.getPrice();
        }
        totalOfDiscountItems = totalOfDiscountItems / 2;
        return totalOfFullPriceItems + totalOfDiscountItems;

    }

//    public double discount() {
//        ArrayList<Item> list1 = this.getItemsInBasket();
//        ArrayList<Item> twoForOneItems = new ArrayList<Item>();
//        ArrayList<Item> nonOfferItems = new ArrayList<Item>();
//
//        for (int i = 0; i < list1.size(); i++) {
//            if (list1.get(i).checkIfOnTwoForOneOffer()) {
//                Item removedItem = list1.get(i);
//                twoForOneItems.add(removedItem);
//            }
//        }
//
//        for (int i = 0; i < list1.size(); i++) {
//            if (!list1.get(i).checkIfOnTwoForOneOffer()) {
//                Item removedFullPriceItem = list1.get(i);
//                nonOfferItems.add(removedFullPriceItem);
//            }
//        }
//
//        double totalOfFullPriceItems = 0;
//        double totalOfDiscountItems = 0;
//
//        for (Item item : nonOfferItems) {
//            totalOfFullPriceItems += item.getPrice();
//        }
//
//        for (Item item : twoForOneItems) {
//            totalOfDiscountItems += item.getPrice();
//        }
//        totalOfDiscountItems = totalOfDiscountItems / 2;
//        return totalOfFullPriceItems + totalOfDiscountItems;
//
//
//    }


}
