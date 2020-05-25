
package edu.fescfafic.buildersubway.main;

import edu.fescfafic.buildersubway.builder.SanduicheBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author COMPUTER
 */
public class BuilderSubway {

    public static void main(String[] args) {
        
        List<String> molhos = new ArrayList<>();
        molhos.add("Maionese");
        molhos.add("Mostarda");
        molhos.add("Ketchup");
        
        System.out.println(new SanduicheBuilder("Italiano").recheio("Frango").molhos(molhos).extra("Bacon").create());
        
    }
    
}
