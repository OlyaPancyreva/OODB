import java.util.List;
import java.util.Scanner;

//реализация конкретного товара
public class concreteProduct extends Product {

    Scanner in = new Scanner(System.in);
    List<Product> listOfProduct;

    concreteProduct(String name, double price, boolean stock) {
        super(name, price, stock);
    }

    //    добавление товара
    public void addProduct() {
        System.out.print("Введите название нового товара: ");
        String name = in.next();

        System.out.print("Введите цену: ");
        double price = in.nextDouble();

        System.out.print("Наличие: ");
        boolean stock = in.nextBoolean();

        listOfProduct.add(new Product(name, price, stock));
    }

    //    удаление товара
    public void deleteProduct() {
        System.out.println("Введите название товара, который хотите удалить:");
        String name = in.next();

        for (Product list : listOfProduct) {
            if (list.getName().equals(name)) {
                listOfProduct.remove(list);
            }
        }
    }

    //  вывод на экран
    public void printProduct() {
        System.out.println(listOfProduct);
    }
}
