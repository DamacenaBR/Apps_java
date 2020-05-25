
package br.edu.fescfafic.classes;

public class AdaptadorPS2ToUSB extends GabineteEntradaUSB{
    public String conectar(TecladoSaidaPS2 tecladoPS2){
        return tecladoPS2.conectar() + getNomeDoGabinete();
    }
}
