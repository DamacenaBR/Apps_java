
package br.edu.fafic.classes;

public class FabricaCerva extends Fabrica{

    @Override
    public Bebida tipoBebida(String nome, double volume) {
        return new BebidaCerva(nome, volume);
    }
    
}
