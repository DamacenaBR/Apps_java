/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.classes;

/**
 *
 * @author COMPUTER
 */
public interface Builder <K,T>{
    public K cpf(String cpf);
    public K rg(String rg);
    public K altura(float altura);
    public K peso(float peso);
    public T create();
}
