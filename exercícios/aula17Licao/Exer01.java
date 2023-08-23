package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Digite uma nota de 0 à 10: ");
			double nota = scan.nextDouble();
			
			if (nota >=0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			}else {
				notaValida = false;
				System.out.println("Nota inválida, digite novamente: ");
			}
			}while (!notaValida);
	}
}
		
		
			


	


