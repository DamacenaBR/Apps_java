
package br.edu.fafic.classes;

public class FabricaRefri extends Fabrica{

    @Override
    public Bebida tipoBebida(String nome, double volume) {       
        return new BebidaRefri(nome, volume);
    }
    
}
