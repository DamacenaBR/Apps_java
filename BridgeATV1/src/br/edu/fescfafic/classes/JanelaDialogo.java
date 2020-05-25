
package br.edu.fescfafic.classes;

import br.edu.fescfafic.interfaces.Janela;
import br.edu.fescfafic.interfaces.JanelaAbstrata;

public class JanelaDialogo extends JanelaAbstrata{

    public JanelaDialogo(Janela janela) {
        super(janela);
    }
    
    @Override
    public void desenhar() {
        desenharJanela("Janela de Diálogo");
        desenharBotao("Botão Sim");
        desenharBotao("Botão Não");
        desenharBotao("Botão Cancelar");
    }
    
}
