package de.telran.onlineStore;

public class OnlineStore {

    private String productName;
    private int article;
    private double price;

    public OnlineStore(String productName, int article, double price) {
        this.productName = productName;
        this.article = article;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getArticle() {
        return article;
    }

   public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
