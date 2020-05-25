/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.listaSimplismente.classes;

/**
 *
 * @author COMPUTER
 */
public class Medico {
    private String nome;
    private int crm;

    public Medico(String nome, int crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    } 
}
