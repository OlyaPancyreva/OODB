public class Product {

    private String name;
    private double price;
    private boolean stock;

    Product(String name, double price, boolean stock) {
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

    public void setStock(boolean stock) {
        stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean setStock() {
        return stock;
    }


}
