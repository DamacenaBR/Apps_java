
package br.edu.fescfafic.classes;

public class Bolas extends Decorator{
    
    public Bolas(Arvore arvore) {
        super(arvore);
    }

    @Override
    public void enfeites() {
        super.enfeites();
        System.out.print("Bolas, ");
    }  
}
