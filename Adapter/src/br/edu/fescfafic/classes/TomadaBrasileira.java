
package br.edu.fescfafic.classes;

public class TomadaBrasileira extends Tomada<PlugBrasileiro>{

    @Override
    public String conecta(PlugBrasileiro plug) {
        return plug.obtemEletricidade() + getNomeDaRede();
     }

    @Override
    public String getNomeDaRede() {
        return "tomada brasileira";
    }
    
}
