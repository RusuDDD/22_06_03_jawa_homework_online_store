package de.telran.onlineStore;

public class Electronics extends OnlineStore {

    String guarantee;
    String contract;


    public Electronics(String productName, int article, double price) {
        super(productName, article, price);
    }

    public String getGuarantee() {
        System.out.println("The phones are sold only with the operator's contract");
        return guarantee;
    }

    public String getContract() {
        System.out.println("When buying electronics, the buyer is offered an additional warranty");
        return contract;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }
}
