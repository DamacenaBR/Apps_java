/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompareTo;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

/**
 *
 * @author bruno
 */
public class Funcionario implements Comparable<Funcionario>{
    private String nome;
    private LocalDate nascimento;

    public Funcionario(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public int compareTo(Funcionario outro) {
        return this.nascimento.compareTo(outro.getNascimento());
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nascimento: " + nascimento;
    }
    
    
    
    public static void main (String[]args){
        Funcionario f1 = new Funcionario("Maria", LocalDate.of(1990, Month.JULY, 22));
        Funcionario f2 = new Funcionario("Daniel", LocalDate.of(1991, Month.JULY, 22));
        Funcionario f3 = new Funcionario("Carla", LocalDate.of(1995, Month.JULY, 22));
        
        Funcionario funcionario [] = {f1,f3,f2};
        
        System.out.println(Arrays.toString(funcionario));
    }
}
