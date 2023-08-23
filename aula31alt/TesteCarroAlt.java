package com.igor.cursojava.aula31alt;

import com.igor.cursojava.aula31.Carro;

public class TesteCarroAlt {

	public static void main(String[] args) {

		Carro carro = new Carro();
		
		carro.marca = "Fiat"; //para acessar a classe Carro aula31 e seus atributos..
		
		carro.obterAutonomia();
		
		
		
	}							// é necessario tornar os atributos publicos...
								// por que os atributos ainda não foram atribuídos valores.

}
