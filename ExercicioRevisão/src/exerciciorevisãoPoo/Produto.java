/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorevisãoPoo;

/**
 *
 * @author bruno
 */
public class Produto {
    private int codigo;
    private String nome;
    private float preco;
    private Categoria categoria;
    private Ingredientes [] ingredientes;

    public Produto() {
        
    }
    
    public Produto(int codigo, String nome, float preco, Categoria categoria, Ingredientes [] ingredientes) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.ingredientes = ingredientes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Ingredientes[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes[] ingredientes) {
        this.ingredientes = ingredientes;
    }
 
    @Override
    public String toString() {
        return "Codigo: " + codigo + "\nNome: " + nome + "\nPreco: " + preco + 
                "\nCategoria: " + categoria + "\nIngredientes: " + ingredientes;
    }
    
    
     /*
    
    private int quantidade;
    
    public void cadastrarIngrediente(Ingredientes ingrediente){
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] != null) {
                ingredientes[i] = ingrediente;
                quantidade++;
                break;
            }
        }
        verificarTamanho();
    }
    
    public void verificarTamanho(){
        if (ingredientes.length == quantidade) {
                Ingredientes [] novoArray = new Ingredientes[ingredientes.length * 2];
                
                for (int j = 0; j < ingredientes.length; j++) {
                    novoArray[j] = ingredientes[j];
                }
                ingredientes = novoArray;
            }
    }
    
    
    public void excluirIngrediente(Ingredientes ingrediente){
        for(int i = 0; i < ingredientes.length; i++){
            if (ingredientes[i] != null && ingredientes[i].equals(ingrediente)) {
                ingredientes[i] = null;
                quantidade --;
                break;
            }
        }
    }
    
    public void editarIngrediente(Ingredientes ingrediente){
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] != null && ingredientes[i].equals(ingrediente)) {
                ingredientes[i] = ingrediente;
                break;
            }
        }
    }
    
    public void listarIngredientes(){
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] != null){
                System.out.println("Nome: " + ingredientes[i]);
            }
        }
    }
    */
    
}
