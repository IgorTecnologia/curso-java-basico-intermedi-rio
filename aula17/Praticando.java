package com.igor.cursojava.aula17;

public class Praticando {

	public static void main(String[] args) {
		
		int soma =0;
		int cont = 0;
		
		for (int i =0; i<5; i++) {
			System.out.println("Valor de i = " + i);
		}
		System.out.println("---------------------");
		
		for ( int i = 0, j = 10; i < j; i ++, j--) {
			System.out.println("Valor de i = " + i + " | " + "Valor de j = " + j);
		}
		System.out.println("---------------------");
		
		
		for (int i =0; i <5; i++) {
			cont += 2;
			System.out.println("Valor cont = " + cont);
		}
		System.out.println("---------------------");
		
		
		for (int i = 1; i<=5; soma += i ++) {
			System.out.println("Valor soma = " + soma);
		}
		System.out.println("---------------------");
		
		for(int i =5; i >0; i--) {
			System.out.println("Valor de i = " + i);
		}
		System.out.println("---------------------");
	
		cont =0;
		for ( ; cont <5;) {
		System.out.println("Valor cont = "+ cont);
		cont += 2;
	}
	}

}
