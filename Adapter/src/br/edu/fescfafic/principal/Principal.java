
package br.edu.fescfafic.principal;

import br.edu.fescfafic.classes.AdaptadorUSAToBrasil;
import br.edu.fescfafic.classes.PlugAmericano;
import br.edu.fescfafic.classes.TomadaBrasileira;

public class Principal {

    public static void main(String[] args) {
        //Alvo(Target) - Tomada Brasileira
        TomadaBrasileira tamadaBrasileira = new TomadaBrasileira();
        
       
        //plug America
        PlugAmericano plugUSA = new PlugAmericano();
        
        AdaptadorUSAToBrasil adaptadorUSAToBrasil = new AdaptadorUSAToBrasil();
        
        System.out.println(adaptadorUSAToBrasil.conecta(plugUSA));
        
    }
    
}
