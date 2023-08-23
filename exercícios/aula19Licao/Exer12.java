package com.igor.cursojava.aula19Licao;

import java.util.Scanner;

public class Exer12{

	public static void main(String[] args) {
		
		Scanner scan = new  Scanner (System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		
		for (int i=0; i<vetorA.length; i++ ) {
			System.out.println("Entre com o valor do vetorA da posição " +i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i] + i;
		}
		
			System.out.print("Vetor A = " );
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		int soma =0;
		for(int i=0; i<vetorA.length; i++) {
			soma+= vetorA[i];
		}
	
		System.out.println();
		
		System.out.println("Soma de A + B: " + soma);
	
	}	

}
