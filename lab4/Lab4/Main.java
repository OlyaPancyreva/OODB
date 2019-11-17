package Lab4;

import Classes.Product;
import Json.JsonReader;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String login = "postgres";
            String password = "olya";
            Connection con = DriverManager.getConnection(url, login, password);

            List<Product> list = LoadFromDB.loadJson(con);
            List<Product> list1 = LoadFromDB.loadJsonb(con);
            SaveToDB.save(list, con);

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
