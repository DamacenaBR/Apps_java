/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeset;

import beans.Funcionario;
import beans.Horista;
import java.time.LocalDate;
import java.time.Month;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Elder Pereira
 */
public class ExemploTreeSet {

    public static void main(String[] args) {
        TreeSet<Funcionario> funcionarios = new TreeSet<>();

        Horista h1 = new Horista(20, 40, "111.111.111-11", "Maria",
                LocalDate.of(2011, Month.MARCH, 20));
        Horista h2 = new Horista(20, 40, "444.111.111-11", "Carlos",
                LocalDate.of(2011, Month.MARCH, 21));
        Horista h3 = new Horista(20, 40, "222.111.111-11", "Carlos",
                LocalDate.of(2011, Month.MARCH, 21));

        funcionarios.add(h1);
        funcionarios.add(h2);
        funcionarios.add(h3);

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
