package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numeros;
		double media;
		int soma =0;
		
		for (int i =0; i <5; i++) {
		
			System.out.println("Digite 5 números: ");
			numeros = scan.nextInt();
		
			soma += numeros;
		}
		
		media = soma /5;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	
	
	}
}
