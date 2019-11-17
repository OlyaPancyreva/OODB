package Lab4;

import Classes.Product;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SaveToDB {

    public static void save(List<Product> products, Connection connection) throws SQLException {

        Gson gson = new Gson();
        String asJson = gson.toJson(products);

        PreparedStatement st = connection.prepareStatement("delete from product where id=1");
        st.execute();

        PreparedStatement statement = connection.prepareStatement("insert into product(id, con, conb) values (1, cast (? as json), cast (? as json))");
        statement.setString(1, asJson);
        statement.setString(2, asJson);

        statement.executeUpdate();
        statement.close();

    }
}
