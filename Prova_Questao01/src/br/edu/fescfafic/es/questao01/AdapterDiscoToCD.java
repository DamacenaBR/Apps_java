
package br.edu.fescfafic.es.questao01;

public class AdapterDiscoToCD extends CD_Aparelho_Concreto{
    public String conectar(Disco disco){
        return disco.conecta() + getNomeDoAparelho();
    }  
}
