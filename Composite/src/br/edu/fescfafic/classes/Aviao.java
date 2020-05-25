
package br.edu.fescfafic.classes;

import java.util.ArrayList;
import java.util.List;

public class Aviao <T extends Passageiros>{
    
    private List<Passageiros> passageiros;
    private String voo;
    private int capacidade;

    public Aviao(String voo, int capacidade) {
        this.voo = voo;
        this.capacidade = capacidade;
        this.passageiros = new ArrayList<>();
    }

    public String getVoo() {
        return voo;
    }

    public int getCapacidade() {
        return capacidade;
    }
    
    public int getQuantPassageiros(){
        int qtde = 0;
        for(Passageiros p : this.passageiros){
            if(p instanceof Pessoa) ++qtde;
            else qtde += ((PacoteViagem)p).getMembros().size();
        }
        return qtde;
    }
    
    public boolean isLotado(){
        return this.getQuantPassageiros() == this.capacidade;
    }
    
    public void addPassageiro( T novo){
        if(this.isLotado()) throw new RuntimeException("Voô Lotado!");
        if(novo instanceof PacoteViagem && this.getQuantPassageiros() + ((PacoteViagem)novo).getMembros().size() > this.capacidade) 
            throw new RuntimeException("Voô Lotado!");
        this.passageiros.add(novo);
    }
 }
