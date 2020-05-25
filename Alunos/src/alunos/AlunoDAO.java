/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author COMPUTER
 */
public class AlunoDAO implements DAO{
    
    List<Aluno> alunos = new ArrayList<>();

    @Override
    public boolean creade(Aluno alunos) {
        alunos.add(alunos);
        return true;
    }

    @Override
    public boolean creade(int index, Aluno alunos) {
        alunos.set(index, alunos);
        return true;
    }

    @Override
    public Aluno[] read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Aluno alunos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(int indes, Aluno alunos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Aluno alunos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
