package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class exerc22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de (kg) morangos: ");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de (kg) maçãs: ");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if (qtdMorango <=5) {
			precoKgMorango = 2.5;
		}else {
			precoKgMorango = 2.2;
		}
		double precoTotalMorango = qtdMorango * precoKgMorango;
		System.out.println("Valor total morango = " + precoTotalMorango + " R$");
		
		double precoKgMaca = 0;
		if (qtdMaca <=5) {
			precoKgMaca = 1.8;
		}else {
			precoKgMaca = 1.5;
		}
		double precoTotalMaca = qtdMaca * precoKgMaca;
		System.out.println("Valor total maçã = " + precoTotalMaca + " R$");
	
		
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;
		double totalDesconto = precoTotal /100 * 10;
		
		if (qtdMorango + qtdMaca  > 8 || precoParcial > 25 ) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
			System.out.println("Total desconto = "+ totalDesconto + " R$");
		}
		
		
		System.out.println("Preco total: " + precoTotal + " R$");

		
	}
		
}
