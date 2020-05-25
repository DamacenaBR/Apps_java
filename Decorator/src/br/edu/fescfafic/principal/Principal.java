
package br.edu.fescfafic.principal;

import br.edu.fescfafic.classes.Faca;
import br.edu.fescfafic.classes.Granada;
import br.edu.fescfafic.classes.Pistola;
import br.edu.fescfafic.classes.Soldado;
import br.edu.fescfafic.classes.SoldadoMariner;
import br.edu.fescfafic.classes.SoldadoSeal;

public class Principal {

    public static void main(String[] args) {
        Soldado seal = new SoldadoSeal();
        Soldado mariner = new SoldadoMariner();
        
        seal = new Granada(seal);
        seal = new Granada(seal);
        seal = new Pistola(seal);
        seal = new Faca(seal);
        
        mariner = new Granada(mariner);
        mariner = new Pistola(mariner);
        mariner = new Faca(mariner);
        mariner = new Faca(mariner);
        
        seal.showGuns();
        System.out.println();
        mariner.showGuns();
        
        
        
    }
    
}
