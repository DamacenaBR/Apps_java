/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofixpoo4.dois;

/**
 *
 * @author 2LabComp2
 */
public class Gato extends Felino {

    @Override
    public void fazerBarulho() {
        System.out.println("Miau... miau...");
    }

    @Override
    public void comer() {
        System.out.println("Ração");
    }

}
