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
public interface DAO {

    boolean inserir(Cliente cliente);

    boolean inserir(int index, Cliente cliente);

    boolean remover();

    boolean remover(int index);

    boolean alterar(int index, Cliente cliente);

    ArrayList<Cliente> getLista();

    Cliente getObject(int index);

}
