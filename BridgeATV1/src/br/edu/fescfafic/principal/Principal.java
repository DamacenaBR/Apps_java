
package br.edu.fescfafic.principal;

import br.edu.fescfafic.interfaces.JanelaAbstrata;
import br.edu.fescfafic.classes.JanelaDialogo;
import br.edu.fescfafic.classes.JanelaLinux;
import br.edu.fescfafic.classes.JanelaMac;
import br.edu.fescfafic.classes.JanelaMensagem;
import br.edu.fescfafic.classes.JanelaWindows;

public class Principal {

    public static void main(String[] args) {
        
        JanelaAbstrata janela;
        
        System.out.println("+----------------------------------------------+");
        janela = new JanelaMensagem(new JanelaWindows());
        janela.desenhar();
        System.out.println("+----------------------------------------------+");       
        janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();        
        System.out.println("+----------------------------------------------+");
        
        janela = new JanelaMensagem(new JanelaMac());
        janela.desenhar();
        System.out.println("+----------------------------------------------+");
        janela = new JanelaDialogo(new JanelaMac());
        janela.desenhar();
        System.out.println("+----------------------------------------------+");
        
        janela = new JanelaMensagem(new JanelaLinux());
        janela.desenhar();
        System.out.println("+----------------------------------------------+");
        janela = new JanelaDialogo(new JanelaLinux());
        janela.desenhar();
        System.out.println("+----------------------------------------------+");
    }
    
}
