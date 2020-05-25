
package br.edu.fescfafic.classes;

public class Diretor implements Operador{

    @Override
    public void matricular(Matricula matricula, String operador) {
       matricula.efetuar(operador);
    }
    
}
