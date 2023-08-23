package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numeros;
		int pares = 0;
		int impares = 0;
		
		
		
		for (int i =0; i <10; i ++) {
			
			System.out.println("Entre com um número: ");
			numeros = scan.nextInt();
			
			if ( numeros % 2 ==0 ) {
				pares ++;
			} else {
				impares++;
			}
		
		}
		
			System.out.println("Numeros pares: " + pares);
			System.out.println("Números impares: " + impares);
	
	
	
	}

}
