package com.system.eisei.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionConfig {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    private final String serv = "jdbc:sqlserver://localhost:1433;databaseName=prueba";
    private final String user = "sa";
    private final String pass = "1234";

    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(serv, user, pass);

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}