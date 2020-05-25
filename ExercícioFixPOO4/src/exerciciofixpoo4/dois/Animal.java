/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofixpoo4.dois;

/**
 *
 * @author 2LabComp2
 */
public abstract class Animal {
    
    private String nome;
    private String raca;
    private float peso;
    private float idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }
    
    /*public abstract void fazerBarulho();
    
    public abstract void comer();
    
    public abstract void acordar();
    
    public abstract void dormir();
    
    public abstract void vaguear();*/
    
    public void fazerBarulho(){
        System.out.println("Fazendo barulho");
    }
    
    public void comer(){
        System.out.println("Comida");
    }
    
    public void acordar(){
        System.out.println("Acordando");
    }
    
    public void dormir(){
        System.out.println("Dormindo");
    }
    
    public void vaguear(){
        System.out.println("Andando...");
    }
    
}
