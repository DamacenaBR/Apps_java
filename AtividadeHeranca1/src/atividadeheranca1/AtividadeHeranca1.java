/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeheranca1;

/**
 *
 * @author bruno
 */
public class AtividadeHeranca1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Aluno a1 = new Aluno("Marcos", 18, "Masculino");
            Aluno a2 = new Aluno();
  
            a1.setMatricula(123);
            a1.setCurso("Ciência");
            a1.fazerAniversario();
            
            a2.setNome("Daniel");
            a2.setIdade(16);
            a2.setSexo("Masculino");
            a2.setCurso("Geografia");
            a2.setMatricula(456);
            a2.fazerAniversario();
            a2.cancelarMatricula();
            
            System.out.println(a1);
            System.out.println(a2);
    }
     
}
