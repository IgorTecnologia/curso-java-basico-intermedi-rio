package com.igor.cursojava.aula19Licao;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new  Scanner (System.in);
	
		int[] vetorA = new int [10];
		int[] vetorB = new int [vetorA.length];
	
		for(int i=0; i<vetorA.length; i++ ) {
			System.out.println("Entre com o número do vetor A da posição "+i);
			vetorA[i] = scan.nextInt();
			
			vetorB[vetorA.length -i -1] = vetorA[i];
			
			
		}
	
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("");
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
	}
	}
}
