package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de turmas: ");
		int numTurmas = scan.nextInt();
		
		int numAlunos;
		int soma =0;
		boolean invalido = true;
		
		for (int i =1; i<= numTurmas; i++) {
			
			invalido = true;
			do {
			
				System.out.println("Entre com o números de alunos da turma: " + i);
				numAlunos = scan.nextInt();
		
				if ( numAlunos >40) {
				invalido = true;
				}else {
					invalido = false;
				System.out.println("Número de alunos Inválido");
				}
			}while (!invalido);
			
			soma += numAlunos;
			}
		
		double media = soma / numTurmas;
		System.out.println("Soma = " + soma);
		System.out.println("Média: " + media);
	
	}
}	
	


