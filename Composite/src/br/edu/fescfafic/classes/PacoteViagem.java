
package br.edu.fescfafic.classes;

import java.util.ArrayList;
import java.util.List;

public class PacoteViagem implements Passageiros{
    
    private String nome;
    private int codigo;
    private List<Passageiros> passageiros;
    
    public PacoteViagem(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.passageiros = new ArrayList<>();
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }
    
    public void addMembro(Pessoa p){
        this.passageiros.add(p);
    }
    
    public List<Passageiros> getMembros(){
        return this.passageiros;
    }
    
    public Passageiros getMembro(int codigo){
        return this.passageiros.get(codigo);
    }
    
}
