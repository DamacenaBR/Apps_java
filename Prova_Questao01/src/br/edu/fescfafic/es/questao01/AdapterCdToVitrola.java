
package br.edu.fescfafic.es.questao01;

public class AdapterCdToVitrola extends Vitrola_Aparelho_Concreto{
    public String conectar(CD cd){
        return cd.conecta() + getNomeDoAparelho();
    }   
}
