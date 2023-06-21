import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/employee";
        String username = "postgres";
        String password = "Arsac@07";
// creating a table and inserting  multiple values;
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

            statement.executeUpdate(createTable); //because table creation is already executed.
            System.out.println("Table Created Successfully");
            String insert1 ="INSERT INTO person (first_name, last_name, gender,email, date_of_birth, country) values 							('Khalil', 'Yurtsev', 'Male','kyurtsev0@cnbc.com','2022-05-29','China')";
            // Perform database operations here
            statement.executeUpdate(insert1);
            System.out.println("inserted row 1 successfully");
            String insert2 ="INSERT INTO person (first_name, last_name, gender,email, date_of_birth, country) values"
            		+ "('Arsac', 'Yurtsev', 'Male','kyurtsev0@cnbc.com','2022-05-29','China'),"
            		+ "('Arsac', 'Yurtsev', 'Male','kyurtsev0@cnbc.com','2022-05-29','China'),"
            		+"('Arsac', 'Yurtsev', 'Male','kyurtsev0@cnbc.com','2022-05-29','China')";
//note that + symbol and ',' at the end of each value (because of syntax in postgres
            // Perform database operations here
            statement.executeUpdate(insert2);
            System.out.println("inserted row 2 successfully");
            statement.close();

            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }
}



// connecting to database server using java program

