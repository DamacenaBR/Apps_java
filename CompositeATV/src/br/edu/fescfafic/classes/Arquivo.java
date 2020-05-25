
package br.edu.fescfafic.classes;

public class Arquivo implements Arquivos{
    
    private String nome;
    private int codigo;
    private boolean add;

    public Arquivo(String nome,int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
  
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    public boolean getAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Arquivo{" + "nome=" + nome + ", codigo=" + codigo + '}';
    }
}
