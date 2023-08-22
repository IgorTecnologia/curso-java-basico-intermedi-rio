package com.igor.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18 ) {
			System.out.println("Maior  de idade!");
		} else {
			System.out.println("Menor de idade!");
	
		}
		
		// barato <=10
		// valor > 10 && < 15 - pedir desconto
		// valor >= 15 && < 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.println("Entre com o preço do item: ");
		double valor = scan.nextDouble();
		
		if(valor <=10) {
			System.out.println("Está barato, pode comprar!");
		} else if ( valor >10 && valor < 15){
			System.out.println(" Pedir desconto!");
		}else if(valor >= 15 && valor <17) {
			System.out.println("Pode pesquisar mais!");
		}else { // valor >=17
			System.out.println("Está muito caro!");
		}
	  }
	}


