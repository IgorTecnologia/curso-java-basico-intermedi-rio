package com.igor.cursojava.aula31;

public class Carro {

	public String marca = "Fiat";			
	String modelo;	
	int numPassageiros;
	double capCombustivel ;
	private double consumoCombustivel; // quando é private só é necessario ver/acessar, dentro da própria classe.
	
	public void exibirAutomonia() { // método simples sem retorno.
		System.out.println("A automonia do carro é: " + this.capCombustivel * this.consumoCombustivel + " KM");
	}

	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado."); // métodos normalmente são public, por que queremos expor eles a outras classes.
		return this.capCombustivel * this.consumoCombustivel;
		
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		
		return km/this.consumoCombustivel;
	}
	public double caucularCombustivel(double km) {
		
		
		return this.divideKMPorConsumoCombustivel(km) ;
	}
		
	// default é acessado apenas dentro do pacote.
	// public pode ser acessado em outras classes e/ou pacotes.
	// private é acessado apenas dentro da prórpia classe.
}
	
