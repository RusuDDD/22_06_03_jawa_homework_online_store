package de.telran.onlineStore;

public class Order {
    private int id;
    private int customerId;
    private int sellerId;
    private long[] products;

    public Order(int id, int customerId, int sellerId, long[] products) {
        this.id = id;
        this.customerId = customerId;
        this.sellerId = sellerId;
        this.products = products;
    }

    public static Foodstuffs getFoodStuffByArticle(long article) {
        Foodstuffs current = null;

        for (long food : Foodstuffs) {
            if (food.getArticle() == article) {
                current = food;
                break;
            }
        }
        return current;

    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public long[] getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public void setProducts(long[] products) {
        this.products = products;
    }
}
