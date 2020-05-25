/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.classes;

/**
 *
 * @author COMPUTER
 */
public class AdaptadorBrasilToUSA extends TomadaAmericana{
    public String conecta(PlugBrasileiro plug){
        return plug.obtemEletricidade() + getNomeDaRede();
    }
}
