package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Shop {
    Scanner in = new Scanner(System.in);
    private String name;

    public static List<Worker> listOfWorker = new ArrayList<>();
    public static List<Product> listOfProduct = new ArrayList<>();
    public static List<City> listOfCity = new ArrayList<>();

    public Shop() {
    }

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    расширение магазина в новом городе с входными параметрами
    public void toExtendShop(String city, String address, String hours){
        listOfCity.add(new City(city, address, hours));
    }

//   расширение магазина в новом городе без входных параметров
    public void toExtendShop() {
        System.out.print("Введите город, в котором вы хотите открыть магазин: ");
        String city = in.nextLine();
        System.out.print("Введите адрес: ");
        String address = in.nextLine();
        System.out.print("Введите часы работы магазина: ");
        String hours = in.nextLine();

        listOfCity.add(new City(city, address, hours));
    }


    //    добавление товара
    public void addProduct() {
        System.out.print("Введите название нового товара: ");
        String name = in.next();

        System.out.print("Введите цену: ");
        double price = in.nextDouble();

        System.out.print("Наличие(шт): ");
        int stock = in.nextInt();

        listOfProduct.add(new Product(name, price, stock));
    }

    public void addProduct(String name, double price, int stock){
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



    //    нанять нового сотрудника (без входных данных)
    public void addWorker() {
        System.out.print("Введите имя нового сотрудника: ");
        String name = in.next();
        System.out.print("Номер телефона: ");
        String number = in.next();
        System.out.print("Введите пол: ");
        char gender = in.next().charAt(0);
        System.out.print("Зарплата: ");
        double salary = in.nextDouble();
        listOfWorker.add(new Worker(name, number, gender, salary));
    }

    //    нанять нового сотрудника (с входными данными)
    public void addWorker(String name, String number, char gender, double salary){
        listOfWorker.add(new Worker(name, number, gender, salary));
    }

    //    уволить сотрудника
    public void dismiss() {
        System.out.println("Введите имя сотрудника, которого вы хотите уволить:");
        String name = in.next();
        for (Worker list : listOfWorker) {
            if (list.getName().equals(name)) {
                listOfWorker.remove(name);
            }
        }
    }

    //    вывод на экран всех сотрудников
    public void printWorker() {
        System.out.println(listOfWorker);
    }
}


