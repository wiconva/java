package R_DataBase;

import java.sql.*;

public class D1_ConsultaParametrizada {
    public static void main(String[] args) {
        /* Se puede pasar parámetros mediante el signo ? , se precompilan y por esto son más eficiente.
           para setear las variables que se pasarn en la consulta es necesario tener encuentea el tipo de
           variable que se utilizará en el filtro.
         */
        try {
            //1. Crear la conexión con la DB, sólo se debe crear una vez.
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");

            //2. Preparar la consulta.
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user WHERE EDAD = ? OR NOMBRE LIKE(?)");

            //3. Pasando los parámetro de busqueda, se debe tener encuenta el tipo de variable y como la introduce el driver en la consulta.
            preparedStatement.setInt(1, 34);
            preparedStatement.setString(2,"Wil%");// No es necesario colocar la comilla simple ya que el driver lo hacer implícitamente.

            //4. Ejecutar la consulta.
            ResultSet resultSet = preparedStatement.executeQuery();

            //Recorrer los resultados.
            if(!resultSet.wasNull()){
                while (resultSet.next()){
                    System.out.println(resultSet.getString(1)+resultSet.getString(2)+resultSet.getString(3));
                }
            }

            //Segunda consulta no fue necesario crear la consulta solo parametrizarla, por eso es más eficiente en memeoria.
            preparedStatement.setString(2,"H%");
            resultSet = preparedStatement.executeQuery();
            System.out.println("\nSegunda Consulta:");
            //Recorrer los resultados.
            if(!resultSet.wasNull()){
                while (resultSet.next()){
                    System.out.println(resultSet.getString(1)+resultSet.getString(2)+resultSet.getString(3));
                }
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
