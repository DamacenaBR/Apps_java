
package br.edu.fescfafic.classes;

public class Marketing {
    public void divulgar(Cantor c){
        String s = String.format("divulgação do Show do Cantor (%s) realisado com sucesso!",c.getNome());
        System.out.println(s);
    }
}
