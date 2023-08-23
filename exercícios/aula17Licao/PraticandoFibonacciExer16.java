package com.igor.cursojava.aula17Licao;

public class PraticandoFibonacciExer16 {

	public static void main(String[] args) {
		
		int proximo=0;
		int primeiro = 1;
		int segundo = 1;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while (proximo <=500) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
	}

}
