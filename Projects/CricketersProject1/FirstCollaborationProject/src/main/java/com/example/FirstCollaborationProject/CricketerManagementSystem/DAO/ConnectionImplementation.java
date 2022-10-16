package com.example.FirstCollaborationProject.CricketerManagementSystem.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionImplementation implements ConnectionDetails {

    static Connection connection;


    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName(Driver);
                connection = DriverManager.getConnection(Url, Username, Password);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
        return connection;
    }

}

