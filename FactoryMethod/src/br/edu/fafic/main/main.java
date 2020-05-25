
package br.edu.fafic.main;

import br.edu.fafic.classes.EmpresaInterEstadual;
import br.edu.fafic.classes.EmpresaInterMunicipal;
import br.edu.fafic.classes.Empresas;
import br.edu.fafic.classes.Passagem;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class main {
    
    public static void main(String[] args) {
        
        Empresas interEstadual = new EmpresaInterEstadual();
        Empresas interMunicipal = new EmpresaInterMunicipal();
        
        Passagem passagemIntEstadual = interEstadual.emitePassagem("Cajazeiras", "Recife", 
                new GregorianCalendar(2020, Calendar.FEBRUARY, 25,23,15));
        
        Passagem passagemIntMunicipal = interMunicipal.emitePassagem("Cajazeiras", "Sousa", 
                new GregorianCalendar(2020, Calendar.MARCH, 10,15,20));
        
        
        passagemIntEstadual.ticket();
        passagemIntMunicipal.ticket();
    } 
}
