
package br.edu.fafic.main;

import br.edu.fafic.classes.Bebida;
import br.edu.fafic.classes.Fabrica;
import br.edu.fafic.classes.FabricaCerva;
import br.edu.fafic.classes.FabricaRefri;

public class main {        

    public static void main(String[] args) {
        
        Fabrica refigeranteBebida = new FabricaRefri();
        Fabrica cervejaBebida = new FabricaCerva();
        
        Bebida refri =  refigeranteBebida.tipoBebida("Coca-Cola", 1000);
        
        Bebida cerva =  cervejaBebida.tipoBebida("Budweiser", 590);
        
        refri.tipo();
        cerva.tipo();
    }
    
}
