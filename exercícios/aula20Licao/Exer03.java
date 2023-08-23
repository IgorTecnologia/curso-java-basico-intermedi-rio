package com.igor.cursojava.aula20Licao;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int [] [] matriz = new int [3] [3];
		
		
		for (int i=0; i< matriz.length; i++) {
			for (int j =0; j <matriz[i].length; j++) {
				
				System.out.println("Entre com o valor da posição [" +i + "," + j + "]");
				matriz[i][j] = scan.nextInt();
		}
		}
		
		int qtdPares =0;
		int qtdImpares =0;
		for (int i=0; i< matriz.length; i++) {
			for (int j =0; j <matriz[i].length; j++) {
			if (matriz[i] [j] % 2 ==0) {
				qtdPares ++;
			}else {
				qtdImpares ++;
			}
			
			}
	}
		
		for (int i=0; i< matriz.length; i++) {
			for (int j =0; j <matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	
		System.out.println("Quantidades de números pares = " + qtdPares);
		System.out.println("Quantidades de números impares = " + qtdImpares);
	}
}