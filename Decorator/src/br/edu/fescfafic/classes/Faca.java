
package br.edu.fescfafic.classes;

public class Faca extends Decorator{
    
    public Faca(Soldado soldado) {
        super(soldado);
    }

    @Override
    public void showGuns() {
        super.showGuns();
        System.out.print("Faca, ");
    }
}
