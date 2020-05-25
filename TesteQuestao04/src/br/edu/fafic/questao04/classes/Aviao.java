/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao04.classes;

/**
 *
 * @author COMPUTER
 */
public class Aviao {
    private String cor;
    private String modelo;
    private int codigo;
    
    public Aviao(String modelo, String cor, int codigo){
        this.modelo = modelo;
        this.cor = cor;
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Aviao{" + "COR: " + cor + ", MODELO: " + modelo + ", CÒDIGO: " + codigo + '}';
    }
}
