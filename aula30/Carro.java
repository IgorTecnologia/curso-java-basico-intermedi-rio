package com.igor.cursojava.aula30;

public class Carro {
	
	

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {
			}

	String marca;
	public Carro(String marca, String modelo, int numPassageiros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 parâmetros");
	}
	

	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	void exibirAutomonia() { // método simples sem retorno.
		System.out.println("A automonia do carro é: " + this.capCombustivel * this.consumoCombustivel + " KM");
	}

	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
		
	}
	
	double caucularCombustivel(double km) {
		double qtdCombustivel =  km/this.consumoCombustivel;
		
		return qtdCombustivel;
	}
	
}
