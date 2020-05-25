
package br.edu.fescfafic.classes;

public class GolPrototype extends CarroPrototype{
    
    public GolPrototype(){
        
    }
    
    public GolPrototype(GolPrototype golPrototype){
        this.valor = golPrototype.getValor();
    }
    
    @Override
    public CarroPrototype clonar() {
       return new GolPrototype(this);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: VW\nModelo: GOL\nValor: " + this.getValor());
    }
    
}
