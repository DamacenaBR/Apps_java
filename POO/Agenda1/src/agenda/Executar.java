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
public class Executar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Agenda a = new Agenda();
        Pessoa p = new Pessoa();
        p.nome = "Daniel";
        p.email = "daniel@gmail·com";
        p.cadastrarNumero("123");
        p.cadastrarNumero("456");
        
        a.cadastarPessoa(p);
    }
    
}

   
