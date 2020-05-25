
package br.edu.fafic.classes;

import br.edu.fafic.classesAbstratas.PassagemInterEstadual;
import java.util.Calendar;

public class ConcretePassagemInterEstadual extends PassagemInterEstadual{

    public ConcretePassagemInterEstadual(String origem, String destino, Calendar dataHoraSaida) {
        super(origem, destino, dataHoraSaida);
    }

    @Override
    public void Ticket() {
        System.out.println("Passagem InterEstadual :\n"
        + "De: " +this.getOrigem()+"\n"
        + "Para: "+this.getDestino()+"\n"
        + "Data Hora/Saida: " + getSdf().format(this.getDataHoraSaida().getTime()));
    }
}
