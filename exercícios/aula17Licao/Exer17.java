package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		
		System.out.println(numero +"! = ");
		
		int fatorial = 1;
		for ( int i = numero; i >0; i --) {
			fatorial *= i;
			System.out.println(i);
		}
			
		System.out.println("Resultado: " + fatorial);
		
		
		
	}

}
