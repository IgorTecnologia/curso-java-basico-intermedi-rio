package com.igor.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		
		Carro van = new Carro ();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		// van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println("Números de passageiros: " + van.numPassageiros);
		
		
		Carro van2 = new Carro("Fiat" ,"Ducato ", 10 , 100, 0.2);
		
		
		System.out.println("Marca do carro: " + van2.marca);
		System.out.println("Modelo do carro: " + van2.modelo);
		System.out.println("Números de passageiros: " + van2.numPassageiros);
		System.out.println("Capacidade de combústivel: " + van2.capCombustivel);
		System.out.println("Consumo de combústivel: " + van2.consumoCombustivel);
	
		Carro02 carro2 = new Carro02(); // é necessário um construto vazio, para instanciar esse método.

		
	}
}
