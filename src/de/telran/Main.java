package de.telran;

import de.telran.onlineStore.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    static ArrayList<Foodstuffs> foodstuffs = new ArrayList<>();
    static ArrayList<Electronics> electronics = new ArrayList<>();
    static ArrayList<Clothes> clothes = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Seller> sellers = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        foodstuffs.add(new Foodstuffs("Beer", 1, 1.69));
        foodstuffs.add(new Foodstuffs("Beer", 2, 1.59));
        foodstuffs.add(new Foodstuffs("Beer", 3, 1.39));
        foodstuffs.add(new Foodstuffs("Beer", 4, 1.19));
        foodstuffs.add(new Foodstuffs("Beer", 5, 0.69));
        foodstuffs.add(new Foodstuffs("Beer", 6, 1.89));
        foodstuffs.add(new Foodstuffs("Beer", 7, 1.49));
        foodstuffs.add(new Foodstuffs("Beer", 8, 1.69));
        foodstuffs.add(new Foodstuffs("Beer", 9, 0.99));
        foodstuffs.add(new Foodstuffs("Beer", 10, 0.89));
        foodstuffs.add(new Foodstuffs("Beer", 11, 1.29));

        electronics.add(new Electronics("Apple Iphone 6", 1, 120.99));
        electronics.add(new Electronics("Apple Iphone 7", 2, 190.99));
        electronics.add(new Electronics("Apple Iphone 8", 3, 210.99));
        electronics.add(new Electronics("Apple Iphone X", 4, 270.99));
        electronics.add(new Electronics("Apple Iphone XS", 5, 320.99));
        electronics.add(new Electronics("Apple Iphone 11", 6, 450.99));
        electronics.add(new Electronics("Apple Iphone 12", 7, 480.99));
        electronics.add(new Electronics("Apple Iphone 13", 8, 699.99));
        electronics.add(new Electronics("Apple Iphone 13 Max", 9, 999.99));
        electronics.add(new Electronics("Apple Iphone 13 Gold", 10, 2190.99));
        electronics.add(new Electronics("AT&T CRL82312", 11, 69.99));
        electronics.add(new Electronics("AT&T EL52213", 12, 90.99));
        electronics.add(new Electronics("VTech DS6421", 13, 120.99));
        electronics.add(new Electronics("VTech VS112", 14, 90.99));
        electronics.add(new Electronics("Vtech CS6719", 15, 99.99));
        electronics.add(new Electronics("HP 250 G7 (6MS75ES)", 16, 799.99));
        electronics.add(new Electronics("ASUS VivoBook 15 F515JA", 17, 679.99));
        electronics.add(new Electronics("Samsung Galaxy Book Pro", 18, 730.99));
        electronics.add(new Electronics("HP Pavilion x360 15-er0055ng", 19, 699.99));

        clothes.add(new Clothes("Gabbi Bag", 1, 68));
        clothes.add(new Clothes("Woolen Coat", 2, 250));
        clothes.add(new Clothes("Striped Cashmere Maxi Dress", 3, 1170));
        clothes.add(new Clothes("Mary Cotton Rib Tights For Women", 4, 70));
        clothes.add(new Clothes("Baroque Shell Pearl Drop Earring", 5, 132));
        clothes.add(new Clothes("24/7 Perfect Coverage Bra", 6, 65));
        clothes.add(new Clothes("Hustler High Waist Ankle Flare Jeans", 7, 218));
        clothes.add(new Clothes("Phoebe Slipper", 9, 85));
        clothes.add(new Clothes("The Mini Venice Bag", 10, 395));
        clothes.add(new Clothes("The Santorini Maillot", 11, 218));

        customers.add(new Customer(1, "Jack Varabey", 28));
        customers.add(new Customer(2, "Manuela Kiadny", 18));
        customers.add(new Customer(3, "John Johnson", 38));
        customers.add(new Customer(4, "Daniel Cruy", 26));
        customers.add(new Customer(5, "Amely Forder", 19));
        customers.add(new Customer(6, "Trayci Mell", 25));
        customers.add(new Customer(7, "Adam Travolta", 55));

        sellers.add(new Seller(1, "Beny Bonjovy", 58));
        sellers.add(new Seller(2, "Jack Walkinson", 39));
        sellers.add(new Seller(3, "Deni Denroy", 69));
        sellers.add(new Seller(4, "Benn Horwie", 45));
        sellers.add(new Seller(5, "Harreld Grou", 72));
        sellers.add(new Seller(6, "Deni Devita", 70));
        sellers.add(new Seller(7, "Margaret Lu", 29));
        sellers.add(new Seller(8, "Gandi Mallow", 67));
        sellers.add(new Seller(9, "Boby Martieli", 36));



    }
}
