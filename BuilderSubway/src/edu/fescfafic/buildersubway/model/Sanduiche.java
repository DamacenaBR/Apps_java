package edu.fescfafic.buildersubway.model;

import java.util.List;

public class Sanduiche {
    
    private String tipoDoPao;
    private String recheio;
    private List<String> molhos;
    private String extra;

    public Sanduiche(String tipoDoPao, String recheio, List<String> molhos, String extra) {
        this.tipoDoPao = tipoDoPao;
        this.recheio = recheio;
        this.molhos = molhos;
        this.extra = extra;
    }

    public String getTipoDoPao() {
        return tipoDoPao;
    }

    public void setTipoDoPao(String tipoDoPao) {
        this.tipoDoPao = tipoDoPao;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public List<String> getMolhos() {
        return molhos;
    }

    public void setMolhos(List<String> molhos) {
        this.molhos = molhos;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Sanduiche{" + "tipoDoPao=" + tipoDoPao + ", recheio=" + recheio + ", molhos=" + molhos + ", extra=" + extra + '}';
    }
}
