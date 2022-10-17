package R_DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class C2_PoblarDB {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
            Statement statement = connection.createStatement();
            for (int i = 0; i<5;i++){
                statement.executeUpdate("INSERT INTO USER (NOMBRE, EDAD, NACIMIENTO) VALUES ('Usuario"+i+"','"+i+"', CURRENT_DATE)");
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
