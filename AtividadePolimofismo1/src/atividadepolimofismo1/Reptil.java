
package atividadepolimofismo1;

/**
 *
 * @author bruno
 */
public class Reptil extends Animal{
    public String corDaEscama;

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
    
    @Override
    public void locomover(){
        System.out.println("Rastejando!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais!!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil!!!");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCor da Escama: " + getCorDaEscama();
    }
    
}
