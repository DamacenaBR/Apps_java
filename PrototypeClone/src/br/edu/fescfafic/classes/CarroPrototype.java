
package br.edu.fescfafic.classes;

public abstract class CarroPrototype implements Cloneable{
    protected double valor;

    @Override
    protected CarroPrototype clone(){
        CarroPrototype carroPrototype = null;
        try {
            carroPrototype =  (CarroPrototype) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.err.println("Erro: " + ex);
        }
        return carroPrototype;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public abstract void exibirInfo();
}
