package com.br.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.br.modelo.User;
import com.br.util.DbUtil;

public class UserDao {

    private Connection connection;

    public UserDao() {
        connection = DbUtil.getConnection();
    }

    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into usuario_so(nome,sexo,salario,cpf) values (?, ?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getSexo());
            preparedStatement.setDouble(3, user.getSalario());
            preparedStatement.setLong(4, user.getCPF());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(long CPF) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from usuario_so where cpf=?");
            // Parameters start with 1
            preparedStatement.setLong(1, CPF);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update usuario_so set nome=?,sexo=?,salario=?"
                            + "where cpf=?");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getSexo());
            preparedStatement.setDouble(3, user.getSalario());
            preparedStatement.setLong(4, user.getCPF());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from usuario_so");
            while (rs.next()) {
                User user = new User();
                user.setCPF(rs.getLong("CPF"));
                user.setNome(rs.getString("nome"));
                user.setSexo(rs.getString("sexo"));
                user.setSalario(rs.getDouble("salario"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public User getUserById(long  CPF) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from usuario_so where cpf=?");
            preparedStatement.setLong(1, CPF);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setCPF(rs.getLong("CPF"));
                user.setNome(rs.getString("nome"));
                user.setSexo(rs.getString("sexo"));
                user.setSalario(rs.getDouble("salario"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
