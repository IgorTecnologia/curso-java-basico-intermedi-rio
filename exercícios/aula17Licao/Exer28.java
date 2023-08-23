package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		
		
		System.out.println("Entre com um número: ");
		int numero = scan.nextInt();
		
		boolean primo = true;
		
		for ( int i=2; i< numero; i++) {
			if ( numero % i == 0) {
				System.out.println("Não é primo - divisível por " + i);
				primo = false;
		}
		}
		
		if (primo) {
		System.out.println("É número primo");
	}
	}
}