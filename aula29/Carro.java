package com.igor.cursojava.aula29;

public class Carro {

		
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consumoCombustivel;
		
		Carro(){
			System.out.println("Classe carro foi instanciada");
		numPassageiros =4;
		}
		
		
		Carro (String marca_, String modelo_ , int numPassageiros_ , double capCombustivel_, double consumoCombustivel_) {
			marca = marca_;
			modelo = modelo_;
			numPassageiros = numPassageiros_;
			capCombustivel =  capCombustivel_;
			consumoCombustivel = consumoCombustivel_;
		}
		void exibirAutomonia() { // método simples sem retorno.
			System.out.println("A automonia do carro é: " + capCombustivel * consumoCombustivel + " KM");
		}

		double obterAutonomia() {
			System.out.println("Método obterAutonomia foi chamado.");
			return capCombustivel * consumoCombustivel;
			
		}
		
		double caucularCombustivel(double km) {
			double qtdCombustivel =  km/consumoCombustivel;
			
			return qtdCombustivel;
		}
		
		
	}
