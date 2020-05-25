package beans;

import java.time.LocalDate;

/**
 *
 * @author Elder Pereira
 */
public class Comissionado extends Funcionario {

    private float vendas;
    private float comissao;

    public Comissionado(float vendas, float comissao, String cpf, String nome, LocalDate nascimento) {
        super(cpf, nome, nascimento);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float salarioComissao() {
        return vendas * comissao;
    }

    @Override
    public String toString() {
        return super.toString() + " vendas=" + vendas + " comissão=" + comissao;
    }

}
