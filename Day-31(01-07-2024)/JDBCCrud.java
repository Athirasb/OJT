import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCCrud{
    private static final String URL = "jdbc:mysql://localhost:3306/employeedata";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            int id = 1;

            System.out.println("Initial table data:");
            readRecord(connection);

            if (!recordExists(connection, id)) {
                createRecord(connection, id, "Neeraja_Menon", "neeraj@123gmail.com");
            }
            System.out.println("After creating record:");
            readRecord(connection);

            updateRecord(connection, id, "neeraj_nambiar", "neeraj@gmail.com");
            System.out.println("After updating record:");
            readRecord(connection);

//            deleteRecord(connection, id);
//            System.out.println("After deleting record:");
            readRecord(connection);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean recordExists(Connection connection, int id) throws SQLException {
        String sql = "SELECT 1 FROM users WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        }
    }

    private static void createRecord(Connection connection, int id, String name, String email) throws SQLException {
        String sql = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, email);
            statement.executeUpdate();
            System.out.println("Record created successfully");
        }
    }

    private static void readRecord(Connection connection) throws SQLException {
        String sql = "SELECT * FROM users";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        }
    }

    private static void updateRecord(Connection connection, int id, String newName, String newEmail) throws SQLException {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, newName);
            statement.setString(2, newEmail);
            statement.setInt(3, id);
            statement.executeUpdate();
            System.out.println("Record updated successfully");
        }
    }

//    private static void deleteRecord(Connection connection, int id) throws SQLException {
//        String sql = "DELETE FROM users WHERE id = ?";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, id);
//            statement.executeUpdate();
//            System.out.println("Record deleted successfully");
//        }
//    }
}