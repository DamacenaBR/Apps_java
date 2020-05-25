package br.edu.fescfafic.es.questao02;

public class Secretaria {

	private ServicoClienteEspecial servicoClienteEspecial;
	private ServicoEmprestimo servicoEmprestimo;
	private ServicoPresidencia servicoPresidencia;
	
	public Secretaria() {
		servicoClienteEspecial = new ServicoClienteEspecial();
		servicoEmprestimo = new ServicoEmprestimo();
		servicoPresidencia = new ServicoPresidencia();
	}
	
	public void fazerLigacao(String nomeCliente) {
		this.servicoClienteEspecial.ligar(nomeCliente);
		this.servicoEmprestimo.ligar(nomeCliente);
		this.servicoPresidencia.ligar(nomeCliente);
	}
	
}
