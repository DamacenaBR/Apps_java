
import br.edu.fescfafic.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMPUTER
 */
public class TestaConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection con = ConnectionFactory.getConnection();
            System.out.println("Conexão aberta");
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TestaConexao.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }   
}
