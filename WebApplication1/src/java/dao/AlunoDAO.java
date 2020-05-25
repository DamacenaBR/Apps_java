

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;


public class AlunoDAO {

    
    public AlunoDAO()
    {
    
    }
    
    public boolean inserir(Aluno aluno)
    {
        String sql = "INSERT INTO aluno(login, nota, rg) VALUES(?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setString(1, aluno.getLogin());
            pst.setFloat(2, aluno.getNota());
            pst.setInt(3, aluno.getRg());
           
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    public boolean atualizar(Aluno aluno)
    {
        String sql = "UPDATE aluno set nota=?,rg=? where login=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
            pst.setFloat(1, aluno.getNota());
            pst.setInt(2, aluno.getRg());
            pst.setString(3, aluno.getLogin());
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    public boolean excluir(Aluno aluno)
    {
        String sql = "DELETE FROM aluno where login=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
           
            pst.setString(1, aluno.getLogin());
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    
    public List<Aluno> listar()
    {
         String sql = "SELECT * FROM aluno";
        List<Aluno> retorno = new ArrayList<Aluno>();
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Aluno item = new Aluno();
                item.setLogin(res.getString("login"));
               //falta o restante
                
                retorno.add(item);
            }
               
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    
    }
    public Aluno buscar(Aluno aluno)
    {
         String sql = "SELECT * FROM aluno where login=?";
        Aluno retorno = null;
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            pst.setString(1, aluno.getLogin());
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new Aluno();
                retorno.setLogin(res.getString("login"));
             //falta o restante
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    
    }


}
