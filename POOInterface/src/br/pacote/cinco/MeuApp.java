/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pacote.cinco;

/**
 *
 * @author 5LabComp2
 */

interface Funcionario{

}

class Coordenador implements Funcionario{
    int codigo;
    String nome;
}

class Operador implements Funcionario{
    int codigo;
    String nome;
}

class Gerente implements Funcionario{
    int codigo;
    String nome;
}

public class MeuApp {
    public void calcularSalario(Funcionario funcionario){
        if(funcionario instanceof Gerente){
            System.out.println("Aqui é um gerente.");
        }
        else if(funcionario instanceof Coordenador){
            System.out.println("Aqui é um coordenador.");
        }
        else if(funcionario instanceof Operador){
            System.out.println("Aqui é um operador.");
        }
    }
    
    public static void main(String[] args){
        
        MeuApp meuApp = new MeuApp();
        meuApp.calcularSalario(new Gerente());
        meuApp.calcularSalario(new Coordenador());
        meuApp.calcularSalario(new Operador());
    }
    
}
