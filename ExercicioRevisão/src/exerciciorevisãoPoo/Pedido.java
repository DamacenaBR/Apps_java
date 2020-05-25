/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorevisãoPoo;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author bruno
 */
public class Pedido {
    private Cliente cliente;
    private Produto [] produtos;
    private Funcionario antendente;
    private Funcionario entregador;
    private boolean entrega;
    private float desconto;
    private float taxaEntrega;
    private float valorPedido;
    private Data data;

    public Pedido() {
        
    }
    
    public Pedido(Cliente cliente, boolean entrega, float desconto, float taxaEntrega, float valorPedido, Data data) {
        this.cliente = cliente;
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

    public Funcionario getAntendente() {
        return antendente;
    }

    public void setAntendente(Funcionario antendente) {
        this.antendente = antendente;
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + "\nProdutos: " + produtos + "\nAntendente: " + antendente + 
                "\nEntregador: " + entregador + "\nEntrega: " + entrega + "\nDesconto=" + desconto + 
                "\nTaxa de Entrega: " + taxaEntrega + "\nValor do Pedido: " + valorPedido + "\nData=" + data;
    }
    
    
    
    
    
}
