
package br.edu.fescfafic.es.questao01;

public class CD_Aparelho_Concreto extends CD_Aparelho<CD>{

    @Override
    public String conectado(CD cd) {
        return cd.conecta() + getNomeDoAparelho();
    }

    @Override
    public String getNomeDoAparelho() {
        return "aparelho CD";
    }
    
}
