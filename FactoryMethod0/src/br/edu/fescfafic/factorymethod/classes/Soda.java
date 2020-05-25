package br.edu.fescfafic.factorymethod.classes;

/**
 *
 * @author Gutemberg
 */
public class Soda extends Drink {

    public Soda(String name, double volume) {
        super(name, volume);
    }

    @Override
    public void printInfo() {
        System.out.println("Soda produced!\n"
                         + "Name: " + this.getName() + "\nVolume: " + this.getVolume()+"\n");
    }

    
}
