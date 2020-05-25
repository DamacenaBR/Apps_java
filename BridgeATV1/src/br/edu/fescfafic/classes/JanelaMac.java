
package br.edu.fescfafic.classes;

import br.edu.fescfafic.interfaces.Janela;

public class JanelaMac implements Janela{
    
    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Mac");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Janela Mac");
    }
    
}
