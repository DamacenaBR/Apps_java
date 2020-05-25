/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeheranca1;

/**
 *
 * @author bruno
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Aluno (){
        
    }
    
    public Aluno(String nome, int idade, String sexo){
        super(nome, idade, sexo);
    }
    
    public Aluno(String nome, int idade, String sexo, int matricula, String curso){
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + 
                getSexo() + "\nMatricula: " + getMatricula() + "\nCruso: " + getCurso();
    }
 
}
