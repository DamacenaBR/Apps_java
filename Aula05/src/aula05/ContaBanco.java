package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("----------CONTA---------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());      
    }
      
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
            
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!!");
    }
   
    public void fecharConta(){
        if(this.getSaldo() > 0){
           System.out.println("Conta não pode ser feichado ainda tem dinheiro!!!");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser feichada pois tem debito!!!");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!!");
        }
    }
   
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado da conta de " + this.getDono() + " com sucesso!!!");
        }
        else{
            System.out.println("Impossivel realizar o deposito em uma com fechada!!!");
        }
    }
   
    public void sacar(float v){
        if(getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado conta de " + getDono() + " com sucesso!!!");
            }
            else{
                System.out.println("Saldo inssuficiente para o saque!!!");
            }
        }
        else{
            System.out.println("Impossivel sacar de uma conta fechada!!!");
        }
    }
   
    public void pagarMesal(){
        int v = 0;
        if("CC".equals(this.getTipo())){
           v = 12;
        }
        else if("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!!!");
        }
    }
    
    public ContaBanco(){
       this.saldo = 0;
       this.status = false;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 

        
} 