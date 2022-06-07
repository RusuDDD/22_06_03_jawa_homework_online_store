package de.telran.onlineStore;

public class Clothes extends OnlineStore {

    double discount;

    public Clothes(String productName, int article, double price) {
        super(productName, article, price);
    }

    public double getDiscount() {
        discount = 0.25;
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return (int)(getPrice() * getDiscount());
    }
}
