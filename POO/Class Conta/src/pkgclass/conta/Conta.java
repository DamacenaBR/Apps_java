
package pkgclass.conta;

import java.util.Date;

public class Conta {
    int numero;
    double saldo;
    Transacao [] transicoes = new Transacao[10];
    Cliente cliente = new Cliente ();
    
    /*boolean sacar (double valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor;
            registrarTransacoes();
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean depositar (double valor){
        if (valor > 0){
            saldo += valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean transferir (Conta destino, double valor){
        if (sacar (valor)){
            if (destino.depositar (valor)){
                return true;
            }
        }
        return false;
    }
    void registrarTransacao(String op, double v){
        Transacoes t = new Transacao();
        t.data = new Date();
        t.operacao = op;
        t.valor = v;
        
        for (int i = 0, i < transacoes.length,i++){
            
        }
    }*/
    
        
}


