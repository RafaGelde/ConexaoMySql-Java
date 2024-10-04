package org.example.Infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    public static Connection conexao() {
        final String URL = "jdbc:mysql://localhost:3306/primeira_api";
        final String USER = "root";
        final String PASSWORD = "Rafaelgelde277353";

        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado");
        } catch (SQLException e) {
            throw new RuntimeException();
        }

        return conexao;
    }
}
