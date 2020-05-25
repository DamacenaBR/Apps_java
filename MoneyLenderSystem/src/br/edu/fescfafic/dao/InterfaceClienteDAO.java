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
public interface InterfaceClienteDAO {

    boolean inserirCliente(Cliente cliente);

    boolean inserirClienteIndex(int index, Cliente cliente);

    boolean removerCliente();

    boolean removerClienteIndex(int index);

    boolean alterarClienteIndex(int index, Cliente cliente);

    ArrayList<Cliente> getClientes();

    Cliente getCliente(int index);

}
