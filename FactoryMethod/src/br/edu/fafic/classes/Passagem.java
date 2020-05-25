
package br.edu.fafic.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Passagem {
    private String origem;
    private String destino;
    private Calendar dataSaida;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Passagem(String origem, String destino, Calendar dataSaida) {
        this.origem = origem;
        this.destino = destino;
        this.dataSaida = dataSaida;
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

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
    
    public abstract void ticket();

    @Override
    public String toString() {
        return "Passagem{" + "origem=" + origem + ", destino=" + destino + ", dataSaida=" + dataSaida + ", sdf=" + sdf + '}';
    }
}
