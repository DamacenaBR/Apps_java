/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerface3.dao;

/**
 *
 * @author bruno
 */
public interface Dao {
    
    boolean create (Object o);
    boolean create (int index, Object o);
    Object[] read();
    boolean update (Object o);
    boolean update (int index, Object o);
    boolean delete (Object o);
    boolean delete (int index, Object o);
}
