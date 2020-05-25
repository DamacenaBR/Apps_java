/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.classesAbstratas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author laelk
 */
public abstract class PassagemInterEstadual {
     
    private String origem;
    private String destino;
    private Calendar dataHoraSaida;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public PassagemInterEstadual(String origem, String destino, Calendar dataHoraSaida) {
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
        return "PassagemInterEstadual{" + "origem=" + origem + ", destino=" + destino + ", dataHoraSaida=" + dataHoraSaida + ", sdf=" + sdf + '}';
    }    
}
