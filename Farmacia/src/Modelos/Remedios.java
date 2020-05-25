
package Modelos;

import java.time.LocalDate;

public class Remedios extends Produto {
    private LocalDate validade;
    private String tarja;
    private boolean receita;

    public Remedios(LocalDate validade, String tarja, boolean receita) {
        this.validade = validade;
        this.tarja = tarja;
        this.receita = receita;
    }

    public Remedios(LocalDate validade, String tarja, boolean receita, String nome, float preco, float peso, String codigoBarra) {
        super(nome, preco, codigoBarra);
        this.validade = validade;
        this.tarja = tarja;
        this.receita = receita;
        
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public boolean isReceita() {
        return receita;
    }

    public void setReceita(boolean receita) {
        this.receita = receita;
    }

    @Override
    public String toString() {
        return "Remedios{" + "validade=" + validade + ", tarja=" + tarja + ", receita=" + receita + '}';
    }   
}
