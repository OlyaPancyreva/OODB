package Classes;

import java.util.Comparator;

public class Product {

    private String name;
    private double price;
    private int stock;

    public Product() {
    }

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }


    public static Comparator<Product> SORT_BY_NAME = new Comparator<Product>() {
        @Override
        public int compare(Product one, Product other) {
            return one.name.compareTo(other.name);
        }
    };

}
