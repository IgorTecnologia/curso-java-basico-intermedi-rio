package com.igor.cursojava.aula30;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("Fiat" , "Ducato", 10, 100, 0.2);
	
		System.out.println(van.numPassageiros);
		

		van.caucularCombustivel(10);
			
		}
	}
	

