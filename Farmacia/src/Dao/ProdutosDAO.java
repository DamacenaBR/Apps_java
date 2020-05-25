
package Dao;

import Modelos.Produto;
import java.util.ArrayList;

public class ProdutosDAO implements IprodutosGerais {
    
    private ArrayList<Produto> listaProdutos;
    
public ProdutosDAO(){
    
    listaProdutos = new ArrayList<>();
}

    @Override
    public boolean salvarProduto(Produto p) {
       boolean resultado = listaProdutos.add(p);
       
       return resultado;
    }

    @Override
    public boolean deletarProduto(int i) {
        Produto produto = listaProdutos.remove(i);
        
        if (produto == null){
            return false;
        }
        return true;
    }

    @Override
    public boolean atualizarProduto(int i, Produto p) {
         Produto produto = listaProdutos.set(i, p);
         
         if(produto == null){
         return false;    
    }
        return true;
    }

    @Override
    public ArrayList<Produto> getProdutos() {
        return listaProdutos;
    }

    
}
