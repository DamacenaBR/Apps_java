/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.bcc.sds.rmiclient;

import br.edu.fafic.bcc.sds.rmiinterfaces.ICalculadora;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fafic
 */
public class Client {

    public static void main(String[] args) {
        try {
            ICalculadora calc;

            System.out.println("Digite primeiro valor: ");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("Digite segundo valor: ");
            double b = new Scanner(System.in).nextDouble();

            calc = (ICalculadora) Naming.lookup("rmi://localhost:4000/calc");
            
            System.out.println("Retorno do Servidor Soma: " + calc.soma(a, b));
            System.out.println("Retorno do Servidor Subtração: " + calc.subtracao(a, b));
            System.out.println("Retorno do Servidor Multiuplicação: " + calc.multiplicacao(a, b));
            System.out.println("Retorno do Servidor Divisão: " + calc.divisao(a, b));
            
            
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
