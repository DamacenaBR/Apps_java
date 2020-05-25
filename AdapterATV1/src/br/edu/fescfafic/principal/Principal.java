
package br.edu.fescfafic.principal;

import br.edu.fescfafic.classes.AdaptadorPS2ToUSB;
import br.edu.fescfafic.classes.GabineteEntradaUSB;
import br.edu.fescfafic.classes.TecladoSaidaPS2;

public class Principal {

    public static void main(String[] args) {
        TecladoSaidaPS2 tecladoPS2 = new TecladoSaidaPS2();
        GabineteEntradaUSB gabineteUSB = new GabineteEntradaUSB();
        AdaptadorPS2ToUSB adaptador = new AdaptadorPS2ToUSB();
        System.out.println(adaptador.conectar(tecladoPS2));
    }
    
}
