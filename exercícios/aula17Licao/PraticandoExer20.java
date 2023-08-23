package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class PraticandoExer20 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de idades");
		int idades = scan.nextInt();
		
		int soma = 0;
		int idade = 0;
		
		for (int i=0; i <idades; i++) {
		System.out.println("Entre com a idade " + (i+1));
		idade = scan.nextInt();
		
		soma += idade;
		}
		
		double media = soma / idades;
		
		System.out.println("soma = " + soma);
		System.out.println("Média = " + media);
		
		if (idade <= 17) {
			System.out.println("Jovem");
		}else if (idade >17 & idade <=59){
			System.out.println("Adulto");
		}else if (idade >= 60) {
			System.out.println("Idoso");
				
			}
		}
	
}
