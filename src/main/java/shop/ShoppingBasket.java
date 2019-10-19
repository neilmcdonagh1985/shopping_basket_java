package shop;


import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Item> items;

    public ShoppingBasket() {
        this.items = new ArrayList<Item>();

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






}
