package discounts;
import shop.Item;
import shop.ShoppingBasket;

import java.util.ArrayList;

public class TwoForOne {

    private ShoppingBasket shoppingBasket;

    public TwoForOne(ShoppingBasket basket) {
        this.shoppingBasket = basket;

    }

    public ArrayList<Item> getItemsInBasket() {
        return this.shoppingBasket.getItems();
    }

    public double discount() {
        ArrayList<Item> list1 = this.getItemsInBasket();
        ArrayList<Item> twoForOneItems = new ArrayList<Item>();
        ArrayList<Item> nonOfferItems = new ArrayList<Item>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).checkIfOnTwoForOneOffer()) {
                Item removedItem = list1.get(i);
                twoForOneItems.add(removedItem);
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).checkIfOnTwoForOneOffer()) {
                Item removedFullPriceItem = list1.get(i);
                nonOfferItems.add(removedFullPriceItem);
            }
        }


//        for (int i = 0; i < list1.size(); i++) {
//            if (list1.get(i).checkIfOnTwoForOneOffer()) {
//                list2.add(list1.remove(i));
//            }
//
//
//        }
        return nonOfferItems.size();

//        double total = 0;
//        for (Item item : list1) {
//            total += item.getPrice();
//        }
//
//        return total;

//        double totalToBeAdded = 0;
//        for (int i = 0; i < list2.size(); i = i + 2) {
//            totalToBeAdded += list2.get(i).getPrice();
//        }
//
//        return total + totalToBeAdded;


    }


}
