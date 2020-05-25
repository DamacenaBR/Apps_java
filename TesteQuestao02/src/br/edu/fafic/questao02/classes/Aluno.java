/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao02.classes;

/**
 *
 * @author COMPUTER
 */
public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    
    public Aluno(String nome, String curso, int matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "NOME: " + nome + ", MATRICULA: " + matricula + ", CURSO: " + curso;
    }
}
