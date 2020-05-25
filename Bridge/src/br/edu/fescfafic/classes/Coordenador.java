
package br.edu.fescfafic.classes;

public class Coordenador implements Operador{

    @Override
    public void matricular(Matricula matricula, String operador) {
        matricula.efetuar(operador);
    }
    
}
