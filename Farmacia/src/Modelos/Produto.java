
package Modelos;

public class Produto {
    private String nome;
    private float preco;
    private String codigoBarra;

    public Produto() {
    }

    public Produto(String nome, float preco, String codigoBarra) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarra = codigoBarra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public String getCodigoBarra() {
        return codigoBarra;
    }
    
    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    
    @Override
    public String toString() {
        return "\nProduto = " + nome + "\nPreço = " + preco +  "\nCódigo De Barras = " + codigoBarra ;
    }  
}
