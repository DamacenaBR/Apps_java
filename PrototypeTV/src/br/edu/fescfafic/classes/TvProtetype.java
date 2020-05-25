/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.classes;

/**
 *
 * @author COMPUTER
 */
public class TvProtetype extends TvPrototypeAbstract{
    
    public TvProtetype(){
        
    }
    
    public TvProtetype(TvProtetype tvProtetype){
        this.valor = tvProtetype.getValor();
        this.fabricante = tvProtetype.getFabricante();
        this.resolucao = tvProtetype.getResolucao();
        this.tamanho = tvProtetype.getTamanho();
    }

    @Override
    protected TvPrototypeAbstract clone() {
        return new TvProtetype(this);
    }

    @Override
    public void exibirInfo() {
      System.out.println("Fabricante: " + this.getFabricante() + "\n"
              + "Tamanho: " + this.getTamanho() + "\n"
                      + "Resolução: " + this.getResolucao() + "\n"
                              + "Valor: " + this.getValor());
    }
    
}
