package R_DataBase;

import java.sql.*;

public class E1_ProcedimientosAlmacenados {
    public static void main(String[] args) {
        /*El procedimiento debe estar creado en la basde de datos, optimiza recurso ya que es el motor
        de la DB quien se encarga de ejecutar el procemiento.
         */

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
            CallableStatement callableStatement = connection.prepareCall("{call CONSULTA_TODO}");
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3));
            }
            resultSet.close();
            callableStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
