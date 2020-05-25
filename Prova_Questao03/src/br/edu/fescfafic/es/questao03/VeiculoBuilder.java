package br.edu.fescfafic.es.questao03;

public class VeiculoBuilder implements Builder<VeiculoBuilder, Veiculo> {

	private boolean arCondicionado;
	private boolean airBarg;
	private boolean multimidia;
	
	@Override
	public VeiculoBuilder arCondicionado() {
		this.arCondicionado = true;
		return this;
	}
	@Override
	public VeiculoBuilder airBarg() {
		this.airBarg = true;
		return this;
	}
	@Override
	public VeiculoBuilder multimidia() {
		this.multimidia = true;
		return this;
	}
	@Override
	public Veiculo montar() {
		return new Veiculo(arCondicionado, airBarg, multimidia);
	}
	
	

}
