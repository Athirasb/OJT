import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Question1 {

    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        String databaseName = "InventoryDB";
        String tableName = "Products";

        try {
            // Load the MySQL JDBC driver explicitly
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing a connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Create database
            createDatabase(connection, databaseName);

            // Use the new database
            connection.setCatalog(databaseName);

            // Create table
            createTable(connection, tableName);

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new database
    private static void createDatabase(Connection connection, String databaseName) throws SQLException {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;
        Statement statement = connection.createStatement();
        statement.executeUpdate(createDatabaseSQL);
        System.out.println("Database created successfully");
    }

    // Create a new table
    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "product_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "product_name VARCHAR(100) NOT NULL, "
                + "price DOUBLE NOT NULL, "
                + "stock_quantity INT NOT NULL)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableSQL);
        System.out.println("Table created successfully");
    }
    private static void createRecord(Connection connection, String tableName, String product_id, String product_name,String price,String stock_quantity) throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (product_name,price,stock_quantity) VALUES (?, ?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1,product_id);
        preparedStatement.setString(2,product_name);
        preparedStatement.setString(3,price );
        preparedStatement.setString(4,stock_quantity);
        preparedStatement.executeUpdate();
        System.out.println("Record created successfully");
    }
}