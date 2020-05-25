package br.edu.fafic.classes;

import br.edu.fafic.classesAbstratas.Empresa;
import br.edu.fafic.classesAbstratas.PassagemInterEstadual;
import br.edu.fafic.classesAbstratas.PassagemInterMunicipal;
import java.util.Calendar;

public class ConcreteEmpresa extends Empresa{

    @Override
    public PassagemInterEstadual passagemInterEstadual(String origem, String destino, Calendar dataHoraSaida) {
        return new ConcretePassagemInterEstadual(origem, destino, dataHoraSaida);
    }

    @Override
    public PassagemInterMunicipal passagemInterMunicipal(String origem, String destino, Calendar dataHoraSaida) {
        return new ConcretaPassagemInterMunicipal(origem, destino, dataHoraSaida);
    }   
}
