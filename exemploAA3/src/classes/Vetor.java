/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author COMPUTER
 */
public class Vetor {
    
    int cont = 1;
    public void calcCusto(int n){
        for (int i = 0; i <= n; i++) {
            cont++;
            int a = i;
            cont++;
            cont++;
            for (int j = 0; j <= n; j++) {
                cont++;
                int b =j;
                cont++;
            }
        }
        int custo = ((2 * (n * n)) + 7 * n + 6);
        System.out.println("Custo: " + custo);
        System.out.println("Custo 2: " + cont);
    }
}
