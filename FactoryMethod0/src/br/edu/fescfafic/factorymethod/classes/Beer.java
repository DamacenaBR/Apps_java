package br.edu.fescfafic.factorymethod.classes;

/**
 *
 * @author Gutemberg
 */
public class Beer extends Drink {

    public Beer(String name, double volume) {
        super(name, volume);
    }

    @Override
    public void printInfo() {
        System.out.println("Beer produced!\n"
                         + "Name: " + this.getName() + "\nVolume: " + this.getVolume()+"\n");
    }
    
}
