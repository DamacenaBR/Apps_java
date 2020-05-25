package beans;

import java.time.LocalDate;

/**
 *
 * @author Elder Pereira
 */
public class Horista extends Funcionario implements Comparable<Horista> {

    private float horas;
    private float precoHoras;

    public Horista(float horas, float precoHoras, String cpf, String nome, LocalDate nascimento) {
        super(cpf, nome, nascimento);
        this.horas = horas;
        this.precoHoras = precoHoras;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public float getPrecoHoras() {
        return precoHoras;
    }

    public void setPrecoHoras(float precoHoras) {
        this.precoHoras = precoHoras;
    }

    public float salarioHorista() {
        return horas * precoHoras;
    }

    @Override
    public String toString() {
        return super.toString() + " horas=" + horas + " preço horas=" + precoHoras;
    }

    @Override
    public int compareTo(Horista o) {
        return this.getCpf().compareToIgnoreCase(o.getCpf());
    }

}
