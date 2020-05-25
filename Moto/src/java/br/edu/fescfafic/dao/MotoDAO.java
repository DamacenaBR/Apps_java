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
import java.sql.SQLException;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author COMPUTER
 */
public class MotoDAO {
    
    private Connection connection;
    
    public MotoDAO() throws SQLException{
        try{
            this.connection = new ConnectionFactory().getConnection();
        }
        catch(SQLException ex){
            System.out.println("Erro: " + ex);
        }   
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
}
