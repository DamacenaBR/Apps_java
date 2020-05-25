
package br.edu.fescfafic.classes;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Arquivos{
    
    private List<Diretorio> diretorio;
    private String nome;
    private int codigo;
    private boolean add;
    private List<Arquivos> arquivos;

    public Diretorio(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.arquivos = new ArrayList<>();
        this.diretorio = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public int getCodigo() {
        return this.codigo;
    }
    
    public void addArquivos(Arquivo a){      
        if (a.getAdd() != true) {
            a.setAdd(true);
            this.arquivos.add(a);
        }
        else{
            System.out.println("ERRO: Esse arquivo de codigo " + a.getCodigo() + " já foi adicionado");
        }
    }

    public void removerArquivo(int codigo){
        this.arquivos.remove(codigo);
    }
    
    public List<Arquivos> listArquivos(){
        return this.arquivos;
    }
        
    public int getNumArquivos(){
        return this.arquivos.size();
    }
    
    public void addDiretorio(Diretorio d){      
        if (d.getAdd() != true) {
            d.setAdd(true);
            this.arquivos.add(d);
        }
        else{
            System.out.println("ERRO: Esse diretorio de codigo " + d.getCodigo() + " já foi adicionado");
        }
    }
    
    public Diretorio getDiretorio(int codigo){
        for (int i = 0; i < this.diretorio.size(); i++) {
            if (this.diretorio.get(i).getCodigo() == codigo) {
                return diretorio.get(i);
            }
        }
        return null;
    }
    
    public List<Diretorio> listDiretorios(){
        return this.diretorio;
    }
    
    public boolean getAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Diretorio{" + "diretorio=" + diretorio + ", nome=" + nome + ", codigo=" + codigo + ", arquivos=" + arquivos + '}';
    } 
}
