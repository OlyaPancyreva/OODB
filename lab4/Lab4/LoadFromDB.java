package Lab4;

import Classes.Product;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class LoadFromDB {
    public static List<Product> loadJson(Connection connection) throws SQLException {
        long startTime = System.currentTimeMillis();

        String pStr = "";

        PreparedStatement statement = connection.prepareStatement("select con from product");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            pStr = resultSet.getString("con");
        }

        statement.close();

        Gson gson = new Gson();

        Product[] list = gson.fromJson(pStr, Product[].class);

        long stopTime = System.currentTimeMillis();
        long res = stopTime - startTime;
        System.out.println("Время загрузки из базы данных json = " +res);

        return Arrays.asList(list);

    }

    public static List<Product> loadJsonb(Connection connection) throws SQLException {
        long startTime = System.currentTimeMillis();
        String pStr = "";

        PreparedStatement statement = connection.prepareStatement("select conb from product");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            pStr = resultSet.getString("conb");
        }

        statement.close();

        Gson gson = new Gson();

        Product[] list = gson.fromJson(pStr, Product[].class);

        long stopTime = System.currentTimeMillis();
        long res = stopTime - startTime;
        System.out.println("Время загрузки из базы данных jsonb = " + res);
        return Arrays.asList(list);
    }
}
