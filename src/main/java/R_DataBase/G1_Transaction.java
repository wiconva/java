package R_DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class G1_Transaction {
    public static void main(String[] args) throws SQLException {
        /*Una transacción garantiza que  el flujo se realiza correctamente, si es necesario modificar n tablas
        pero si uno de esta no se pudo modificar por algún problema la transacción no se realiza y no se modifica ninguna tabla
         */
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pruebas","root","");

            //Se ajuste el valor al autocommit por defecto es true lo que significa que cada proceso a DB se realiza por separado.
            connection.setAutoCommit(false);//Que se va a tratar como un bloque,  o nada.

            Statement statement = connection.createStatement();

            //Primer inserción está bien.
            statement.executeUpdate("INSERT INTO user (NOMBRE, EDAD, NACIMIENTO) VALUES ('Dante', '2','2022-05-10 ')");

            //Segunda esta mal el formato de la fecha y por esto falla lo que ocaciona que el primer registro tampoco se guarde.
            statement.executeUpdate("INSERT INTO user (NOMBRE,EDAD,NACIMIENTO) VALUES ('PERRO', 5 , '2025-12-1947')");
            //Confirma los cambios.
            connection.commit();
            System.out.println("Usuario agregado con éxito!!!");

        } catch (SQLException e) {
            connection.rollback();//Devuelve la DB a su estado original.
            System.out.println("Algo fue mal y la TX no pudo terminar...");
            e.printStackTrace();
        }
    }
}
