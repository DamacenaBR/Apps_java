
package br.edu.fescfafic.classes;

public class Pessoa implements Passageiros{
    
    private String nome;
    private int codigo;

    public Pessoa(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }
    
}
