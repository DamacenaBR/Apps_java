
package br.edu.fescfafic.classes;

import br.edu.fescfafic.interfaces.Janela;
import br.edu.fescfafic.interfaces.JanelaAbstrata;

public class JanelaMensagem extends JanelaAbstrata{

    public JanelaMensagem(Janela janela) {
        super(janela);
    }
    
    @Override
    public void desenhar() {
        desenharJanela("Janela de Mensagem");
        desenharBotao("Ok");   
    }
    
}
