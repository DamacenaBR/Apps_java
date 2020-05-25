
package br.edu.fafic.classes;

import java.util.Calendar;

public class EmpresaInterEstadual extends Empresas{

    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataSaida) {
        return new PassagemInterEstadual(origem, destino, dataSaida);
    }
    
}
