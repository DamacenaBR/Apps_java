
package cadastrogenericos;

/**
 *
 * @author COMPUTER
 */
public class CadastroGenericos <T>{
    
    private final T[] elementos;
    private int quantidade;
    
    public CadastroGenericos(int total){
        elementos = (T[]) new Object[total];
        quantidade = 0;
    }
    
    public boolean add(T e){
        if(quantidade == elementos.length){
            return false;
        }
        elementos[quantidade] = e;
        return true;
    }
    
    public T[] getAll(){
        return elementos;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
