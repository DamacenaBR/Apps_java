/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.beans;

/**
 *
 * @author COMPUTER
 */
public class Emprestimos {
    
    private float emprestimo;
    private float divida;
    
    
    public Emprestimos(float emprestimo, float divida) {
        this.emprestimo = emprestimo;
        this.divida = divida;
    }
        
    public float getDivida() {
        return divida;
    }

    public void setDivida(float divida) {
        this.divida = divida;
    }
    
    public Emprestimos() {
            
    }

    public float getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(float emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    @Override
    public String toString() {
        return "\nEMPRESTIMO:{" + "EMPRESTIMO= " +
                emprestimo + ", DIVIDA= " + divida + "}\n";
    }
}
