package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";

    private static Connection connection;

    public static Connection getConnect() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                connection.setAutoCommit(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
