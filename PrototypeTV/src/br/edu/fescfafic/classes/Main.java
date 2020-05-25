
package br.edu.fescfafic.classes;

public class Main {

    public static void main(String[] args) {
        TvProtetype tvProtetype = new TvProtetype();
        
        TvPrototypeAbstract smartTv = tvProtetype.clone();
        smartTv.setFabricante("Samsung");
        smartTv.setResolucao(4000);
        smartTv.setTamanho(60);
        smartTv.setValor(5000);
        
        TvPrototypeAbstract tvLed = tvProtetype.clone();
        tvLed.setFabricante("LG");
        tvLed.setResolucao(5000);
        tvLed.setTamanho(60);
        tvLed.setValor(4000);
        
        System.out.println("SmartTV");
        smartTv.exibirInfo();
        System.out.println();
        System.out.println("Tv LED");
        tvLed.exibirInfo();
    }
    
}
