
package br.edu.fescfafic.classes;

public class Granada extends Decorator{
    
    public Granada(Soldado soldado) {
        super(soldado);
    }
    
    @Override
    public void showGuns(){
        super.showGuns();
        System.out.print("Granada, ");
    }
    
}
