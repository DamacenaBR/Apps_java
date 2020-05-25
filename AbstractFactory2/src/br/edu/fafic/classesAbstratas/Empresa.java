
package br.edu.fafic.classesAbstratas;

import java.util.Calendar;

public abstract class Empresa {
    
    public abstract PassagemInterEstadual passagemInterEstadual(String origem, String destino, Calendar dataHoraSaida);
    public abstract PassagemInterMunicipal passagemInterMunicipal(String origem, String destino, Calendar dataHoraSaida);
    
}
