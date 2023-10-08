package com.igor.cursojava.aula75_84;

public class Aula81StringToLowerCaseToUpperCase {

	public static void main(String[] args) {
			
		String teste ="Teste";
		
		String testeMinusc = teste.toLowerCase(); // para  caixa baixa
		String testeMaiusc = teste.toUpperCase(); // para caixa alta
		
		System.out.println(testeMinusc);
		System.out.println(testeMaiusc);

		System.out.println(teste.toLowerCase().equalsIgnoreCase(teste.toUpperCase()));

	}

}
