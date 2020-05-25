
package biblioteca;


public class Biblioteca {

    private Livro[] livros = new Livro [10];
    private Aluno[] alunos = new Aluno [10];
    private Emprestimo [] Emprestimos = new Emprestimo [10];
    private int quantidadeLivro;
    private int quantidadeAlunos;
    
    public void cadastrarLivro(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                quantidadeLivro ++;
                break;
            }
        } 
        verificarTamanhoLivros();
    }
    
    
    public void verificarTamanhoLivros(){
        if (quantidadeLivro == livros.length){
            
            Livro [] novoArray = new Livro[livros.length * 2];
            
            for (int i = 0; i < livros.length;i++){
                novoArray[i] = livros [i];
        }
            livros = novoArray;
        }
    }

    public void listarLivro(){
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null){
                System.out.println(livros[i]);
            }
        }
       
    }
    
    public Livro buscarLivroPorIsbn(String isbn){
        for(int i = 0; i < livros.length; i++){
            if (livros[i] != null && livros[i].getIsbn().equals(isbn)){
                return livros[i];
            }
        }
        return null;
    }
    
    public void excluirLivros(Livro livro){
        for(int i = 0; i < livros.length; i ++){
            if (livros[i] != null && livros[i].getIsbn().equals(livro.getIsbn())) {
                livros[i] = null;
                quantidadeLivro --;
                break;
            }
        }
    }
    
    public void editarLivro(Livro livro){
        for(int i = 0; i < livros.length; i++){
            if (livros[i] != null && livros[i].getIsbn().equals(livro.getIsbn())){
                livros[i] = livro;
                break;
            }
        }
    }
    
    public void cadastrarAluno(Aluno aluno){
        for (int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
                quantidadeAlunos++;
                break;
            }
        }
        verificarTamanhoAlunos();
    }
    
    public void verificarTamanhoAlunos(){
        if(quantidadeAlunos == alunos.length){
            Aluno [] novoArray = new Aluno [alunos.length * 2];
            
            for (int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i];
            }
            alunos = novoArray;
        }
    }
    
    public void listarAlunos(){
        for (int i = 0; i < alunos.length; i++){
            if(alunos[i] != null){
                System.out.println(alunos[i]);
            }
        }
    }
    
    public Aluno buscarAlunosPorMatricula(String matricula){
        for (int i = 0; i < alunos.length; i++){
            if(alunos[i] != null && alunos[i].getMatricula().equals(matricula)){
                return alunos[i];
            }
        }
        return null;
    }
    
    public void excluirAlunos(Aluno aluno){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null && alunos[i].getMatricula().equals(aluno.getMatricula())){
                alunos[i] = null;
                quantidadeAlunos --;
            }
        }
    }
    
    public void editarAlunos(Aluno aluno){
        for(int i = 0; i < alunos.length;i++){
            if (alunos[i] != null && alunos[i].getMatricula().equals(aluno.getMatricula())) {
               alunos[i] = aluno;
               break;
            }
    }
    
    } 
}
