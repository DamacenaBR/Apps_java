/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.dao;

import br.edu.fescfafic.beans.Cliente;
import java.util.ArrayList;

/**
 *
 * @author COMPUTER
 */
public class ClienteDAO implements DAO{
    
    ArrayList<Cliente> clientes;
    
    public ClienteDAO(){
        this.clientes = new ArrayList<>();
    }
    
    @Override
    public boolean inserir(Cliente cliente) {
        return clientes.add(cliente);
    }

    @Override
    public boolean inserir(int index, Cliente cliente) {
        
        int tamAntes = clientes.size();
        clientes.add(index, cliente);
        int tamDepois = clientes.size();
        if (tamAntes == tamDepois) {
            return false;
        }
        return true;
    }

    @Override
    public boolean remover() {
        Cliente cliente = clientes.remove(clientes.size() - 1);
        return cliente != null;
    }

    @Override
    public boolean remover(int index) {
        Cliente cliente = clientes.remove(index);
        return cliente != null;
    }

    @Override
    public boolean alterar(int index, Cliente c) {
        Cliente cliente = clientes.set(index, c);
        return cliente != null;
    }

    @Override
    public ArrayList<Cliente> getLista() {
        return clientes;
    }

    @Override
    public Cliente getObject(int index) {
        return clientes.get(index);
    }
    
}
