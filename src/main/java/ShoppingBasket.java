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
}
