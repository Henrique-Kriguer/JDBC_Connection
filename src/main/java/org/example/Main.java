package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args)  {
//        String urlConnection = "jdbc:mysql://localhost/dio";
//
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(urlConnection, "root", "Krigu3r2022#");
//            System.out.println("conectado ao MySql");
//        } catch (Exception e) {
//            System.out.println("Falha ao conectar ao MySql");
//            e.printStackTrace();
//        } finally {
//            connection.close();
//        }
        String driver = "mysql";
        String dataBaseAdress = "localhost";
        String dataBaseName = "dio";
        String user = "root";
        String password = "";

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAdress).append("/")
                .append(dataBaseName);

        String connectionUrl = sb.toString();

        try (Connection connection = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("SUCESSO");
        } catch (SQLException e) {
            System.out.println("FALHA AO CONECTAR AO BD");
            e.printStackTrace();
        }
    }
    }