
package atividadepolimofismo1;

/**
 *
 * @author bruno
 */
public class Peixe extends Animal{
    public String corDaEscama;

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
    
    public void saltarBolha(){
        System.out.println("Soltando Bolha!!!");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas!!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som!!!");        
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCor da Escama: " + getCorDaEscama();
    }
    
}
