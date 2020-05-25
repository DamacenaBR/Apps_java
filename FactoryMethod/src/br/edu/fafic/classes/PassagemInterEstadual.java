
package br.edu.fafic.classes;

import java.util.Calendar;

public class PassagemInterEstadual extends Passagem{

    public PassagemInterEstadual(String origem, String destino, Calendar dataSaida) {
        super(origem, destino, dataSaida);
    }

    @Override
    public void ticket() {
        System.out.println("Passagem InterEstadual :\n"
        + "De: " +this.getOrigem()+"\n"
        + "Para: "+this.getDestino()+"\n"
        + "Data Hora/Saida" + sdf.format(this.getDataSaida().getTime()));
    }   
}
