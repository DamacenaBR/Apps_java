package br.edu.fescfafic.factorymethod.classes;

/**
 *
 * @author Gutemberg
 */
public abstract class Drink {
    
    private String name;
    private double volume;

    public Drink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public abstract void printInfo();
}
