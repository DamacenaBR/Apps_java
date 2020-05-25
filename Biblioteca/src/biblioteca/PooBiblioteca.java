
package biblioteca;

import java.util.Scanner;


public class PooBiblioteca {
    public static void main(String[] args) {
            
        Scanner imput = new Scanner(System.in);
        
        Biblioteca biblioteca = new Biblioteca();
        
        Livro livro = null;
        Aluno aluno = null;
        String op = "";
        String op2 = "";
        String op3 = "";
        String matricula = "";
        String isbn = "";
        
        do{
            System.out.println("---------------------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("[1] - Aluno: ");
            System.out.println("[2] - Livros; ");
            System.out.println("[0] - Sair: ");
            System.out.print("opção:");
            
            op = imput.nextLine();
                        
        switch(op){
            case "1":
                do{
                    System.out.println("---------------------------");
                   System.out.println(" ALUNOS");
                   System.out.println("[1] - Cadastrar: ");
                   System.out.println("[2] - Listar: ");
                   System.out.println("[3] - Excluir: ");
                   System.out.println("[4] - Editar: ");
                   System.out.println("[0] - Menu Principal: ");
                   System.out.print("opção: ");
                   
                   op2 = imput.nextLine();   
                    
                switch (op2) {
                    case "1":
                        
                        aluno = new Aluno();
                        
                        System.out.println("---------------------------");
                        System.out.println("Opção cadastrar: ");
                        
                        System.out.print("Matricula: ");
                        aluno.setMatricula(imput.nextLine());
                        
                        System.out.print("Nome Aluno: ");
                        aluno.setNome(imput.nextLine());
                        
                        biblioteca.cadastrarAluno(aluno);
                        
                        System.out.println("Cadastrado com successo!");
                        break;
                        
                    case "2":
                        System.out.println("---------------------------");
                        System.out.println("Opção Listar Aluno: ");
                        
                        biblioteca.listarAlunos();
                        
                    case "3":
                        
                        System.out.println("---------------------------");
                        System.out.println("Opçao Remover Aluno: ");
                        
                        System.out.print("Matricula: ");
                        matricula = imput.nextLine();
                        
                        aluno = biblioteca.buscarAlunosPorMatricula(matricula);
                        
                        if (aluno != null){
                            System.out.println("Remover aluno: ");
                            biblioteca.excluirAlunos(aluno);
                            System.out.println("Aluno removido com sucesso!");
                            
                        }
                        else{
                            System.out.println("Aluno não encontrado!");
                            
                        }
                    
                    case "4":
                        
                        System.out.println("---------------------------");
                        System.out.println("Editar Aluno: ");
                        
                        System.out.println("Matricula: ");
                        matricula = imput.nextLine();
                        
                        aluno = biblioteca.buscarAlunosPorMatricula(matricula);
                        
                        if(aluno != null){
                            
                            aluno = new Aluno();
                            aluno.setMatricula(matricula);
                            
                            System.out.println("EDITAR: ");
                            
                            System.out.println("Aluno: ");
                            aluno.setNome(imput.nextLine());
                            
                            biblioteca.editarAlunos(aluno);
                            
                            System.out.println("Cadastrado com sucesso!");
                            break;
                            
                        }
                        else{
                            System.out.println("Aluno não encontrado!");
                            break;
                            
                        }

                    case "0":
                        System.out.println("<<<<< MENU PINCIPAL...");
                        break;
                }
                
                }while(!op2.equals("0") );
                
            case "2": 
               do{
                   System.out.println("----------------------");
                   System.out.println("LIVROS");
                   System.out.println("[1] - Cadastrar: ");
                   System.out.println("[2] - Listar: ");
                   System.out.println("[3] - Excluir: ");
                   System.out.println("[4] - Editar: ");
                   System.out.println("[0] - Menu Principal: ");
                   System.out.print("opção: ");
                   
                   op3 = imput.nextLine();  
                   
                switch(op3){
                    case "1":
                        
                        livro = new Livro();
                        
                        System.out.println("---------------------------");
                        System.out.println("Cadastrar Livro: ");
                        
                        System.out.print("Isbn: ");
                        livro.setIsbn(imput.nextLine());
                        
                        System.out.print("Livro: ");
                        livro.setLivro(imput.nextLine());
                        
                        System.out.print("Titulo: ");
                        livro.setTitulo(imput.nextLine());
                        
                        System.out.print("Autor: ");
                        livro.setAutor(imput.nextLine());
                        
                        System.out.print("Editora: ");
                        livro.setEditora(imput.nextLine());
                        
                        biblioteca.cadastrarLivro(livro);
                        System.out.println("Livro cadastrado com sucesso!");
                        break;
                        
                    case "2":
                        
                        System.out.println("---------------------------");
                        System.out.println("Listar Livros: ");
                        
                        biblioteca.listarLivro();
                           
                    case "3":
                        
                        System.out.println("----------------------");
                        System.out.println("Remover Livro: ");
                        
                        System.out.print("ISBN: ");
                        isbn = imput.nextLine();
                        
                        livro = biblioteca.buscarLivroPorIsbn(isbn);
                        
                        if (livro != null) {
                            biblioteca.excluirLivros(livro);
                            System.out.println("Livro removido com sucesso");
                            
                        }
                        else{
                            System.out.println("Livro não encontrado!");
                            
                        }  
                        
                    case "4":

                        System.out.println("----------------------");
                        System.out.println("Editar Livro: ");
                        
                        System.out.print("ISBN: ");
                        isbn = imput.nextLine();
                        
                        livro = biblioteca.buscarLivroPorIsbn(isbn);
                        
                        if (livro != null) {
                             
                            livro = new Livro();
                            livro.setIsbn(isbn);
                            
                            System.out.println("Livro: ");
                            System.out.println("Titulo: ");
                            System.out.println("Autor: ");
                            System.out.println("Editar: ");
                            
                            biblioteca.cadastrarLivro(livro); 
                            
                            System.out.println("Cadastrado com sucesso!");
                            break;
     
                        }
                        else{
                            System.out.println("Livro não encontrado!");
                            break;
                           
                        } 
                       
                    case "0":
                        System.out.println("<<<<< MENU PINCIPAL...");
                        break;
                    
                } 
                }while(op2.equals("0"));
        
        case "0":
            System.out.println("OBRIGADO!!!");
            
        }       
            
        }while(!op.equals("0") );
          
}
}

      
