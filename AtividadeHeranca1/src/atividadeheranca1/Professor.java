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
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public Professor(){
        
    }
    
    public Professor (String nome, int idade, String sexo){
        super(nome, idade, sexo);
    }
    
    public Professor(String nome, int idade, String sexo, String especialidade, float salario){
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + 
                getSexo() + "\nEspecialidade: " + getEspecialidade() + "\nSalario: " + getSalario();
    }
}
