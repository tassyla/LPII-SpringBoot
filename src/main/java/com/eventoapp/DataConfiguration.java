package com.eventoapp;

import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DataConfiguration {

    public Connection getConnection(){
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/eventosapp", "postgres", "postgres");
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão: " + e + "\n");
        }
        return conexao;
    }
}
