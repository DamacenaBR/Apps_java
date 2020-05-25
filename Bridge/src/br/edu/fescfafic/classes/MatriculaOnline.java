
package br.edu.fescfafic.classes;

public class MatriculaOnline implements Matricula{

    @Override
    public void efetuar(String operador) {
        System.out.println("Matricula online efetuada por " + operador);
    }
    
}
