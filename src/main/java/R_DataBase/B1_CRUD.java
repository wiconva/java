package R_DataBase;

import java.sql.*;

public class B1_CRUD {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
            Statement statement = connection.createStatement();

            //Create
            statement.executeUpdate("INSERT INTO USER (NOMBRE, EDAD, NACIMIENTO) VALUES ('HELLEN CONDE',11,'2011-05-10')");

            //Read
            ResultSet resultSet =  statement.executeQuery("SELECT * FROM USER");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3));
            }

            //Update
            statement.executeUpdate("UPDATE user SET EDAD = EDAD+1 WHERE NOMBRE like ('Willian%')");

            //Delete
            statement.executeUpdate("DELETE FROM USER WHERE ID_USUARIO >9");

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
