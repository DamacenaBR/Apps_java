package br.edu.fescfafic.es.questao03;

public class Cliente {

	public static void main(String[] args) {
		
		System.out.println(new VeiculoBuilder().arCondicionado().montar());
		System.out.println(new VeiculoBuilder().arCondicionado().airBarg().montar());
		System.out.println(new VeiculoBuilder().arCondicionado().airBarg().multimidia().montar());
		
	}

}
