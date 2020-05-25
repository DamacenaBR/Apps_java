
package br.edu.fescfafic.classes;

public class GolPrototype extends CarroPrototype{

    public GolPrototype(){
        
    }

    public GolPrototype(GolPrototype golPrototype){
        this.valor = golPrototype.getValor();
    }
    
    @Override
    protected CarroPrototype clone() {
        return new GolPrototype(this);
    }
    
    @Override
    public void exibirInfo() {
       System.out.println("Marca: VW\nModelo: GOL\nValor: " + this.getValor()); 
    }
    
}
