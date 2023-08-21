package com.igor.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro; // com apenas um '&' o java analisa se é verdadeiro ou falso.
		boolean resultado2 = falso && verdadeiro; // com dois '&&' o java simplesmente ignora a proxima expressão e ja da o resultado com a primeira expressão, nesse caso que é falso.
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		// o '&&' é chamado de curto circuito. E funciona tanto para o  'e' quanto para o ' ou'.
	
		int resultado = 1 + 1 - 1 + 1* 1 /1; // primeiro a * -> / -> + -> - e +
		System.out.println(resultado);
		
	
	
	}

}
