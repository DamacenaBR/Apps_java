
package br.edu.fescfafic.principal;

import br.edu.fescfafic.classes.Coordenador;
import br.edu.fescfafic.classes.Diretor;
import br.edu.fescfafic.classes.MatriculaOnline;
import br.edu.fescfafic.classes.MatriculaPresencial;
import br.edu.fescfafic.classes.Operador;

public class Principal {

    public static void main(String[] args) {
        
        Operador diretor = new Diretor();
        Operador coordenador = new Coordenador();
        
        diretor.matricular(new MatriculaOnline(), "Diretor");
        coordenador.matricular(new MatriculaPresencial(), "Coordenador");
    }
    
}
