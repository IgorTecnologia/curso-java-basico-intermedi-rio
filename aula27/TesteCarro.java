package com.igor.cursojava.aula27;

import com.igor.cursojava.aula27.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
	
			
			Carro van = new Carro ();
			van.marca = "Fiat";
			van.modelo = "Ducato";
			van.numPassageiros = 10;
			van.capCombustivel = 100;
			van.consumoCombustivel = 0.2;
			
			System.out.println(van.marca);
			System.out.println(van.modelo);
			
			van.exibirAutomonia();
			
			double autonomia = van.obterAutonomia(); // Atribuindo o método à uma variável.
			System.out.println("A autonomia do carro é: " + autonomia);
			System.out.println("A autonomia do carro é: " + van.obterAutonomia());
		 
			double qtdCombustivel10 = van.caucularCombustivel(10);
			double qtdCombustivel15 = van.caucularCombustivel(15);
			
			System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
			System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
	
	}
	}
	

