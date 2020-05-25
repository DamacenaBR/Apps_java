/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeheranca2;

/**
 **
 *@author bruno
 */
public class AtividadeHeranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        v1.setNome("bruno");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1);
        System.out.println("-------------------------");
        
        
        Professor p1 = new Professor();
        p1.setNome("Daniel");
        p1.setIdade(23);
        p1.setSalario(111);
        p1.setSexo("M");
        p1.setEspecialidade("Tinteiro");
        p1.receberAumento(500);
        System.out.println(p1);
        System.out.println("-------------------------");
        
        
        Professor p2 = new Professor("daniel", 22, "M");
        System.out.println(p2);
        System.out.println("-------------------------");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Damiana");
        b1.setIdade(22);
        b1.setSexo("F");
        b1.setBolsa(111);
        b1.setCurso("IT");
        b1.pagarMensalidade();
        System.out.println(b1);
        System.out.println("--------------------------");
       
        
    }
    
}
