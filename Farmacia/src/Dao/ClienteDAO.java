
package Dao;

import Modelos.Cliente;
import java.util.ArrayList;

public class ClienteDAO implements IclienteDAO {
    
    private ArrayList<Cliente> clientes;

    public ClienteDAO() {
        clientes = new ArrayList<>();
        
    }
    
    @Override
    public boolean salvarCliente(Cliente c) {      
        boolean resultado = clientes.add(c);
        
        return resultado; 
    }

    @Override
    public boolean atualizarCliente(int index, Cliente c) {        
        Cliente cliente = clientes.set(index, c);
      
        if (cliente == null){
            return false;
      }      
    return true;
    }
    
    @Override
    public boolean deleteCliente(int index) {
        Cliente cliente = clientes.remove(index);
        
        if(cliente == null){
            return false;         
        }        
    return true;        
    }
    
    @Override
    public ArrayList<Cliente> getClientes() {
        return clientes;
        
    }
}
