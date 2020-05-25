
package br.edu.fescfafic.classes;

public class PiscaPisca extends Decorator{
    
    public PiscaPisca(Arvore arvore) {
        super(arvore);
    }

    @Override
    public void enfeites() {
        super.enfeites();
        System.out.print("Pisca-Pisca, ");
    }
}
