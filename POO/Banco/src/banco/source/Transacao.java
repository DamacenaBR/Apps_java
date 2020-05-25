/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.source;

import java.util.Date;

/**
 *
 * @author Gutemberg
 */
public class Transacao {
    
    public String[] operacao = new String[100];
    public Date dataOperacao = new Date();
    public double[] valor = new double[100];
    
    public void realizar(String op, double valorOperacao){
        for(int i = 0; i < operacao.length; i++){
            if(operacao[i] == null){
                operacao[i] = op;
                 valor[i] = valorOperacao;
                break;
            }
        }
    }
    
    public void extratoDeTransacoes(){
        for(int i = 0; i < operacao.length; i++){
            if(operacao[i] != null){
                System.out.println(" - "+this.operacao[i]+" - R$ "+this.valor[i]
                                  +" - "+this.dataOperacao);
            }
        }
    }
    
    /*@Override
    public String toString(){
        for(int i = 0; i < operacao.length; i++){
            if(operacao[i] != null){
                return " - "+this.operacao[i]+" - R$ "+this.valor[i]+" - "+this.dataOperacao+"\n";
            }
        }
        return "Sem transações realizadas.";
    }*/
    
}
