/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agendacontatos.dao;

import com.agendacontatos.beans.Contato;

/**
 *
 * @author Elder Pereira
 */
public interface DAO {
    boolean create(Contato contato); // Adicionar
    boolean create(int index, Contato contato); // Adicionar
    Contato[] read(); // Ler
    boolean updade(int index, Contato contato); //Atualizar
    boolean delete(int index); // Deletar
    boolean delete(); // Deletar
}
