package org.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    // Dados de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/callOfWarSystemInfo"; // Substitua com seu banco de dados
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Metodo para obter a conexão com o banco de dados
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
