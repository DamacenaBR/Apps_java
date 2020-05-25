package br.edu.fafic.main;

import br.edu.fafic.classes.Caminhao;
import br.edu.fafic.classes.Logistica;
import br.edu.fafic.classes.LogisticaAquatica;
import br.edu.fafic.classes.LogisticaTerrestre;
import br.edu.fafic.classes.Navio;

public class main {

    public static void main(String[] args) {
        Caminhao c = (Caminhao) new LogisticaTerrestre().createTransporte(50, 50);
        c.entrega();
        
        Navio n = (Navio) new LogisticaAquatica().createTransporte(30, 30);
        n.entrega();
    }
    
}
