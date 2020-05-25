
package biblioteca;


public class Livro {
    private String livro;
    private String titulo;
    private String autor;
    private String editora;
    private String isbn;
    
    public String getIsbn(){
        return isbn;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public String getLivro(){
        return livro;
    }
    
    public void setLivro(String livro){
        this.livro = livro;
    }
    
    public String getTitulo(){
        return livro;
    }
    
    public void setTitulo(String titulo){
        this.titulo = livro;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor= autor;
    }
    
    public String getEditora(){
        return editora;
    }
    
    public void setEditora(String editora){
        this.editora = editora;
    }
    
    
    public String toString(){
        return "Isbn: " + getIsbn() + " - Livro: " + this.livro + " - Titulo: " + this.titulo + " - Autor: " + this.autor + " - Editora: " + this.editora;
    }
}


