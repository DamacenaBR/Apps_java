
package br.edu.fescfafic.classes;


public class RH {
    public void cadastrar(Cantor c){
        String s = String.format("Cantor (%s) cadastrado com sucesso!",c.getNome());
        System.out.println(s);
    }
}
