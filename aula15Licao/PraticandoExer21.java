package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class PraticandoExer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tipo de combústivel 'A' para alcool e 'G' para gasolina");
		String tipo = scan.next();
		
		System.out.println("Entre com a quantidade de litros vendidos");
		double litros = scan.nextDouble();
		
		double precoAlcool = 1.9;
		double precoGas = 3.0;
		double total = 0;
		double perDesconto =0;
		double totalDesconto = 0;
		
		if(tipo.equalsIgnoreCase("A")) {
			if (litros <=20) {
			perDesconto = 4;
		}else { 
			perDesconto = 6;
		}
			total = litros * precoAlcool;
			System.out.println("Percentual de desconto = " + perDesconto +" %");
		
		}else if(tipo.equalsIgnoreCase("G")) {
			if(litros <=20) {
				perDesconto = 8;
			}else {
				perDesconto = 10;
			}
			total = litros * precoGas;  
			System.out.println("Percentual de desconto = " + perDesconto +" %");
		}
		
		totalDesconto = total / 100 * perDesconto;
	
		double valorPagar = total - totalDesconto;
		
		System.out.println("Total de Desconto: " + totalDesconto +" R$");
		System.out.println("Valor a pagar = " + valorPagar + " R$");
		
	
	}
}


