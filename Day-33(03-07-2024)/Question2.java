import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Question2 {

    private static final String URL = "jdbc:mysql://localhost:3306/CustomerDB";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            createTable();
            insertRecord("Athira", "Japan");
            insertRecord("Soorya", "Bangalore");
            insertRecord("Mahima", "Thailand");

            retrieveAndPrintRecords();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void createTable() throws Exception {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Customers (" +
                "customer_id INT AUTO_INCREMENT PRIMARY KEY, " +
                "customer_name VARCHAR(255), " +
                "city VARCHAR(255))";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createTableSQL);
        }
    }

    private static void insertRecord(String customerName, String city) throws Exception {
        String insertSQL = "INSERT INTO Customers (customer_name, city) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setString(1, customerName);
            pstmt.setString(2, city);
            pstmt.executeUpdate();
        }
    }

    private static void retrieveAndPrintRecords() throws Exception {
        String selectSQL = "SELECT * FROM Customers";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(selectSQL)) {
            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String customerName = rs.getString("customer_name");
                String city = rs.getString("city");
                System.out.println("ID: " + customerId + ", Name: " + customerName + ", City: " + city);
            }
        }
    }
}