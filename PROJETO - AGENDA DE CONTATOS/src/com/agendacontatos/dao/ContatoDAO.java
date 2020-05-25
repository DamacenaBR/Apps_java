package com.agendacontatos.dao;

import com.agendacontatos.beans.Contato;

/**
 *
 * @author Elder Pereira
 */
public class ContatoDAO implements DAO{
    private final Contato contatos[];
    private int quantidade;
    
    public ContatoDAO(int tamanho){
        contatos = new Contato[tamanho];
        quantidade = 0;
    }
    
    @Override
    public boolean create(Contato contato){
        if(quantidade == contatos.length) return false;
        contatos[quantidade++] = contato;
        return true;
    }
    
    @Override
    public boolean create(int index, Contato contato){
        if(contatos.length == quantidade) return false;
        
        if(index < 0 || index > quantidade - 1) return false;
        
        for(int i=quantidade-1; i>=index; i--){
            int pos = i+1;
            contatos[pos] = contatos[i];            
        }
        
        contatos[index] = contato;
        quantidade++;

        return true;
    }
        
    @Override
    public Contato[] read(){
        return contatos;
    }
    
    @Override
    public boolean updade(int index, Contato contato) {
        if(index < 0 || index > quantidade - 1) return false;
        contatos[index] = contato;
        return true;
    }
    
    @Override
    public boolean delete(int index){
        
        if(index < 0 || index > quantidade - 1) return false;
        
        contatos[index] = null;
        
        for(int i=index; i<quantidade-1; i++){
            int pos = i+1;
            contatos[i] = contatos[pos];
            contatos[pos] = null;
        }
        
        return true;
        
    }
    
    @Override
    public boolean delete(){        
        if(quantidade <= 0) return false;        
        contatos[--quantidade] = null;       
        return true;        
    }
    
    public Contato getContato(int index){        
        if(index < 0 || index > quantidade - 1) return null;        
        return contatos[index];        
    }      
        
    public int getQuantidade(){
        return quantidade;
    }

}
