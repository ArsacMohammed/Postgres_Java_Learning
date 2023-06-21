import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/employee";
        String username = "postgres";
        String password = "Arsac@07";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the PostgreSQL database!");
            Statement statement = connection.createStatement();
            
            String createTable = "CREATE TABLE person("
            	+"id BIGSERIAL NOT NULL PRIMARY KEY,"
            	+"first_name VARCHAR(50) NOT NULL ,"
            	+"last_name VARCHAR(50) NOT NULL,"
            	+"gender VARCHAR(50) NOT NULL,"
            	+"email VARCHAR(150) NOT NULL,"
            	+"date_of_birth DATE NOT NULL,"
            	+"country VARCHAR(50) NOT NULL"
            	+	")";

            statement.executeUpdate(createTable);
            System.out.println("Table Created Successfully");

            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }
}



// connecting to database server using java program

