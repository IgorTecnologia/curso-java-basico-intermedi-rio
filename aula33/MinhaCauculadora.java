package com.igor.cursojava.aula33;

public class MinhaCauculadora {
	
	// Isso se chama sobrecarga de métodos.
	// No exemplo abaixo temos o mesmo método declarado 4 vezes.
	// Para declarar varios métodos iguais, precisa de assinaturas diferentes.
	// Assinatura é ( quantidade de parâmetros, tipo de parâmetros, ou tipo de retorno também).
	public int soma ( int num1, int num2) {
		return num1 + num2;
	}
	public double soma (double num1, double num2) {
		return num1 + num2;
	}

	public int soma ( int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public int soma (int [] vetorInteiros) {
		int total = 0;
		for( int i =0; i<vetorInteiros.length; i++) {
			total += vetorInteiros[i];
			
		}
		return total;
	
	}
}
