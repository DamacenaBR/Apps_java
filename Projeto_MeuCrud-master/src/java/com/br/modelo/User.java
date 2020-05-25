package com.br.modelo;

public class User {

	private long CPF;
	private String nome;
	private String sexo;        	
	private double salario;

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "User{" + "CPF=" + CPF + ", nome=" + nome + ", sexo=" + sexo + ", salario=" + salario + '}';
    }

 
   
}