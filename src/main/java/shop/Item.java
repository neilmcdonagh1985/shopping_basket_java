package shop;

public class Item {

    private String type;
    private double price;
    private boolean twoForOneOffer;

    public Item(String type, double price, boolean twoForOneOffer) {
        this.type = type;
        this.price = price;
        this.twoForOneOffer = twoForOneOffer;

    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean checkIfOnTwoForOneOffer() {
        return this.twoForOneOffer;
    }

    public void updatePrice(int quantity) {
        this.price = this.price * quantity;
    }
}
