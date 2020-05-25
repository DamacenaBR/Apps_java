
package br.edu.fescfafic.classes;

public class Main {

    public static void main(String[] args) {
        GolPrototype golPrototype = new GolPrototype();
        
        CarroPrototype golCompleto = golPrototype.clone();
        golCompleto.setValor(52000.0);
        
        CarroPrototype golBasico = golPrototype.clone();
        golBasico.setValor(40000.0);
        
        System.out.println("Gol Basico");
        golBasico.exibirInfo();
        System.out.println();
        System.out.println("Gol Completo");
        golCompleto.exibirInfo();               
    }
    
}
