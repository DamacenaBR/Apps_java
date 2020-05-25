
import br.edu.fescfafic.dao.MotoDAO;
import br.edu.fescfafic.model.Moto;
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
public class TesteDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MotoDAO m = new MotoDAO();
            Moto moto = new Moto();
            moto.setMarca("Suzuki");
            moto.setCor("violeta");
//            m.cadastrar(moto);
//            m.alterarMoto(moto,7);           
//            m.excluirMoto(15);
        } catch (SQLException ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Erro ao testar a class MotoDAO!!!");
        }
    }    
}
