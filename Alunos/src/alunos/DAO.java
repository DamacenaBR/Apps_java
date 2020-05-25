/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunos;

/**
 *
 * @author COMPUTER
 */
public interface DAO {
    boolean creade(Aluno alunos);
    boolean creade (int index, Aluno alunos);
    Aluno [] read();
    boolean update(Aluno alunos);
    boolean update(int indes, Aluno alunos);
    boolean delete(Aluno alunos);
    boolean delete();
    
}
