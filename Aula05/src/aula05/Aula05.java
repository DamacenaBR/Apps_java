package aula05;

import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args) { 
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(123);
        c1.setDono("Bruno");
        c1.abrirConta("CC");        
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(321);
        c2.setDono("maria");
        c2.abrirConta("CP");       
        
        c1.depositar(300);
        c2.depositar(500);
        
        c1.sacar(100);
        c2.sacar(200);
        
        c1.sacar(250);
        c1.fecharConta();
        
        c1.estadoAtual();
        c2.estadoAtual();
        
      
    }

    
}
