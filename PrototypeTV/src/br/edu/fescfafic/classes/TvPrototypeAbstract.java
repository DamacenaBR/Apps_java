
package br.edu.fescfafic.classes;

public abstract class TvPrototypeAbstract implements Cloneable{
    protected int tamanho;
    protected int resolucao;
    protected double valor;
    protected String fabricante;
    
    @Override
    protected TvPrototypeAbstract clone(){
        TvPrototypeAbstract tvPrototype = null;
        try {
            tvPrototype = (TvPrototypeAbstract) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.err.println("Erro: " + ex);
        }
        return tvPrototype;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getResolucao() {
        return resolucao;
    }

    public void setResolucao(int resolucao) {
        this.resolucao = resolucao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public abstract void exibirInfo();
}
