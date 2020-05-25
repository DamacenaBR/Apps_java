
package br.edu.fafic.classes;

import br.edu.fafic.classesAbstratas.PassagemInterMunicipal;
import java.util.Calendar;

public class ConcretaPassagemInterMunicipal extends PassagemInterMunicipal{

    public ConcretaPassagemInterMunicipal(String origem, String destino, Calendar dataHoraSaida) {
        super(origem, destino, dataHoraSaida);
    }

    @Override
    public void Ticket() {
        System.out.println("Passagem InterMunicipal :\n"
        + "De: " +this.getOrigem()+"\n"
        + "Para: "+this.getDestino()+"\n"
        +  "Data Hora/Saida: " + getSdf().format(this.getDataHoraSaida().getTime()));
    }
    
}
