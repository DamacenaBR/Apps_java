
package atividadepolimofismo1;

/**
 *
 * @author bruno
 */
public class AtividadePolimofismo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Canguru can = new Canguru();
        Cachorro cac = new Cachorro();
        Cobra cob = new Cobra();
        Tartaruga tar = new Tartaruga();
        Goldfish gol = new Goldfish();
        Arara ara = new Arara();
        
        can.setCorDoPelo("branco");
        can.setPeso(11.5f);
        can.setIdade(11);
        can.setMembros(4);
        can.locomover();
        can.alimentar();
        can.emitirSom();
        can.usarBolsa();
        System.out.println(can);
        System.out.println("-------------------");
        
        
        
        


    }
    
}
