
package br.edu.fescfafic.classes;

public class MatriculaPresencial implements Matricula{

    @Override
    public void efetuar(String operador) {
        System.out.println("Matricula presencial efetuada por " + operador);
    }
    
}
