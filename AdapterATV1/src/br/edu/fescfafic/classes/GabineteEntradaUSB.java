
package br.edu.fescfafic.classes;

public class GabineteEntradaUSB extends Gabinete<TecladoSaidaUSB>{

    @Override
    public String conectado(TecladoSaidaUSB teclado) {
        return teclado.conectar() + getNomeDoGabinete();
    }

    @Override
    public String getNomeDoGabinete() {
        return "gabinete entrada USB";
    }
    
}
