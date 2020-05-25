
package br.edu.fescfafic.classes;

public class Pistola extends Decorator{
    
    public Pistola(Soldado soldado) {
        super(soldado);
    }

    @Override
    public void showGuns() {
        super.showGuns();
        System.out.print("Pistola, ");
    }
}
