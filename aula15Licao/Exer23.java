package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Tipo de carne: ");
		System.out.println("1 - filé duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");
		int tipoCarne = scan.nextInt();
		
		System.out.println("Quantidade de (kg) de carne: ");
		Double qtdCarne = scan.nextDouble();
		
		double precoKg = 0;
		
		if (tipoCarne == 1) {
		System.out.println(qtdCarne +" kg - filé duplo");
			
			if (qtdCarne <5) {
				precoKg = 4.9;
		}else {
			precoKg = 5.8;
		}
		}else if (tipoCarne == 2) {
			System.out.println(qtdCarne + "kg - alcatra");
			
			if (qtdCarne < 5) {
				precoKg = 5.9;
			}else
				precoKg = 6.8;
			
			}else if (tipoCarne == 3) {
			System.out.println(qtdCarne + "kg - picanha");
			
			if (qtdCarne < 5) 
				precoKg = 6.9;
			}else
				precoKg = 7.8;
	
			
			double total = qtdCarne * precoKg;
			System.out.println( qtdCarne + " kg * " + precoKg + " R$ = " + total + " R$");
		
			System.out.println("Compra no cartão ? digite 1 para sim e 2 para não");
			int cartão = scan.nextInt();
			
			if (cartão == 1) {
				double desconto = ( total / 100) * 5;
				System.out.println("Valor total = " + total + " R$");
				System.out.println("Desconto de 5%: " + desconto + " R$" );
				System.out.println("Valor a pagar = " + (total - desconto));
			}else {
				System.out.println("Valor a pagar = " + total + " R$");
			}
	}
}
		

	

		

		
	
	


