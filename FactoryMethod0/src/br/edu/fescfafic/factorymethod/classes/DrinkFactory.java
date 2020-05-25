package br.edu.fescfafic.factorymethod.classes;

/**
 *
 * @author Gutemberg
 */
public abstract class DrinkFactory {
    
    public abstract Drink produceDrink(String name, double volume);
    
}
