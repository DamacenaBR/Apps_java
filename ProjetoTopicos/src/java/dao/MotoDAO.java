package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Moto;
import util.ConnectionFactory;

public class MotoDAO {
    
    private Connection connection;
    
    public MotoDAO() throws SQLException{
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public boolean cadastrar(Moto moto) throws SQLException {
        
            String sql = "INSERT INTO moto (marca, cor) VALUES (?,?)";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, moto.getMarca());
            stmt.setString(2, moto.getCor());
            
            stmt.execute();
            stmt.close();
            
            return true;
        }catch(Exception e){
            System.out.println("Erro ao cadastrar moto no banco");
        }
        return false;
    }
    
    public List<Moto> listar(){
        String sql = "SELECT * FROM moto";
        try{
            List<Moto> motos = new ArrayList<>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Moto m = new Moto();
                m.setId(Integer.parseInt(rs.getString("id")));
                m.setMarca(rs.getString("Marca"));
                m.setCor(rs.getString("Cor"));
                motos.add(m);
            }
            
            rs.close();
            stmt.close();
            
            return motos;
        }catch(SQLException o){
            throw new RuntimeException(o);
        }
        
    }
    
    public boolean Editar(Moto moto, int id) throws SQLException {
        
        String sql = "UPDATE moto SET marca=?,cor=? WHERE id=? ";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
         
            stmt.setString(1, moto.getMarca());
            stmt.setString(2, moto.getCor());
            stmt.setInt(3, id);
            
            stmt.execute();
            stmt.close();
            connection.close();
            return true; 
        }catch(Exception e){
            System.out.println("Erro ao atualizar o objeto.");
        } 
        return false;
    }
    
    public boolean Excluir(int ID) throws SQLException{
        
        String sql = "DELETE FROM moto WHERE id = ?";
        
        try{
            
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, ID);
            
            
            stmt.execute();
            stmt.close();
             
            
            
            return true;
        }catch(Exception e){
            System.out.println("Erro ao excluir o objeto.");
        }
        return false;
        
    }
}
    

