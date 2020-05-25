/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equals_hashcode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Elder Pereira
 */
public class AppSet {

    public static void main(String[] args) {
        Collection<Produto> produtos = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        String continuar = "s";
        while ("s".equalsIgnoreCase(continuar)) {
            System.out.print("Digite código: ");
            int codigo = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite nome: ");
            String nome = scanner.nextLine();

            Produto produto = new Produto(codigo, nome);

            if (produtos.add(produto)) {
                System.out.println("Produto adicionado...");
            } else {
                System.err.println("Erro: Produto já existe...");
            }

            System.out.print("Deseja adicionar mais um produto? s/n : ");
            continuar = scanner.nextLine();

        }

        System.out.println("--Produtos adicionados--");
        produtos.forEach(System.out::println);
    }
}
