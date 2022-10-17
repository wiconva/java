package R_DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class C1_LimpiarDB {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE  FROM USER ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
