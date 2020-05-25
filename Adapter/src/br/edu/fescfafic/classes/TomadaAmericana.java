
package br.edu.fescfafic.classes;

public class TomadaAmericana extends Tomada<PlugAmericano>{

    @Override
    public String conecta(PlugAmericano plug) {
        return plug.obtemEletricidade() + getNomeDaRede();
    }

    @Override
    public String getNomeDaRede() {
        return "tomada americana";
    }
    
}
