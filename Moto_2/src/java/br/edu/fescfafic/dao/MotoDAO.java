/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.dao;

import br.edu.fescfafic.model.Moto;
import br.edu.fescfafic.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author COMPUTER
 */
public class MotoDAO {
    
    private Connection connection;
    
    public MotoDAO() throws SQLException{
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public boolean cadastrar(Moto moto){
        String sql = "INSERT INTO moto (marca,cor) VALUES (?, ?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, moto.getMarca());
            stmt.setString(2, moto.getCor());
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }
        return false;
    }
    
    public boolean alterarMoto(Moto moto, int id){
        String sql = "UPDATE moto SET marca=?,cor=? where id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, moto.getMarca());
            stmt.setString(2, moto.getCor());
            stmt.setInt(3, id);
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }
        return false;
    }
    
    public boolean excluirMoto(int id){
        String sql = "DELETE FROM moto WHERE id=?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }
        return false;
    }
    
    public List<Moto> getListaMoto(){
        String sql = "SELECT * FROM moto";
              
        List<Moto> listaMoto = new ArrayList<Moto>();
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                Moto moto = new Moto();
                moto.setCor(result.getString("cor"));
                moto.setMarca(result.getString("marca"));
                moto.setId(result.getString("id"));
                listaMoto.add(moto);
            }
            
            stmt.execute();
            stmt.close();
            result.close();
            
            return listaMoto;
        }
        catch(SQLException ex){
            System.err.println("Erro: " + ex);
        }
        
        return null;
    }
}
