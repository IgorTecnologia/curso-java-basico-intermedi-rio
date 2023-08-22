package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade (kg) de morango: ");
		double qtdMorango = scan.nextInt();
		
		System.out.println("Digite a quantidade (kg )de maçãs: ");
		double qtdMaca = scan.nextInt();
		
		double precoKgMorango = 0;
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoKgMaca = 0 ;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if (qtdMorango <= 5) {
			precoKgMorango = 2.5;
		}else
			precoKgMorango = 2.2;
			
		
		if(qtdMaca <=5) {
			precoKgMaca = 1.8;
		}else  
			precoKgMaca = 1.5;
		

		 if((qtdMorango + qtdMaca >8) || precoParcial > 25) {
			precoTotal = precoParcial / 100 * 10;
		 }
	
		System.out.println("Preco total = " + precoTotal);

	}	

}
	

			
		
	


