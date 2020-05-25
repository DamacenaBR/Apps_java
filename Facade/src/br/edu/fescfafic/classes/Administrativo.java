
package br.edu.fescfafic.classes;

public class Administrativo {
    public void emitirContrato(Cantor c){
        String s = String.format("Contratato do Cantor (%s) elaborado com sucesso!",c.getNome());
        System.out.println(s);
    }
}
