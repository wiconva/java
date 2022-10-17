package R_DataBase;

import java.sql.*;
import java.time.LocalDate;

public class F1_ProcedimientoParametrizado {
    public static void main(String[] args) {
        try {
            //Obtener la conexión.
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");

            //Preparar la sentencia de call al procedimiento almacenado en DB, agregando los interrogantes para la parametrización.
            CallableStatement callableStatement = connection.prepareCall("{call AGREGAR_USUARIO(?,?,?)}");

            //Parametrizar el procedimiento en este caso un insert.
            callableStatement.setString(1,"Willian Callable parametic");
            callableStatement.setInt(2,36);
            callableStatement.setString(3, "1985-11-18");

            //Ejecutar la senetencia.
            callableStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
