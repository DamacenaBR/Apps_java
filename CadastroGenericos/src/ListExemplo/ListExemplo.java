/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListExemplo;

import java.util.ArrayList;
import java.util.List;


public class ListExemplo {
    public static void main(String[]args){
        List<String> lista1 = new ArrayList<>();
        lista1.add("valor 1");
        lista1.add("valor 2");
        lista1.add("valor 3");
        
        /*System.out.println("size " + lista1.size());
        
        System.out.println("index valor 3 - " + lista1.indexOf("valor 3"));*/
        
        System.out.println("Sem alteração");
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println("index " + i + " - " + lista1.get(i));
        }
        
        /*if (lista1.remove("valor 2")) {
            System.out.println("Foi removido!!!");
        }else {
            System.out.println("Não foi removido!!!");
        }
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        criar obetos funcionarios
        e add
        funcionarios.add(A1);
        
        */
        
        
        
        
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println("index " + i + " - " + lista1.get(i));
        }
        
    }
    
    
}
