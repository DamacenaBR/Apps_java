
package br.edu.fescfafic.es.questao01;

public class Principal {

    public static void main(String[] args) {
        CD_Concreto cd = new CD_Concreto();
        DiscoConcreto disco = new DiscoConcreto();
        
        CD_Aparelho_Concreto cd_aparelho = new AdapterDiscoToCD();
        Vitrola_Aparelho_Concreto vitrola = new Vitrola_Aparelho_Concreto();
        
        AdapterCdToVitrola adapCDToVitrola = new AdapterCdToVitrola();        
        System.out.println(adapCDToVitrola.conectar(cd));
        
        System.out.println();
        
        AdapterDiscoToCD adapDiscoToVitrola = new AdapterDiscoToCD();
        System.out.println(adapDiscoToVitrola.conectar(disco));
    }
    
}
