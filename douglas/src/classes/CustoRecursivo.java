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
public class CustoRecursivo {
    int cont1 = 0;
    public int multiplicacao(int m, int n){
        if (n == 0) {
            cont1++;
            System.out.println("Contagem: " + cont1);
            return 0;
        }
        else{
            cont1++;
            return (m + multiplicacao(m, n - 1));
        }
    }
    
    int cont2 = 0;
    public int potenciacao(int m, int n){
        if (n == 0) {
            cont2++;
            System.out.println("Contagem: " + cont2);
            return 1;
        }
        else{
            cont2++;
            return (m * potenciacao(m, n - 1));
        }
    }
    
    
}
