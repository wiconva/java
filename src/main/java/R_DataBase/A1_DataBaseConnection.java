package R_DataBase;

import java.sql.*;

public class A1_DataBaseConnection {
    public static void main(String[] args) {
        try {
            //Para obtener información de una DB se requieren 4 pasos:
            //1. Conectar con la base de datos por medio del driver requerido para el tipo de DB.
            Connection coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas",
            "root","");

            //2. Obtener el objeto interface Stetament desde la conexión.
            Statement statement = coneccion.createStatement();

            //3. Ejecutar la consulta por medio del objeto stetament.
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USER");

            //4. Recorrer el resultado.
            while (resultSet.next()){
                System.out.println(resultSet.getString("ID_USUARIO")+ " "+resultSet.getString("NOMBRE"));
            }
        } catch (SQLException e) {
            System.out.println("Problemas con conexión a la base de datos");
            e.printStackTrace();
        }
    }
}
