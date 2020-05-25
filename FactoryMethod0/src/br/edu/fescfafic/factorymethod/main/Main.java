package br.edu.fescfafic.factorymethod.main;

import br.edu.fescfafic.factorymethod.classes.Beer;
import br.edu.fescfafic.factorymethod.classes.BeerFactory;
import br.edu.fescfafic.factorymethod.classes.Soda;
import br.edu.fescfafic.factorymethod.classes.SodaFactory;

/**
 *
 * @author Gutemberg
 */
public class Main {
    
    public static void main(String[] args) {
        Beer bf = (Beer) new BeerFactory().produceDrink("Heineken", 500);
        bf.printInfo();
        
        Beer bf1 = (Beer) new BeerFactory().produceDrink("Corona", 350);
        bf1.printInfo();
        
        Soda soda1 = (Soda) new SodaFactory().produceDrink("Coke", 350);
        soda1.printInfo();
        
        Soda soda2 = (Soda) new SodaFactory().produceDrink("Pepsi", 350);
        soda2.printInfo();
    }
    
}
