/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pkg1;

/**
 *
 * @author bruno
 */
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
    char letra = 'a';
    int x = 9;
    int y = 10;
    System.out.println("Total = " + (y + x));
    
    boolean verdadeiro = true;
    double altura = 1.90;
    System.out.println("Hello Word!");
    
    // comentario 1
   
    /*
    comentario 2
    */
    
    if ( x > y) {        
        System.out.println("X é maior!");
        
    }
    else if (x < y){
        System.out.println("Y é maior!");
        
    }
    else {
        System.out.println("X e Y são iguais!");
    }
    
    for (int i = 1; i <= 100; i ++){
    
        if (i % 2 == 0){
            System.out.println(i + " é par");
             
        }
        else {
            System.out.println(i + " é inpar");
        
        }
      
    }
      
    for (int i = 0; i <= 100; i ++){
            System.out.println(i);

        if (i == 50){
            break;
        }      
    }
    
    int idade = 15;
    boolean amigoDoDono = true;
    
    if (idade < 18 && amigoDoDono == true){
        System.out.println("Não pode entrar");
        
    }
    else{
        System.out.println("Pode entrar!");
        
    }
    
    if (idade < 18 || amigoDoDono == true){
        System.out.println("Não pode entrar");
        
    }
    else{
        System.out.println("Pode entrar!");
        
    }
    
    int i = 0;
    while (i <= 100){
        System.out.println(i);
        i++;
        
    }
    

    }
}


/*Conta c = new Conta();
        c.nome = "Bruno";
        c.numero = 3000;
        c.saldo = 1000;
        
            if (c.sacar (2000)){
                System.out.println("Consegui sacar");               
            }
            else{
                System.out.println("Não consegui sacar");
            }
        
        Conta c1 = new Conta ();
        c1.nome = "Gutemberg";
        c1.saldo = 1000;
        c1.numero = 1010;
        c1.depositar (1000);
        c1.sacar (1000);
        
        Conta c2 = new Conta ();
        c2.nome = "Daniel";
        c2.saldo = 1000;
        c2.numero = 1111;
        
        c1.transferir(c2,1000);
       
    */


