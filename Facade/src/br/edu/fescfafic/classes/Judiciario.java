
package br.edu.fescfafic.classes;

public class Judiciario {
    public void analisarCadastro(Cantor c){
        String s = String.format("Cadastro do Cantor (%s) analisado com sucesso!",c.getNome());
        System.out.println(s);
    }
}
