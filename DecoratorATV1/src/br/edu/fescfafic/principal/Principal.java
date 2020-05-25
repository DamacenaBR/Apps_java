
package br.edu.fescfafic.principal;

import br.edu.fescfafic.classes.Arvore;
import br.edu.fescfafic.classes.ArvoreDeNatal;
import br.edu.fescfafic.classes.Bolas;
import br.edu.fescfafic.classes.Estrelas;
import br.edu.fescfafic.classes.PiscaPisca;

public class Principal {

    public static void main(String[] args) {
        Arvore arvoreDeNatal = new ArvoreDeNatal();
        
        arvoreDeNatal = new Bolas(arvoreDeNatal);
        arvoreDeNatal = new Bolas(arvoreDeNatal);
        arvoreDeNatal = new Estrelas(arvoreDeNatal);
        arvoreDeNatal = new Estrelas(arvoreDeNatal);
        arvoreDeNatal = new PiscaPisca(arvoreDeNatal);
        arvoreDeNatal = new PiscaPisca(arvoreDeNatal);
        arvoreDeNatal = new PiscaPisca(arvoreDeNatal);
        
        arvoreDeNatal.enfeites();
    }
    
}
