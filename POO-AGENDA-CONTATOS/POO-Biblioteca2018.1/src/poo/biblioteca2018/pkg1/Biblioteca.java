/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.biblioteca2018.pkg1;

/**
 *
 * @author Allyson
 */
public class Biblioteca {

    private Livro[] livros = new Livro[10];
    private int quantidadeLivros;
    private Aluno[] alunos = new Aluno[10];
    private int quantidadeAlunos;
    private Emprestimo[] emprestimos = new Emprestimo[10];
    private int quantidadeEmprestimos;
    
    public void cadastrarLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                quantidadeLivros++;
                break;
            }
        }
    }
    
    public void listarLivros() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.println(livros[i]);
            }
        }
    }
    
    public Livro buscarLivroPorIsbn(String isbn) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].getIsbn().equals(isbn)) {
                return livros[i];
            }
        }
        return null;
    }
    
    public void excluirLivro(Livro livro){
        for(int i = 0; i < livros.length; i++){
            if(livros[i] != null && livros[i].getIsbn().equals(livro.getIsbn())){
                livros[i] = null;
                quantidadeLivros--;
                break;
            }
        }
    }
    
    public void editarLivro(Livro livro){
        for(int i = 0; i < livros.length; i++){
            if(livros[i] != null && livros[i].getIsbn().equals(livro.getIsbn())){
                livros[i] = livro;
                break;
            }
        }
    }
    
    public void cadastrarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                quantidadeAlunos++;
                break;
            }            
        }
    }
    
    public void listarAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println(alunos[i]);
            }
        }
    }
    
    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getMatricula().equals(matricula)) {
                return alunos[i];
            }
        }
        return null;
    }
   
    
    public void cadastrarEmprestimo(Emprestimo emprestimo) {
        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] == null) {
                quantidadeEmprestimos++;
                emprestimo.setCodigo(quantidadeEmprestimos);
                emprestimos[i] = emprestimo;    
                break;
            }
        }
    }
    
    public void listarEmprestimos() {
        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] != null) {
                System.out.println(emprestimos[i]);
            }
        }
    }
}
