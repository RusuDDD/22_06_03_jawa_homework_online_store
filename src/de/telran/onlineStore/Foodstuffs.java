package de.telran.onlineStore;

public class Foodstuffs extends OnlineStore {

    private double delivery;

    public Foodstuffs(String productName, int article, double price) {
        super(productName, article, price);

    }

    public double delivery() {
        double tmp = 6.99;
        return tmp;
    }

    @Override
    public double getPrice() {
        var v = getPrice() + delivery();
        System.out.println("additional price for urgency of delivery");
        return v;
    }

    public double getDelivery() {
        return delivery;
    }

    public void setDelivery(double delivery) {
        this.delivery = delivery;
    }
}