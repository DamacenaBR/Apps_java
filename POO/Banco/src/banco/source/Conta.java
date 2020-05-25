/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.source;

/**
 *
 * @author Gutemberg
 */
public class Conta {
    
    public String numero;
    public double saldo;
    public Cliente cliente = new Cliente();
    public Transacao transacao = new Transacao();
    
    public boolean sacar(double valor){
        if(valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            transacao.realizar("Saque", valor);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            transacao.realizar("Depósito", valor);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transferir(Conta conta, double valor){
        if(this.sacar(valor)){
            if(conta.depositar(valor)){
                //transacao.realizar("Transferência", valor);
                return true;
            }
        }
        return false;
    }
    
    public void mostrarExtrato(){
        System.out.println(this.toString());
        transacao.extratoDeTransacoes();
    }
    
    @Override
    public String toString(){
        return "\nNome: "+this.cliente.nome+"\n"
                + "Número da conta: "+this.numero+"\n"
                + "Saldo: R$ "+this.saldo;
    }
    
}