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
public class Caminhao extends Transporte{

    public Caminhao(float capacidadeDeCarga, float distancia) {
        super(capacidadeDeCarga, distancia);
    }

    @Override
    public void entrega() {
        System.out.println("Transporte Terrestre\nDistancia: " + this.getDistancia() + "\nCapacidade: " + this.getCapacidadeDeCarga()+"\n");
    }
    
}
