/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.classesConcreta;

import br.edu.fafic.classesAbstrata.Notebook;

/**
 *
 * @author COMPUTER
 */
public class NotebookContreto extends Notebook{

    public NotebookContreto(String processador, int capacidadeTB, int memoriaGB) {
        super(processador, capacidadeTB, memoriaGB);
    }

    @Override
    public void pc() {
        System.out.println("----Notebook----" + "\n"
        + "Processador: " + this.getProcessador() + "\n"
        + "CapacidadeTB: " + this.getCapacidadeTB() + "\n"
        + "MemoriaGB: " + this.getMemoriaGB() + "\n"
        + "---------------------------------------------");
    }
    
}