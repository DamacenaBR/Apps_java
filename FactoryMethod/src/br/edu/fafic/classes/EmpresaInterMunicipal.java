
package br.edu.fafic.classes;

import java.util.Calendar;

public class EmpresaInterMunicipal extends Empresas{

    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataSaida) {
        return new PassagemInterMunicipal(origem, destino, dataSaida);
    }
    
    
}
