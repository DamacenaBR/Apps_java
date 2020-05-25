package br.edu.fescfafic.es.questao03;

public class Veiculo {

	private boolean arCondicionado;
	private boolean airBarg;
	private boolean multimidia;
	
	public Veiculo(boolean arCondicionado, boolean airBarg, boolean multimidia) {
		super();
		this.arCondicionado = arCondicionado;
		this.airBarg = airBarg;
		this.multimidia = multimidia;
	}
	
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public boolean isAirBarg() {
		return airBarg;
	}
	public void setAirBarg(boolean airBarg) {
		this.airBarg = airBarg;
	}
	public boolean isMultimidia() {
		return multimidia;
	}
	public void setMultimidia(boolean multimidia) {
		this.multimidia = multimidia;
	}

	@Override
	public String toString() {
		return "Veiculo [arCondicionado=" + arCondicionado + ", airBarg=" + airBarg + ", multimidia=" + multimidia
				+ "]";
	}
	
}
