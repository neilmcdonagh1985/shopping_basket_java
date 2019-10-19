package shop;


import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Item> items;
    private boolean loyaltyCardHolder;

    public ShoppingBasket(boolean loyaltyCardHolder) {
        this.items = new ArrayList<Item>();
        this.loyaltyCardHolder = loyaltyCardHolder;

    }

    public int countItems() {
        return this.items.size();
    }

    public void addItem(Item item) {
        this.items.add(item);

    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addMoreThanOneOfAnItem(Item item, int quantity) {
        this.items.add(item);
        item.updatePrice(quantity);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public boolean checkIfLoyaltyCardHolder() {
        return this.loyaltyCardHolder;
    }

    public void expireLoyaltyCard() {
        this.loyaltyCardHolder = false;
    }






}
