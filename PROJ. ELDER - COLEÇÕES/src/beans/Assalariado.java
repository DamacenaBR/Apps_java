package beans;

import java.time.LocalDate;

/**
 *
 * @author Elder Pereira
 */
public class Assalariado extends Funcionario {

    private float salario;

    public Assalariado(float salario, String cpf, String nome, LocalDate nascimento) {
        super(cpf, nome, nascimento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " salario=" + salario;
    }

}
