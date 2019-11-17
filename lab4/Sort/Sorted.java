package Sort;

import Classes.Product;
import Classes.Shop;
import Classes.Worker;

import java.util.Collections;

public class Sorted {

    //    сортировка сотрудников по имени
    public static void SORT_WORKER_BY_NAME() {
        Collections.sort(Shop.listOfWorker, Worker.SORT_BY_NAME);
        Shop.printWorker();
    }

    //    сортировка сотрудников по номеру телефона
    public static void SORT_WORKER_BY_PHONE() {
        Collections.sort(Shop.listOfWorker, Worker.SORT_BY_PHONE);
        Shop.printWorker();
    }

    //    сортировка товаров по наименованию
    public static void SORT_PRODUCT_BY_NAME() {
        Collections.sort(Shop.listOfProduct, Product.SORT_BY_NAME);
        Shop.printProduct();
    }

}
