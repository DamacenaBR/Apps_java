
package br.edu.fescfafic.classes;

import br.edu.fescfafic.interfaces.Janela;

public class JanelaLinux implements Janela{

    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Linux");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Janela Linux");
    }
    
}
