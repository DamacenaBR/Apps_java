package br.edu.fafic.principal;

import br.edu.classes.PessoaBuilder;

public class Main {

    public static void main(String[] args) {
        System.err.println(new PessoaBuilder("Lael").cpf("111.111.111-11").create());
    }
    
}
