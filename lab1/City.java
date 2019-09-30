import java.util.List;
import java.util.Scanner;

public class City extends Shop {
    Scanner in = new Scanner(System.in);

    private List<Shop> listOfShop;

    City(String name, String address, String hours) {
        super(name, address, hours);
    }


    //    открыть магазин в новом городе
    public void toExtendShop() {
        System.out.print("Введите город, в котором вы хотите открыть магазин: ");
        String city = in.next();
        System.out.print("Введите адрес: ");
        String address = in.next();
        System.out.print("Введите часы работы магазина: ");
        String hours = in.next();

        listOfShop.add(new Shop(city, address, hours));
    }
}
