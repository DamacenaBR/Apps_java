/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadematriz;

/**
 *
 * @author terminal01
 */
public class AtividadeMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double notaAlunos[][] = new double[3][4];

        notaAlunos[0][0] = 8.0;
        notaAlunos[0][1] = 5.0;
        notaAlunos[0][2] = 3.0;
        notaAlunos[0][3] = 8.5;

        notaAlunos[1][0] = 6.0;
        notaAlunos[1][1] = 7.5;
        notaAlunos[1][2] = 9.0;
        notaAlunos[1][3] = 2.0;

        notaAlunos[2][0] = 0.0;
        notaAlunos[2][1] = 7.0;
        notaAlunos[2][2] = 5.0;
        notaAlunos[2][3] = 10.0;

        for (int i = 0; i < notaAlunos.length; i++) {
            double soma = 0;
            for (int j = 0; j < notaAlunos[i].length; j++) {
                soma += notaAlunos[i][j] / 4;

            }
            System.out.println("Media do aluno: " + i + " é " + soma);

        }
        
        System.out.println("...");
        System.out.println("CAUCULANDO MENOR NOTA:");
        System.out.println("...");

        int materia = 0;
        double menorNota = notaAlunos[0][0];
        
        
        for (int i = 0; i < notaAlunos.length; i++) {
            materia = 0;
            menorNota = notaAlunos[i][0];
            for (int j = 0; j < notaAlunos[i].length; j++) {
                if (notaAlunos[i][j] < menorNota) {
                    menorNota = notaAlunos[i][j];
                    materia = j;

                }

            }

            System.out.println("Menor nota do aluno " + i + " foi: " + menorNota + " Na materia de posição: " + materia);
        }
        System.out.println("...");

    }

    // TODO code application logic here
}
