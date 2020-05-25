/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pacote.tres;

import br.pacote.quatro.SuperClasse;

/**
 *
 * @author 5LabComp2
 */
public class MinhaClasse extends SuperClasse implements InterfaceUm, InterfaceDois {

    @Override
    public void metodoInterfaceUm() {
        System.out.println("Método Interface Um");
    }

    @Override
    public void metodoInterfaceDois() {
        System.out.println("Método Interface Dois");
    }

    @Override
    public void metodoSuperClasse() {
        System.out.println("");
    }
    
    
    
}
