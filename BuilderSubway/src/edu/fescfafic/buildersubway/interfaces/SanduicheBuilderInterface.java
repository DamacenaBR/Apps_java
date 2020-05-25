/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fescfafic.buildersubway.interfaces;

import java.util.List;

/**
 *
 * @author COMPUTER
 */
public interface SanduicheBuilderInterface<K, T> {
    
    public K tipoDoPao(String tipoDoPao);
    public K recheio(String recheio);
    public K molhos(List<String> molhos);
    public K extra(String extra);
    public T create();
    
}
