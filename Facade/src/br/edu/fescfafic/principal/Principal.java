
package br.edu.fescfafic.principal;

import br.edu.fescfafic.classes.Agencia;
import br.edu.fescfafic.classes.Cantor;

public class Principal {

    public static void main(String[] args) {
        Agencia ag = new Agencia();
        ag.cadastrar(new Cantor("Roberto Carlos"));
    }
    
}
