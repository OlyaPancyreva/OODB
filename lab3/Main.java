import Classes.Shop;
import Search.Search;
import XML.LoadXML;
import XML.SaveXML;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        Shop shop = new Shop();
        shop.addWorker("Ольга","+79178873321",'ж',45000);
        shop.addWorker("Алексей", "+79651905192", 'м', 65000);
        shop.addWorker("Иван", "+79224868441", 'м', 13000);


        shop.addProduct("Игрушка", 500.0, 10);
        shop.addProduct("Игрушка", 200.0, 3);
        shop.addProduct("Машинка", 350.0, 15);
        shop.addProduct("Открытка", 600.0, 7);

        shop.toExtendShop("Казань", "Солнечная 10", "10-21");
        shop.toExtendShop("Казань", "Кремлевская 1", "10-22");
        shop.toExtendShop("Москва", "Челюскина 24", "10-22");
        shop.toExtendShop("Иваново", "Кирова 15", "10-22");

        
        LoadXML.loadData();
	SaveXML.saveData(shop);



//        Search search = new Search();
//        search.product_FIND_BY_NAME();
//        search.city_FIND_BY_NAME();

//        Sorted.SORT_WORKER_BY_NAME();
//        Sorted.SORT_WORKER_BY_PHONE();

    }
}
