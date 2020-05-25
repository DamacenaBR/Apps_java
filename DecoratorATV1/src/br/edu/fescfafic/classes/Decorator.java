
package br.edu.fescfafic.classes;

public class Decorator extends Arvore{
    
    private Arvore arvore;
    
    public Decorator(Arvore arvore){
        this.arvore = arvore;
    }
          
    @Override
    public void enfeites() {
        this.arvore.enfeites();
    }
    
}
