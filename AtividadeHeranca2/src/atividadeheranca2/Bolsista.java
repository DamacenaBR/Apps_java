/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeheranca2;

/**
 *
 * @author bruno
 */
public class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(getNome() + " é bolsista pagamento facilitado!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nBolsa: " + getBolsa();
    }
    
    
    
}
