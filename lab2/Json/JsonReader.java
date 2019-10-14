package Json;

import Classes.City;
import Classes.Product;
import Classes.Shop;
import Classes.Worker;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonReader {
    //    чтение из файла
    public void fromJson() {

        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Workers.json"));
            BufferedReader br2 = new BufferedReader(new FileReader("City.json"));
            BufferedReader br3 = new BufferedReader(new FileReader("Products.json"));
            Worker[] object = gson.fromJson(br, Worker[].class);
            City[] object2 = gson.fromJson(br2, City[].class);
            Product[] object3 = gson.fromJson(br3, Product[].class);

            for (Worker workers : object) {
                Shop.listOfWorker.add(new Worker(workers.getName(), workers.getNumber(), workers.getGender(), workers.getSalary()));
            }

            for (City city1 : object2) {
                Shop.listOfCity.add(new City(city1.getCity(), city1.getAddress(), city1.getHours()));
            }

            for (Product products : object3) {
                Shop.listOfProduct.add(new Product(products.getName(), products.getPrice(), products.getStock()));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        } catch (JsonIOException e) {
            e.printStackTrace();
        }
    }
}
