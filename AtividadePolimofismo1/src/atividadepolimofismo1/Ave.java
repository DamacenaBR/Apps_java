
package atividadepolimofismo1;

/**
 *
 * @author bruno
 */
public class Ave extends Animal{
    public String corDaPena;

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
    
    public void fazerNinho(){
        System.out.println("Fazendo Ninho!!!");
    }

    @Override
    public void locomover() {
        System.out.println("Voando!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas!!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave!!!");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCor da Pena: " + getCorDaPena();
    }
    
}
