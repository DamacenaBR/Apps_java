/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Calculadora {

    private float valor1;
    private float valor2;
    
    private float somar(){
        return valor1 + valor2;
    }
    
    private float subtrair(){
        return valor1 - valor2;
    }
    
    private float multiplicar(){
        return valor1 * valor2;
    }
    
    private float dividir(){
        Scanner leitor = new Scanner(System.in);
        
        if (valor1 > 0) {
            return valor1 / valor2;
        }
        System.out.println("valor 1 incorreto informe um novo!!!");
        return valor1 = leitor.nextFloat();
    }
    
    private int menuOpcao(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("----Calculadora----");
        System.out.println("1 => Somar");
        System.out.println("2 => Subtrair");
        System.out.println("3 => Multiplicar");
        System.out.println("4 => Dividir");
        System.out.print("Escolha uma opçao: ");
        
        int opcao = leitor.nextInt();
        return opcao;
    }
    
    private void pegaValores(){
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("informe o 1º valor: ");
        valor1 = leitor.nextFloat();
        System.out.println("Informe o 2º valor: ");
        valor2 = leitor.nextFloat();
    }
    
    private void execute(){
        
        int opcao = menuOpcao();
        
        if (opcao == 1) {
            System.out.println("Você escolheu a opçao Somar: ");
            pegaValores();
            System.out.println("Somar: " + somar());
        }
        else if(opcao == 2){
            System.out.println("Você escolheu a opçao Subtrair: ");
            pegaValores();
            System.out.println("Subtrair: " + subtrair());
        }
        else if(opcao == 3){
            System.out.println("Você escolheu a opçao Multiplicar: ");
            pegaValores();
            System.out.println("Multiplicar: " + multiplicar());
        }
        else if(opcao == 4){
            System.out.println("Você escolheu a opção Dividir: ");
            pegaValores();
            System.out.println("Dividir: " + dividir());
        }
        
    }         
                  
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        calc.execute();
        
    }
 
}
