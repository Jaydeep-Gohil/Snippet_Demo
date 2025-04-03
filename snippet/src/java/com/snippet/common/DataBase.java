package com.snippet.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    public static Connection connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql:///snippet_demo", "root", "");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver not found!.", e);
        }
    }
}
