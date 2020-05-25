
package br.edu.fafic.classesAbstratas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class PassagemInterMunicipal {
    
    private String origem;
    private String destino;
    private Calendar dataHoraSaida;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public PassagemInterMunicipal(String origem, String destino, Calendar dataHoraSaida) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraSaida = dataHoraSaida;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Calendar getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Calendar dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
   
    public abstract void Ticket();

    @Override
    public String toString() {
        return "PassagemInterMunicipal{" + "origem=" + origem + ", destino=" + destino + ", dataHoraSaida=" + dataHoraSaida + ", sdf=" + sdf + '}';
    }
    
    
}
