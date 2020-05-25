/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import banco.source.Conta;

/**
 *
 * @author Gutemberg
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta cc = new Conta();
        cc.cliente.nome = "Gutemberg";
        cc.cliente.cpf = "000.000.000-00";
        cc.numero = "159753258";
        cc.saldo = 10000;
        
        Conta cc2 = new Conta();
        cc2.cliente.nome = "Allyson";
        cc2.cliente.cpf = "000.000.000-00";
        cc2.numero = "178965420";
        cc2.saldo = 3000;
        
        cc.transferir(cc2, 100);
        cc.depositar(100);
        cc.depositar(900);
        cc.transferir(cc2, 1000);
        cc2.transferir(cc, 10);
        
        cc2.mostrarExtrato();
        
        cc.mostrarExtrato();
        
        
        
    }
    
}
