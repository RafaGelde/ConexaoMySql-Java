package org.example;

import org.example.Infra.MySqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        Connection conexao = MySqlConnection.conexao();

        String comando = "SELECT * FROM usuario";

        try {
            Statement stmt = conexao.createStatement();

            ResultSet resultado = stmt.executeQuery(comando);

            while(resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");

                System.out.println("oi "+nome+" Seu email é "+email+"?");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}