/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equals_hashcode;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Elder Pereira
 */
public class App {

    public static void main(String[] args) {
        Collection<Produto> produtos = new HashSet<>();

        System.out.println("##### Cadastro de produtos #####");

        Scanner entrada = new Scanner(System.in);

        String continuar = "s";
        while ("s".equalsIgnoreCase(continuar)) {
            System.out.print("Código: ");
            int codigo = Integer.parseInt(entrada.nextLine());

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            Produto produto = new Produto(codigo, nome);

            if (produtos.add(produto)) {
                System.out.println("Produto adicionado.");
            } else {
                System.err.println("Esse produto já foi adicionado. Utilize outro CÓDIGO!");
            }

            System.out.print("Deseja adicionar mais algum produto? (s/n) ");
            continuar = entrada.nextLine();
        }

        produtos.forEach(System.out::println);
        System.out.println("Fim");
    }
}
