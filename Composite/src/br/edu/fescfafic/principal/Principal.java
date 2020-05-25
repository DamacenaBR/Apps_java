package br.edu.fescfafic.principal;

import br.edu.fescfafic.classes.Aviao;
import br.edu.fescfafic.classes.PacoteViagem;
import br.edu.fescfafic.classes.Passageiros;
import br.edu.fescfafic.classes.Pessoa;

public class Principal {

    public static void main(String[] args) {
        Aviao<Passageiros> a = new Aviao<Passageiros>("JJ5566",10);
        
        //adicionando unitario
        a.addPassageiro(new Pessoa("José",1));
        a.addPassageiro(new Pessoa("Maria",2));
        
        //adicionando grupo
        PacoteViagem p = new PacoteViagem("Pacote 1", 50);
        p.addMembro(new Pessoa("Pedro", 3));
        p.addMembro(new Pessoa("Tiago", 5));
        p.addMembro(new Pessoa("Lucas", 4));
        
        //adicionar pacote ao grupo
        a.addPassageiro(p);
        
        System.out.println("Quantidades de passageiros " + a.getQuantPassageiros());
    }
    
}
