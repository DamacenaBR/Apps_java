
package br.edu.fescfafic.classes;

public class GabineteEntradaPS2 extends Gabinete<TecladoSaidaPS2>{

    @Override
    public String conectado(TecladoSaidaPS2 teclado) {
       return teclado.conectar() + getNomeDoGabinete();
    }

    @Override
    public String getNomeDoGabinete() {
        return "gabinete entrada PS2";
    }
    
}
