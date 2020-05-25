/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Contato;

/**
 *
 * @author fafic
 */
public interface IContatoDAO {
    boolean salvarContato(Contato c);
    boolean atualizarContato(int index, Contato c);
    boolean deleteContato(int index);
    List<Contato> getContatos();
}
