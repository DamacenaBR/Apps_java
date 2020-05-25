/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.exportacao;

/**
 *
 * @author COMPUTER
 */
public class NomeInvalidoException extends Exception{

    public NomeInvalidoException(String ms) {
        super ("..........................................\n" +
                ms + "\n..........................................\n");
    }   
}
