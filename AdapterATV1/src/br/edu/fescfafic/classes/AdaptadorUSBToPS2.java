
package br.edu.fescfafic.classes;

public class AdaptadorUSBToPS2 extends GabineteEntradaPS2{
    public String conectar(TecladoSaidaUSB TecladoUSB){
        return TecladoUSB.conectar() + getNomeDoGabinete();
    }
}
