package com.igor.cursojava.aula19Licao;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int[] vetorA = new int[10];
		int par =0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o número do vetor A da posição " +i);
			vetorA[i] = scan.nextInt();
	}
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Analizando o número " + vetorA[i]);
			
			for (int j=1; j<vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j + " é divisor");
				}
			}
				System.out.println();
		}
	}

}
