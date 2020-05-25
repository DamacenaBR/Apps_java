
package br.edu.fafic.classes;

import java.util.Calendar;

public abstract class Empresas {
    
    public abstract Passagem emitePassagem(String origem, String destino, Calendar dataSaida);
    
}
