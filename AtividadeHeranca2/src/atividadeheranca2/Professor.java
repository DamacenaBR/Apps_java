/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeheranca2;

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
    
    @Override
    public String toString() {
        return super.toString() + "\nEspecialidade: " + getEspecialidade() + "\nSalario: " + getSalario();
    }
}
