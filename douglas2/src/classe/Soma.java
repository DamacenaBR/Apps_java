/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author COMPUTER
 */
public class Soma {
    
    public int soma(int [] a, int inicio, int fim){
        if(inicio == fim){
            return a[inicio];
        }
        else{
            int meio = (inicio + fim) / 2;
            int maxA = soma(a, inicio, meio);
            int maxB = soma(a, meio + 1, fim);            
            return maxA + maxB;
        }
    }
}
