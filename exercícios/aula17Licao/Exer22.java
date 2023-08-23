package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Entre com o número de CD's: ");
		int cds = scan.nextInt();
		
		
		double preco;
		double soma =0;
		
		for (int i=1; i<= cds; i++) {
			System.out.println("Informe o valor do cd: " +i);
			preco = scan.nextDouble();
			
			soma += preco;
			
		}
		double media = soma / cds;
		
		
		System.out.println("média gasta com cada CD: " + media);
	}

}
