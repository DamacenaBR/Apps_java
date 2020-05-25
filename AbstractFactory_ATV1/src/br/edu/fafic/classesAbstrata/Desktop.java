/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.classesAbstrata;

/**
 *
 * @author COMPUTER
 */
public abstract class Desktop {
    private String processador;
    private int capacidadeTB;
    private int memoriaGB;

    public Desktop(String processador, int capacidadeTB, int memoriaGB) {
        this.processador = processador;
        this.capacidadeTB = capacidadeTB;
        this.memoriaGB = memoriaGB;
    }
    
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getCapacidadeTB() {
        return capacidadeTB;
    }

    public void setCapacidadeTB(int capacidadeTB) {
        this.capacidadeTB = capacidadeTB;
    }

    public int getMemoriaGB() {
        return memoriaGB;
    }

    public void setMemoriaGB(int memoriaGB) {
        this.memoriaGB = memoriaGB;
    }
    
    public abstract void pc();

    @Override
    public String toString() {
        return "Desktop{" + "processador=" + processador + ", capacidadeTB=" + capacidadeTB + ", memoriaGB=" + memoriaGB + '}';
    }
    
}
