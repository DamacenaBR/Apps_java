
package atividadepolimofismo1;

/**
 *
 * @author bruno
 */
public class Mamifero extends Animal{
    
    private String corDoPelo;
    
    public String getCorDoPelo(){
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    
    @Override
    public void locomover() {
        System.out.println("Andando!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando!!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero!!!");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCor do Pelo: " + getCorDoPelo();
    }
}
