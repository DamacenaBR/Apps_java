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
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public Funcionario(){
        
    }
    
    public Funcionario (String nome, int idade, String sexo){
        super(nome, idade, sexo);
    }
    
    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando){
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + 
                getSexo() + "\nSetor: " + getSetor() + "\nTrabalhando: " + getTrabalhando();
    }
}


