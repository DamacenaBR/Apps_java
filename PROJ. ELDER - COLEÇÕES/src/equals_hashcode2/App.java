/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equals_hashcode2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Elder Pereira
 */
public class App {

    public static void main(String[] args) {
        Set<Produto> produtos = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        String continuar = "s";

        while ("s".equalsIgnoreCase(continuar)) {
            System.out.print("Digite o código: ");
            int codigo = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            Produto produto = new Produto(codigo, nome);

            if (produtos.contains(produto)) {
                System.err.println("Erro: Esse produto já existe. Passe OUTRO!");
            } else {
                produtos.add(produto);
                System.out.println("Produto foi adicionado...");
            }

            System.out.print("Deseja adicionar outro produto? s/n : ");
            continuar = scanner.nextLine();
        }

        System.out.println("--Os Produtos--");
        produtos.forEach(System.out::println);

    }
}
