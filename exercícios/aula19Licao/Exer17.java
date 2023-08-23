package com.igor.cursojava.aula19Licao;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new  Scanner (System.in);
	
		int [] vetorA = new int [10];
		int qtd =0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com a idade da pessoa: " + (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			if (vetorA[i] >35) {
				qtd++;
			}
		}
			
		System.out.print("Vetor de idades = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
			
		System.out.println("Qtd pessoas > 35 anos: " + qtd);
	}

}
