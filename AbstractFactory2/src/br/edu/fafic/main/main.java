
package br.edu.fafic.main;

import br.edu.fafic.classes.ConcreteEmpresa;
import br.edu.fafic.classesAbstratas.Empresa;
import br.edu.fafic.classesAbstratas.PassagemInterEstadual;
import br.edu.fafic.classesAbstratas.PassagemInterMunicipal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class main {

    public static void main(String[] args) {
        Empresa empresa = new ConcreteEmpresa();
        
        PassagemInterEstadual interEstadual = empresa.passagemInterEstadual("Sousa-PB", "Recife-PE",new GregorianCalendar(2020, Calendar.FEBRUARY, 23, 23, 15));
        
        PassagemInterMunicipal interMunicipal = empresa.passagemInterMunicipal("Sousa-PB", "Cajazeiras-PB",new GregorianCalendar(2020, Calendar.MARCH, 02, 22, 00));
        
        interEstadual.Ticket();
        System.out.println("--------------------------");
        interMunicipal.Ticket();
    }
}
