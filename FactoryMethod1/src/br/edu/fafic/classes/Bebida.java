
package br.edu.fafic.classes;

public abstract class Bebida {
    
    private String nome;
    private double volume;

    public Bebida(String nome, double volume) {
        this.nome = nome;
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public abstract void tipo();

    @Override
    public String toString() {
        return "Bedida{" + "nome=" + nome + ", volume=" + volume + '}';
    }
}
