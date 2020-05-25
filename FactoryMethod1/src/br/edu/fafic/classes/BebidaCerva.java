
package br.edu.fafic.classes;

public class BebidaCerva extends Bebida{
    
    public BebidaCerva(String nome, double volume) {
        super(nome, volume);
    }

    @Override
    public void tipo() {
        System.out.println("Bebida: " + this.getNome() + "\n"
        + "Volume: " + this.getVolume() +"ml" + "\n"
        + "Tipo: Cerveja");
    }
}
