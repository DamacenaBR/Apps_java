/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pacote.dao;

/**
 *
 * @author 5LabComp2
 */
public interface InterfaceDAO{
    boolean create(Object o);
    Object[] redad();
    boolean update(Object o);
    boolean delete(Object o);
}
