package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer08 {
	
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o preço do produto 1: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Qual o preço do produto 2: ");
		double produto2 = scan.nextDouble();
		
		System.out.println("Qual o preço do produto 3: ");
		double produto3 = scan.nextDouble();
		
		if ( produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("O primeiro produto é o ideal!");
		}if ( produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O segundo produto é o ideal!");
		
		}if ( produto3 <= produto1 && produto3 <= produto2) {
				System.out.println("O terceiro produto é o ideal!");
		
		}
		
	}
	
	
}