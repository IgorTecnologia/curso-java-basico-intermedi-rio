package com.igor.cursojava.aula29;

public class Carro02 {

	
	public Carro02() { // construtor vazio. é como se fosse um método vazio e sem retorno.
	}
		
		public Carro02(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consumoCombustivel;
		
		
	}


