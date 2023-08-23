package com.igor.cursojava.aula26;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	void exibirAutomonia() { // método simples sem retorno.
		System.out.println("A automonia do carro é: " + capCombustivel * consumoCombustivel + " KM");
	}

	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
		
	}
}
