package Json;

import Classes.Shop;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    //    запись в файл
    public void toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("Workers.json")) {
            gson.toJson(Shop.listOfWorker, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("Products.json")) {
            gson.toJson(Shop.listOfProduct, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("City.json")) {
            gson.toJson(Shop.listOfCity, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Shop.temp.add(Shop.listOfProduct);
        Shop.temp.add(Shop.listOfWorker);
        Shop.temp.add(Shop.listOfCity);

        try (FileWriter writer = new FileWriter("temp.json")) {
            gson.toJson(Shop.temp, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
