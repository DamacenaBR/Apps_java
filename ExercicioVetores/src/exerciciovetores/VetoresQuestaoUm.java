/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciovetores;

/**
 *
 * @author Gutemberg
 */
public class VetoresQuestaoUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] times = new String[5];
        times[0] = "Flamengo";
        times[1] = "Botagogo";
        times[2] = "Vasco";
        times[3] = "São Paulo";
        
        System.out.println("Tamanho do vetor: " + times.length);
 
        int tamanhoReal = 0;
        for(int i = 0; i < times.length; i++){
            if(times[i] != null){
                System.out.println("Time[" + i +"]: " + times[i]);
                tamanhoReal += 1;
            }
        }
        System.out.println("Tamanho real do vetor: " + tamanhoReal);
        
    }
    
}
