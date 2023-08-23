package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numeros;
		int maior = -1;
		
		for (int i= 0; i<5; i++ ) {
			System.out.println("Entre com os números: ");
			numeros = scan.nextInt();
					
			if ( numeros > maior) {
				maior = numeros;
				System.out.println("O maior número mudou: " + maior);
			
			}
		}
		
		System.out.println("Maior numero: " + maior);
		
	}

}
