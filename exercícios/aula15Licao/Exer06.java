package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer06 {
	
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro numero: ");
		double num3 = scan.nextDouble();
		
		if (num1 >= num2 && num1 >= num3 ) {
			System.out.println("O primeiro número é o maior: " + num1);
		}else if ( num2 >= num1 && num2 >= num3) {
			System.out.println("O segundo número é o maior: " + num2);
		}else if ( num3 >= num1 && num3 >= num2) {
			System.out.println("O terceiro número é o maior: " + num3);
			
		
		
		}
		
	
	}
	
	
}