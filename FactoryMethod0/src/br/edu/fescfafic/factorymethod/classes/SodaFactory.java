package br.edu.fescfafic.factorymethod.classes;

/**
 *
 * @author Gutemberg
 */
public class SodaFactory extends DrinkFactory {

    @Override
    public Drink produceDrink(String name, double volume) {
        return new Soda(name, volume);
    }
    
}
