/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Contato;

/**
 *
 * @author fafic
 */
public class ContatoDAO implements IContatoDAO{

    private ArrayList<Contato> contatos;
    
    public ContatoDAO(){
        contatos = new ArrayList<>();
    }
    @Override
    public boolean salvarContato(Contato c) {
       boolean resultado =  contatos.add(c);
       return resultado;
    }

    @Override
    public boolean atualizarContato(int index, Contato c) {
      
       Contato contato = contatos.set(index, c);
       if (contato == null){
           return false;
       }
      return true;
    }

    @Override
    public boolean deleteContato(int index) {
        Contato contato = contatos.remove(index);
        if (contato == null){
           return false;
       }
      return true;
    }

    @Override
    public List<Contato> getContatos() {
    return contatos;
     
    }
}

