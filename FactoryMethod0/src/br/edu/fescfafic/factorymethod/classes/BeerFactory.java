package br.edu.fescfafic.factorymethod.classes;

/**
 *
 * @author Gutemberg
 */
public class BeerFactory extends DrinkFactory  {

    @Override
    public Drink produceDrink(String name, double volume) {
        return new Beer(name, volume);
    }
    
}
