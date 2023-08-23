package com.igor.cursojava.aula19Licao;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scan = new  Scanner (System.in);
	
	
		char[] vetorB = new char[10];
		int [] vetorA = new int [vetorB.length];
		
		for (int i=0; i<vetorB.length; i++) {
			System.out.println("Entre com o valor do vetor A da posição = "+i);
			vetorA[i] = scan.nextInt();
		
			if(vetorA[i] <7) {
				vetorB[i] = 'a';
			}else if
			(vetorA[i] == 7) {
				vetorB[i] = 'b';
			}else if
			(vetorA[i] >7 &&  vetorA[i]<10) {
				vetorB[i] = 'c';
			}else if
			(vetorA[i] ==10) {
				vetorB[i] = 'd';
			}else {
				vetorB[i] = 'e';
			}
		}
	
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
	}	

		
	
	}
}