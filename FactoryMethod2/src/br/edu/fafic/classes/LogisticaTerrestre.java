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
public class LogisticaTerrestre extends Logistica{

    @Override
    public Transporte createTransporte(float capacidadeDeCarga, float distancia) {
        return new Caminhao(capacidadeDeCarga, distancia);
    }
    
}
