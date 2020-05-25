/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.encapsulamento;

/**
 *
 * @author Allyson
 */
public class Agenda {

    private Contato[] contatos = new Contato[10];
    private int quantidadeDeContatos;

    public void excluir(String email){
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] != null && 
                    contatos[i].getEmail().equals(email)){
                contatos[i] = null;
                quantidadeDeContatos--;
            }
        }
    }
    
    public void editar(Contato c){
        
    }
    
    public void addContato(Contato c) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                quantidadeDeContatos++;
                break;
            }
        }
        verificarTamanho();
    }

    private void verificarTamanho() {
        // verificação da quantidade de contatos
        if (quantidadeDeContatos == contatos.length) {
            Contato[] novoArray = new Contato[contatos.length * 2];

            for (int i = 0; i < contatos.length; i++) {
                novoArray[i] = contatos[i];
            }

            contatos = novoArray;
        }
    }

    public void mostrarContatos() {
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] != null){
                System.out.println(contatos[i].toString());
            }
        }
    }

    public void buscarContatos(String busca) {
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] != null && contatos[i].getNome().startsWith(busca)){
                System.out.println(contatos[i]);
            }
        }
    }
}
