
package br.edu.fescfafic.classes;

public abstract class Tomada<P> {
    
    public abstract String conecta(P plug);
    public abstract String getNomeDaRede();
}
