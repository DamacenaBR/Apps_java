/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.bcc.sds.rmiserver;

import br.edu.fafic.bcc.sds.rmiinterfaces.ICalculadora;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fafic
 */
public class Server extends UnicastRemoteObject implements ICalculadora {

    public Server() throws RemoteException {
    }

    @Override
    public double soma(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtracao(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiplicacao(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public String divisao(double a, double b) throws RemoteException {
        if (b == 0) {
            return "Erro! disivor igual a zero";
        } else {
            return "" + (a / b);
        }
    }

    public static void main(String[] args) {
        try {
           
            LocateRegistry.createRegistry(4000);
            Naming.rebind("rmi://localhost:4000/calc", new Server());
            System.out.println("Servidor iniciado...");
            
            
            
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
