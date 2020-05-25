
package Dao;

import Modelos.Produto;
import java.util.ArrayList;

public interface IprodutosGerais {
 
    boolean salvarProduto(Produto p);
    
    boolean deletarProduto(int i);
    
    boolean atualizarProduto(int i, Produto p);
    
    ArrayList<Produto> getProdutos();
    
}
