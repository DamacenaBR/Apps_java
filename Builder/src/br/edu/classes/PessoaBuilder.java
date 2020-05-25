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
public class PessoaBuilder implements Builder<PessoaBuilder,Pessoa>{
    
    private String nome;
    private String cpf;
    private String rg;
    private float altura, peso;
    
    public PessoaBuilder(String nome){
        this.nome = nome;
    }

    @Override
    public PessoaBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    @Override
    public PessoaBuilder rg(String rg) {
        this.rg = rg;
        return this;
    }

    @Override
    public PessoaBuilder altura(float altura) {
        this.altura = altura;
        return this;
    }

    @Override
    public PessoaBuilder peso(float peso) {
        this.peso = peso;
        return this;
    }

    @Override
    public Pessoa create() {
        return new Pessoa(nome, cpf, rg, altura, peso);
    }
    
}
