package dbcontext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    private static DBContext instance;
    private static Connection connection;
    private final String URL = "jdbc:mysql://localhost:3306/j2_project";
    private final String USER = "root";
    private final String PASSWORD = "";

    private DBContext() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Kết nối cơ sở dữ liệu thành công!");
        } catch (Exception e) {
            System.out.println("Kết nối thất bại!");
            e.printStackTrace();
        }
    }

    public static synchronized DBContext getInstance() {
        if (instance == null) {
            instance = new DBContext();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Closed connection!");
            } catch (SQLException e) {
                System.out.println("Close connection failed!");
                e.printStackTrace();
            }

        }
    }
}
