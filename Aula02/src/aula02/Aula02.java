package aula02;

public class Aula02 {

    public static void main(String[] args) {  
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Poli";
        c2.cor = "vermelho";
        c2.ponta = 1.0f;
        c2.carga = 70;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
    
}
