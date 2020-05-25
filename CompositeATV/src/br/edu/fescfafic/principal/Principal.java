
package br.edu.fescfafic.principal;

import br.edu.fescfafic.classes.Arquivo;
import br.edu.fescfafic.classes.Diretorio;

public class Principal {

    public static void main(String[] args) {
        Diretorio d = new Diretorio("Diretorio 1", 1);
        Diretorio d2 = new Diretorio("Diretorio 2", 2);
        Diretorio d3 = new Diretorio("Diretorio 3", 3);
        Diretorio d4 = new Diretorio("Diretorio 4", 4);
        
        Arquivo a1 = new Arquivo("Arquivo 1", 1);
        Arquivo a2 = new Arquivo("Arquivo 2", 2);
        Arquivo a3 = new Arquivo("Arquivo 3", 3);
        Arquivo a4 = new Arquivo("Arquivo 4", 4);
        Arquivo a5 = new Arquivo("Arquivo 5", 5);
        Arquivo a6 = new Arquivo("Arquivo 6", 6);
        Arquivo a7 = new Arquivo("Arquivo 7", 7);
        Arquivo a8 = new Arquivo("Arquivo 8", 8);
        
        
        
        //adicionar diretorio 2 e 3
        //adicionando o direotiro d2 no diretorio d
        d.addDiretorio(d2);
        //adicionando o direotiro d3 no diretorio d
        d.addDiretorio(d3);
        //buscando o diretorio d2 com o codigo no direotio d e adicionando outro diretorio no diretorio d2
        //d.getDiretorio(2).addDiretorio(d4);
        
        //adiconar arquivos no diretorio 1
        d.addArquivos(a1);
        d.addArquivos(a2);
        d.addArquivos(a3);
        
        //adicionar arquivos no diretorio d2 que esta armazenado no diretorio d
        /*d.getDiretorio(2).addArquivos(a4);
        d.getDiretorio(2).addArquivos(a5);
        
        //adicionar arquivos no diretorio d3 que esta armazenado no diretorio d
        d.getDiretorio(3).addArquivos(a6);
        //adionando um mesmo arquivos em dois diretorio
        d.getDiretorio(3).addDiretorio(d4);
        
        //adicionar arquivos no diretorio d4 que esta armazenado no diretorio d3 que esta amarzenado no diretorio d
        d.getDiretorio(3).getDiretorio(4).addArquivos(a7);
        d.getDiretorio(3).getDiretorio(4).addArquivos(a8);
        */
        //diretorio 1
        
        System.out.println("Diretorio 1");
        
        System.out.println("Diretorio: " + d.getNome());
        System.out.println("Diretorios: " + d.listDiretorios().toString());
        System.out.println("Arquivos: " + d.listArquivos().toString());
        
        System.out.println();
        
        
        /*
        
        //diretiro2
        
        System.out.println("Diretorio 2");

        System.out.println("Diretorio: " + d.getDiretorio().getDiretorio().getNome());
        System.out.println("Arquivos: " + d.getDiretorio().listArquivos().toString());

        System.out.println();
        
        //diretiro3
        System.out.println("Diretorio 3");

        System.out.println("Diretorio: " + d.getDiretorio().getDiretorio().getDiretorio());
        System.out.println("Arquivos: " + d.getDiretorio().getDiretorio().listArquivos().toString());
*/
    }   
}
