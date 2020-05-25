package br.com.studentwebservice.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gutemberg
 */
public class ConnectionFactory {
    
    private static final String URL = "jdbc:mysql://localhost/studentwebservice";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error:ConnectionFactory:getConnection = " + ex);
        }
        return null;
    }
}
