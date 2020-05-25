
package br.edu.fescfafic.es.questao01;

public class Vitrola_Aparelho_Concreto extends Vitrola_Aparelho<Disco>{

    @Override
    public String conectado(Disco vitrola) {
        return vitrola.conecta() + getNomeDoAparelho();
    }

    @Override
    public String getNomeDoAparelho() {
        return "aparelho Vitrola";
    }
}
