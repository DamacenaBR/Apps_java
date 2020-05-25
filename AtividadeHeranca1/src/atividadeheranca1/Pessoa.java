/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeheranca1;

/**
 *
 * @author bruno
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniversario(){
        this.idade++;
    }
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String toString(){
        return "Nome: " + getNome() + "\n Idade; " + getIdade() + "\n Sexo: " + getSexo();
    }
    
    
}
