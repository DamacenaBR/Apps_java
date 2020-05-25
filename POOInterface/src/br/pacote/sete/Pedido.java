/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pacote.sete;

import java.util.Date;

/**
 *
 * @author 5LabComp2
 */
public class Pedido {
    
    private Cliente cliente;
    private Produto[] produtos;
    private Funcionario atendente;
    private Funcionario entregador;
    private boolean entrega;
    private float desconto;
    private float taxaEntrega;
    private float valorPedido;
    private Date data;
    
    public Pedido(){
    
    }
    
    public Pedido(Cliente cliente, Produto[] produtos, Funcionario atendente,
            Funcionario entregador, boolean entrega, float desconto,
            float taxaEntrega, float valorPedido, Date data){
        this.cliente = cliente;
        this.produtos = produtos;
        this.atendente = atendente;
        this.entregador = entregador;
        this.entrega = entrega;
        this.desconto = desconto;
        this.taxaEntrega = taxaEntrega;
        this.valorPedido = valorPedido;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Funcionario getAtendente() {
        return atendente;
    }

    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }

    public Funcionario getEntregador() {
        return entregador;
    }

    public void setEntregador(Funcionario entregador) {
        this.entregador = entregador;
    }

    public boolean isEntrega() {
        return entrega;
    }

    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}
