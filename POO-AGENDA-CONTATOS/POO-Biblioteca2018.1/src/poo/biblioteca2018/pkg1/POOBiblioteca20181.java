/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.biblioteca2018.pkg1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Allyson
 */
public class POOBiblioteca20181 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        String op = "";
        String op2 = "";
        Livro livro = null;
        Aluno aluno = null;
        Emprestimo emprestimo = null;
        String isbn = "";

        do {
            System.out.println("----BIBLIOTECA----");
            System.out.println("1 - LIVROS");
            System.out.println("2 - ALUNOS");
            System.out.println("3 - EMPRESTIMOS");
            System.out.println("0 - SAIR");

            op = input.nextLine();

            switch (op) {
                case "1":
                    do {
                        System.out.println("----LIVROS----");
                        System.out.println("1 - CADASTRAR");
                        System.out.println("2 - LISTAR");
                        System.out.println("3 - REMOVER");
                        System.out.println("4 - EDITAR");
                        System.out.println("0 - VOLTAR");
                        op2 = input.nextLine();

                        if (op2.equals("1")) {
                            System.out.println("----CADASTRAR LIVRO----");

                            livro = new Livro();

                            System.out.println("ISBN: ");
                            livro.setIsbn(input.nextLine());
                            System.out.println("Título: ");
                            livro.setTitulo(input.nextLine());
                            System.out.println("Autor: ");
                            livro.setAutor(input.nextLine());
                            System.out.println("Editora: ");
                            livro.setEditora(input.nextLine());

                            biblioteca.cadastrarLivro(livro);

                            System.out.println("REGISTRO SALVO COM SUCESSO!");

                        } else if (op2.equals("2")) {
                            System.out.println("----LISTAR LIVROS----");

                            biblioteca.listarLivros();

                        } else if (op2.equals("3")) {
                            System.out.println("----REMOVER----");

                            System.out.println("ISBN: ");
                            isbn = input.nextLine();

                            livro = biblioteca.buscarLivroPorIsbn(isbn);

                            if (livro != null) {
                                biblioteca.excluirLivro(livro);
                                System.out.println("REGISTRO REMOVIDO COM SUCESSO!");
                            } else {
                                System.out.println("REGISTRO NÃO ENCONTRADO!");
                            }

                        } else if (op2.equals("4")) {
                            System.out.println("----EDITAR----");

                            System.out.println("ISBN: ");
                            isbn = input.nextLine();

                            if (biblioteca.buscarLivroPorIsbn(isbn) != null) {

                                livro = new Livro();
                                livro.setIsbn(isbn);

                                System.out.println("Novo Título: ");
                                livro.setTitulo(input.nextLine());
                                System.out.println("Novo Autor: ");
                                livro.setAutor(input.nextLine());
                                System.out.println("Nova Editora: ");
                                livro.setEditora(input.nextLine());

                                biblioteca.editarLivro(livro);

                                System.out.println("REGISTRO EDITADO COM SUCESSO!");
                            }
                        } else {
                            System.out.println("<<<Voltando...");
                        }

                    } while (!op2.equals("0"));

                    break;
                case "2":
                    System.out.println("----ALUNOS----");

                    do {

                        System.out.println("----ALUNOS----");
                        System.out.println("1 - CADASTRAR");
                        System.out.println("2 - LISTAR");
                        System.out.println("0 - VOLTAR");
                        op2 = input.nextLine();

                        if (op2.equals("1")) {
                            System.out.println("----CADASTRAR ALUNO----");

                            aluno = new Aluno();

                            System.out.println("Matrícula: ");
                            aluno.setMatricula(input.nextLine());
                            System.out.println("Nome:");
                            aluno.setNome(input.nextLine());

                            biblioteca.cadastrarAluno(aluno);

                            System.out.println("REGISTRO SALVO COM SUCESSO!");
                        } else if (op2.equals("2")) {
                            System.out.println("----LISTAR ALUNOS----");

                            biblioteca.listarAlunos();
                        } else {
                            System.out.println("<<<Voltando...");
                        }

                    } while (!op2.equals("0"));

                    break;
                case "3":
                    System.out.println("----EMPRESTIMOS----");

                    do {

                        System.out.println("----EMPRESTIMOS----");
                        System.out.println("1 - CADASTRAR");
                        System.out.println("2 - LISTAR");
                        System.out.println("0 - VOLTAR");
                        op2 = input.nextLine();

                        if (op2.equals("1")) {
                            System.out.println("----CADASTRAR EMPRESTIMO----");

                            System.out.println("Matrícula:");
                            String matricula = input.nextLine();

                            aluno = biblioteca.buscarAlunoPorMatricula(matricula);

                            if (aluno != null) {
                                System.out.println("ISBN: ");
                                isbn = input.nextLine();
                                livro = biblioteca.buscarLivroPorIsbn(isbn);

                                if (livro != null) {

                                    emprestimo = new Emprestimo();
                                    emprestimo.setAluno(aluno);
                                    
                                    // adicionar vários livros no emprestimo
                                    
                                    //emprestimo.setLivro(livro);
                                    emprestimo.setData(new Date());
                                    biblioteca.cadastrarEmprestimo(emprestimo);

                                    System.out.println("REGISTRO SALVO COM SUCESSO!");
                                }
                            }

                        } else if (op2.equals("2")) {
                            System.out.println("----LISTAR EMPRESTIMOS----");

                            biblioteca.listarEmprestimos();

                        } else {
                            System.out.println("<<<<Voltando...");
                        }

                    } while (!op2.equals("0"));

                    break;
                case "0":
                    System.out.println("Saindo...");
                    break;

            }

        } while (!op.equals("0"));

    }

}
