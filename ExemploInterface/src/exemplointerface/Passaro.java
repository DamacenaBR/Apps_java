/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerface;

/**
 *
 * @author bruno
 */
public class Passaro implements Aereo {
    
    @Override
    public void voar(){
        System.out.println("Tentando voar....");
    }
}
