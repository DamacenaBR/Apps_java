/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepolimofismo1;

/**
 *
 * @author bruno
 */
public class Canguru extends Mamifero{
    
    public void usarBolsa(){
        System.out.println("usando Bolsa!!!");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Canguru!!!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando!!!");
    }
}
