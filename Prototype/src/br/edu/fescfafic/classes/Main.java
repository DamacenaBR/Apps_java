
package br.edu.fescfafic.classes;

public class Main {

    public static void main(String[] args) {
        GolPrototype golPrototype = new GolPrototype();
        
        CarroPrototype golBasico = golPrototype.clonar();       
        golBasico.setValor(35000.0);
        CarroPrototype golCompleto = golPrototype.clonar();
        golCompleto.setValor(52000.0);
        
        System.out.println("Gol Basico");
        golBasico.exibirInfo();
        System.out.println();
        System.out.println("Gol Completo");
        golCompleto.exibirInfo();
    }
    
}
