/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorevisãoPoo;

/**
 *
 * @author bruno
 */
public class Cliente extends Pessoa{
    private String telefone;
    private Endereco endereco;
    
    public Cliente(){
        
    }

    public Cliente(String nome, String cpf, int idade, String telefone, Endereco endereco) {
        super(nome, cpf, idade);
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTelefone: " + telefone + "\nEndereço: " + endereco;
    }
}
