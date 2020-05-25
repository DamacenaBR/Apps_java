/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author bruno
 */
public class Pessoa {
   String nome;
   String email;
   String [] numeros = new String[10];
   
   void cadastrarNumero(String n){
       for (int i = 0; i < numeros.length; i++){
           if (numeros[i] == null){
               numeros[i] = n;
               break;
           }
       }
   }

    void listarNumeros(){
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] != null){
            System.out.println(numeros[i]);
        }
    }
    }
   
}

