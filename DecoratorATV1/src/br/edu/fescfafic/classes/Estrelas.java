
package br.edu.fescfafic.classes;

public class Estrelas extends Decorator{
    
    public Estrelas(Arvore arvore) {
        super(arvore);
    }

    @Override
    public void enfeites() {
        super.enfeites();
        System.out.print("Estrelas, ");
    }
}
