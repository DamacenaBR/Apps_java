/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.listamenteduplamenteencadeada.classes;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.especialidade);
        hash = 59 * hash + this.rg;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medico other = (Medico) obj;
        if (this.rg != other.rg) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.especialidade, other.especialidade)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return "Medico{" + "Nome: " + nome + ", Especialidade: " + especialidade + ", RG: " + rg + '}';
    }   
}
