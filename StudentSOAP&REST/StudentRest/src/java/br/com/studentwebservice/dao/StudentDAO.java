package br.com.studentwebservice.dao;

import br.com.studentwebservice.model.Login;
import br.com.studentwebservice.model.Student;
import br.com.studentwebservice.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Gutemberg
 */
public class StudentDAO{
    
    private Connection connection;
    
    public StudentDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public boolean createStudent(Student student){
        try {
            String sql = "INSERT INTO student (name, rg, grade, user, password) "
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getRg());
            stmt.setDouble(3, student.getGrade());
            stmt.setString(4, student.getLogin().getUser());
            stmt.setString(5, student.getLogin().getPassword());
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error:StudentDAO:create = " + ex);
        }
        return false;
    }
    
    public List<Student> readAll(){
        try {
            String sql = "SELECT * FROM student";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            List<Student> students = new ArrayList<>();
            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setRg(rs.getInt("rg"));
                student.setGrade(rs.getInt("grade"));

                students.add(student);
            }
            stmt.close();
            rs.close();
            return students;
        } catch (SQLException ex) {
            System.err.println("Error:StudentDAO:readAll = " + ex);
        }
        return null;
    }
    
    public Student read(Login login){
        try {
            String sql = "SELECT * FROM student WHERE user = ? AND password = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, login.getUser());
            stmt.setString(2, login.getPassword());
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                Student student2 = new Student();
                student2.setId(rs.getInt("id"));
                student2.setName(rs.getString("name"));
                student2.setRg(rs.getInt("rg"));
                student2.setGrade(rs.getInt("grade"));
                
                return student2;
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error:StudentDAO:read = " + ex);
        }
        return null;
    }
    
    public boolean update(){
        return false;
    }
    
    public boolean delete(Login login){
        try {
            String sql = "DELETE FROM student WHERE user = ? AND password = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, login.getUser());
            stmt.setString(2, login.getPassword());
            
            stmt.execute();
            stmt.close();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Error:StudentDAO:delete = " + ex);
        }
        return false;
    }
}
