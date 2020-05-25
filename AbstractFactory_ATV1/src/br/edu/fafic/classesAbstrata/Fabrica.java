/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.classesAbstrata;

/**
 *
 * @author COMPUTER
 */
public abstract class Fabrica {
    
    public abstract Notebook notebook(String processador, int capacidadeTB, int memoriaGB);
    public abstract Desktop desktop(String processador, int capacidadeTB, int memoriaGB);
            
}
