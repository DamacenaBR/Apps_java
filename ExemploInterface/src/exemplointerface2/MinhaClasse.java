/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerface2;

/**
 *
 * @author bruno
 */
public class MinhaClasse extends SuperClasse implements Interface1, Interface2{
    
    @Override
    public void metodoInterface1() {
        System.out.println("Metodo Interface 1");
    }
    
    @Override
    public void metodoInterface2() {
        System.out.println("metodo Interface 2");
    }

    @Override
    public void metodoSuperClasse() {
        System.out.println("Metodo Super Classe");
    }
}
