
package br.edu.fescfafic.classes;

public class Financeiro {
    public void cash(Cantor c){
        String s = String.format("Cash do Cantor (%s) cadastrado com sucesso!",c.getNome());
        System.out.println(s);
    }
}
