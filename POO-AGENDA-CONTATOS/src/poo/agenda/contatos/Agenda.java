/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.agenda.contatos;

/**
 *
 * @author Allyson
 */
public class Agenda {

    Pessoa[] pessoas = new Pessoa[2];
    int quantidade;

    void cadastrarPessoa(Pessoa p) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                pessoas[i] = p;
                quantidade++;
                break;
            }
        }

        verificarTamanho();
    }

    void listarPessoas(String inicial){
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] != null && pessoas[i].nome.startsWith(inicial)){
                 System.out.println(pessoas[i]);
            }
        }
    }
    
    void listarPessoas() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                System.out.println(pessoas[i]);
            }
        }
    }

    void verificarTamanho() {
        if (quantidade == pessoas.length) {
            
            
            Pessoa[] novoArray = new Pessoa[pessoas.length * 2];

            for (int i = 0; i < pessoas.length; i++) {
                novoArray[i] = pessoas[i];
            }

            pessoas = novoArray;
        }
    }
}
