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
public class Aluno {
    
    public int matricula;
    public String nome;
    public int idade;
    public String curso;
    public int periodo;

    public Aluno(){
        
    }
    
    public Aluno(int matricula, String nome, int idade, String curso, int periodo) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.periodo = periodo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\nNome: " + nome + "\nIdade: " + 
                idade + "\nCurso: " + curso + "\nPeriodo: " + periodo;
    }

    void add(Aluno alunos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void set(int index, Aluno alunos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
