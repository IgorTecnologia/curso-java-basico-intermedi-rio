package com.igor.cursojava.aula19Licao;


import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int[] vetorA = new int [5];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o número do vetor A da posição " +i);
			vetorA[i] = scan.nextInt();
	}
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Tabuada de " + vetorA[i]);
			
		for (int j=1; j<=10; j++) {
				
			System.out.println(vetorA[i] +" * " + j + " = " + (vetorA[i]) *j);
			}
		
		System.out.println("");
		
		
		}
}
}