import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "Arsac@07";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the PostgreSQL database!");

            // Perform database operations here

            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }
}



// connecting to database server using java program

