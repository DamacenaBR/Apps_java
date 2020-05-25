/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;
/**
 *
 * @author COMPUTER
 */
public class Objeto<T> {

    private T objeto;
    
    public void setObjeto(T objeto){
        this.objeto = objeto;
    }
    
    public T getObjeto(){
        return this.objeto;
    }   
    
    public static void main(String[] args) {
        Objeto<Double> objDouble = new Objeto<>();
        Objeto<String> objString = new Objeto<>();
        
        objDouble.setObjeto(19.0);
        objString.setObjeto("Sou dono do mundo!!!");
        
        System.out.println(objDouble.getObjeto());
        System.out.println(objString.getObjeto());
    }
}
