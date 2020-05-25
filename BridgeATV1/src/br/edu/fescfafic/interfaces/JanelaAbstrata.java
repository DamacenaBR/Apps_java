
package br.edu.fescfafic.interfaces;

public abstract class JanelaAbstrata implements  Janela{
    
    private Janela janela;

    public JanelaAbstrata(Janela j) {
        this.janela = j;
    }
    
    @Override
    public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }

    @Override
    public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }
    
    public abstract void desenhar();
    
}
