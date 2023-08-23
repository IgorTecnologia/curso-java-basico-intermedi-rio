package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		boolean valido = false;
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		do {
			
				System.out.println("Digite a qdt da população A: ");
				popA = scan.nextDouble();
			if ( popA >0 ) {
				valido = true;
			}else {
				System.out.println("Entre com um número maior que 0: ");
			}
			}while (!valido);
			
			valido = false;
			do {
				
				System.out.println("Digite a qdt da população B: ");
				popB = scan.nextDouble();
			if ( popB > 0) {
				valido = true;
			}else {
				System.out.println("Entre com um número maior que 0: ");
			}
				
			}while(!valido);
			
			valido = false;
			do {
				
				System.out.println("Entre com a taxa da população A: ");
				taxaA = scan.nextDouble();
			if ( taxaA >0 ) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento precisa ser maior que 0: ");
			}
			}while (!valido);
			
			valido = false;
			do {
				
				System.out.println("Entre com a taxa da população B: ");
				taxaB = scan.nextDouble();
			if ( taxaB >0 ) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento precisa ser maior que 0: ");
			}
			}while (!valido);
			
			int cont = 0;
			
			while ( popA < popB) {
				
				popA += (popA / 100) *taxaA;
				popB += (popB /100) *taxaB;
				cont ++;
				
			}
			System.out.println("População A: " + popA);
			System.out.println("População B: " + popB);
			System.out.println("Quantidade de anos: " + cont);
	
	
	
	}
			
		

	}

	


			
	
