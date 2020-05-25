/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.listamenteencadeada.classes;

/**
 *
 * @author COMPUTER
 */
public class Medico {
    private String nome;
    private String especialidade;
    private int rg;
   
    public Medico(){
        
    }
    
    public Medico(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }
    
    public Medico(String nome, String especialidade, int rg) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Medico{" + "Nome: " + nome + ", Especialidade: " + especialidade + ", RG: " + rg + '}';
    }    
}
