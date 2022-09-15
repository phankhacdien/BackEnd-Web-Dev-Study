import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class main {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "11101998dien");
            System.out.println("connection.isValid(0) = " + connection.isValid(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
