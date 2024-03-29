/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import beans.Funcionario;
import beans.Horista;
import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Elder Pereira
 */
public class ExemploVector {

    public static void main(String[] args) {
        Vector<Funcionario> funcionarios = new Vector<>();
        Horista h1 = new Horista(20, 40, "111.111.111-11", "Maria",
                LocalDate.of(2011, Month.MARCH, 20));
        Horista h2 = new Horista(20, 40, "222.111.111-11", "Carlos",
                LocalDate.of(2011, Month.MARCH, 21));
        funcionarios.add(h1);
        funcionarios.add(h2);

        System.out.println("opção 1");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        System.out.println("opção 2");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }

        System.out.println("opção 3");
        Iterator iterator = funcionarios.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("opção 4");
        funcionarios.forEach(System.out::println);
    }

}
