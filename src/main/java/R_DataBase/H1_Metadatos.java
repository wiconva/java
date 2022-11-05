package R_DataBase;

import java.sql.*;

public class H1_Metadatos {
    public static void main(String[] args) {
        /*Los metadatos son datos que hacen referencia a los datos sobre la estructura de la DB, pueden utilizarse para crear
         aplicaciones genéricas que se conecten a cualquier base de datos.
         */
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
            DatabaseMetaData databaseMetaData =  connection.getMetaData();
            System.out.println(databaseMetaData.getDriverName());
            System.out.println(databaseMetaData.getDriverVersion());

            //Obtiene los metadatos de las tablas.
            ResultSet rs = databaseMetaData.getTables(null,null,null,null);

            while   (rs.next()){
                System.out.println(rs.getString("TABLE_NAME"));//Devuelve una conjunto donde se lee la columna nombre tabla.
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
