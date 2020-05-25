/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.biblioteca2018.pkg1;

import java.util.Date;

/**
 *
 * @author Allyson
 */
public class Emprestimo {

    private long codigo;
    private Date data;
    private Aluno aluno;
    private Livro[] livros = new Livro[10];
    
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro[] getLivros(){
        return livros;
    }

    public void setLivros(Livro[] livros){
        this.livros = livros;
    }
    
    public void adicionarLivro(Livro livro){
        
    }
    
    public String toString() {
        return "Código: " + codigo + " - Aluno: "
                + aluno.getNome() 
                + " - Data: " + data; // pegar os titulos de todos os livros aqui
    }
}
