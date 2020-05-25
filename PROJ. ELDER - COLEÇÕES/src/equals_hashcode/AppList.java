/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equals_hashcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Elder Pereira
 */
public class AppList {

    public static void main(String[] args) {

        System.out.println("***** Programa de Cadastro ******");

        Collection<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String continuar = "s";
        while ("s".equalsIgnoreCase(continuar)) {
            System.out.print("Digite o código: ");
            int codigo = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            Produto produto = new Produto(codigo, nome);

            if (produtos.contains(produto)) {
                System.err.println("Erro: Já existe esse produto. Passe um novo produto... ");
            } else {
                produtos.add(produto);
                System.out.println("Adicionado...");
            }

            System.out.print("Deseja adicionar um novo produto? s/n : ");
            continuar = scanner.nextLine();
        }

        System.out.println("--Lista dos produtos--");
        produtos.forEach(System.out::println);
    }
}
