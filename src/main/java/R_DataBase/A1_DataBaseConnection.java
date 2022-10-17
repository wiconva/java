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
            int edad;
            String nombre;
            Date fechaNacimiento;
            while (resultSet.next()){
                nombre = resultSet.getString("NOMBRE");//Se puede acceder através del nombre o número de la columna en la tabla DB.
                edad = resultSet.getInt("EDAD");//El tipo de dato depende del tipo de dato en DB, siendo genérico String.
                fechaNacimiento = resultSet.getDate("NACIMIENTO");
                System.out.println(resultSet.getString("ID_USUARIO")+ " Nombre:"+ nombre+ "\tEdad: "+ edad+"\tNacimiento:\t"+ fechaNacimiento);
            }

            resultSet.close();
            statement.close();
            coneccion.close();
        } catch (SQLException e) {
            System.out.println("\nProblemas con conexión a la base de datos\n");
            e.printStackTrace();
        }
    }
}
