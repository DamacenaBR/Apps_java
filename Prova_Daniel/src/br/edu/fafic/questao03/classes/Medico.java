/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao03.classes;

/**
 *
 * @author COMPUTER
 */
public class Medico {
    private String nome;
    private int srm;

    public Medico(String nome, int srm) {
        this.nome = nome;
        this.srm = srm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSrm() {
        return srm;
    }

    public void setSrm(int srm) {
        this.srm = srm;
    }

    @Override
    public String toString() {
        return "Medico{" + "NOME: " + nome + ", SRM: " + srm + '}';
    }
}
