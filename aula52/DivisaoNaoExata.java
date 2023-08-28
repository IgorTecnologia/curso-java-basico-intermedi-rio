package com.igor.cursojava.aula52;

public class DivisaoNaoExata extends Exception {
	private int num;
	private int dem;
	
	public DivisaoNaoExata(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
		
	}

	public String toString() {
		return "Resultado de " + num + "/" + dem + "não é um inteiro";
	}
}
