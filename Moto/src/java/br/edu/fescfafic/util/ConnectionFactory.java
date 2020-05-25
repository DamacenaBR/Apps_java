/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private final static String URL = "jdbc:postgresql://localhost:5432/loja";
    private final static String USUARIO = "postgres";
    private final static String SENHA = "123456";
    private static Connection con = null;
    
    public static Connection getConnection()throws SQLException{
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException ex) {
            return (Connection) new SQLException(ex);
        }
    }
}
