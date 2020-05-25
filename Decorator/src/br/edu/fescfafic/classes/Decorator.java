
package br.edu.fescfafic.classes;

public class Decorator extends Soldado{
    
    private final Soldado soldado;
    
    public Decorator(Soldado soldado){
        this.soldado = soldado;
    }
    
    @Override
    public void showGuns() {
        this.soldado.showGuns();
    }
    
}
