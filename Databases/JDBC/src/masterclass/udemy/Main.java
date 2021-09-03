package masterclass.udemy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Java-Masterclass\\Databases\\JDBC\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

            //*RECOMMENDED CONNECTION*
//      try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Java-Masterclass\\Databases\\JDBC\\testjava.db");
//           Statement statement = conn.createStatement()) {
//           statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
            statement.close();
            conn.close();

        }catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
