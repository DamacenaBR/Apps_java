
package Dao;

import Modelos.Cliente;
import java.util.ArrayList;

public interface IclienteDAO {
    
    boolean salvarCliente(Cliente c);
    
    boolean atualizarCliente(int index, Cliente c );
    
    boolean deleteCliente(int index );
    
    ArrayList<Cliente> getClientes();
}
