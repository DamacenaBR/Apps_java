package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String tampar;

    public Caneta(String modelo, float ponta, String tampar) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampar = tampar;
    } 
    
    public String getTampar(){
        return this.tampar;
    }
    
    public void setTampar(String tampar){
        this.tampar = tampar;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float ponta){
        this.ponta = ponta;
    }
    
    public void status(){
        System.out.println("\n.......Status.......\n" + "MODELO: " + this.modelo + "\nPONTA: "
                + this.ponta + "\nA caneta está tampada: " + this.tampar);
    }
    
} 