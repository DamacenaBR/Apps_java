/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorevisãoPoo;

/**
 *
 * @author bruno
 */
public class Categoria {
    private String nome;
    private int atribute;

    public Categoria() {
        
    }

    public Categoria(String nome, int atribute) {
        this.nome = nome;
        this.atribute = atribute;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtribute() {
        return atribute;
    }

    public void setAtribute(int atribute) {
        this.atribute = atribute;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nAtribute: " + atribute;
    }
        
}
