
package br.edu.fescfafic.classes;

public abstract class CarroPrototype {
    protected double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public abstract CarroPrototype clonar();
    
    public abstract void exibirInfo();
}
