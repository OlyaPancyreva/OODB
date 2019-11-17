package Search;

import Classes.City;
import Classes.Product;
import Classes.Shop;

import java.util.Scanner;

public class Search {
    Scanner in = new Scanner(System.in);

//    поиск товара по наименованию
    public void FIND_PRODUCT_BY_NAME() {
        System.out.print("Введите наименование товара:");
        String name = in.nextLine().toLowerCase();

        for (Product products: Shop.listOfProduct){
            if (products.getName().toLowerCase().contains(name)){
                System.out.println(products.getName()+ " " + products.getPrice() + "руб, в наличие(шт): " + products.getStock());
            }
        }
    }

//    поиск города по названию
    public void FIND_CITY_BY_NAME(){
        System.out.print("Введите название города:");
        String name = in.nextLine().toLowerCase();

        for (City city: Shop.listOfCity){
            if (city.getCity().toLowerCase().contains(name)){
                System.out.println(city.getCity()+ ", ул. " + city.getAddress() + ", часы работы: " + city.getHours());
                break;
            }
        }
    }
}
