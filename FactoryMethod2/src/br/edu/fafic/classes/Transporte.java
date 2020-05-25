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
public abstract class Transporte {
    
    private float capacidadeDeCarga;
    private float distancia;

    public Transporte(float capacidadeDeCarga, float distancia) {
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.distancia = distancia;
    }

    public float getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(float capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    
    public abstract void entrega();
}
