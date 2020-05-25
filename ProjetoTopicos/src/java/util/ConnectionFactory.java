package util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public static final String URL = "jdbc:mysql://localhost/loja";
    public static final String USUARIO = "root";
    public static final String SENHA = "";
    public static Connection con = null;
    
    public static Connection getConnection() throws SQLException {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
            
        }catch(ClassNotFoundException o){
            throw new SQLException(o);
        }
    }
    
}
