/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.bcc.sds.rmiinterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author fafic
 */
public interface ICalculadora extends Remote {
    
    public double soma(double a, double b) throws RemoteException;
    public double subtracao(double a, double b) throws RemoteException;
    public double multiplicacao(double a, double b) throws RemoteException;
    public String divisao(double a, double b) throws RemoteException;
}
