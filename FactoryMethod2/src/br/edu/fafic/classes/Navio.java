/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.classes;

/**
 *
 * @author COMPUTER
 */
public class Navio extends Transporte{

    public Navio(float capacidadeDeCarga, float distancia) {
        super(capacidadeDeCarga, distancia);
    }

    @Override
    public void entrega() {
        System.out.println("Transporte Aquatico\nDistancia: " + this.getDistancia() + "\nCapacidade: " + this.getCapacidadeDeCarga()+"\n");
    }
    
}
