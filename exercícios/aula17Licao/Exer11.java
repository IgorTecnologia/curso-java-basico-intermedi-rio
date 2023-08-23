package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int soma =0;
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = scan.nextInt();
	
		System.out.println("Entre com o segundo número: ");
		int num2 = scan.nextInt();
		
		
		for (int i= num1; i<= num2; i++) {
			soma += i;
			System.out.println( i );
	
		}
			System.out.println("Resultado soma: " +( soma));
	}

	}
