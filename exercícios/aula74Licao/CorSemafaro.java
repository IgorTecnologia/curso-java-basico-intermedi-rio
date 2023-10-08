package com.igor.cursojava.aula74Licao;

public enum CorSemafaro {

	VERDE(1000), AMARELO(300), VERMELHO(2000);
	
	private int tempoEspera;
	
	private CorSemafaro(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	
	}

	public int getTempoEspera() {
		return tempoEspera;
	}

}
