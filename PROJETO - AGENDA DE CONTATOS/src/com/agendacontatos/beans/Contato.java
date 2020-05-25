/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agendacontatos.beans;

/**
 *
 * @author Elder Pereira
 */
public class Contato implements Comparable<Contato>{
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
        
    @Override
    public String toString() {
        return "nome=" + nome + ", telefone=" + telefone + " | ";
    }

    @Override
    public int compareTo(Contato outro) {
        return this.nome.compareTo(outro.getNome());
    }
    
}
