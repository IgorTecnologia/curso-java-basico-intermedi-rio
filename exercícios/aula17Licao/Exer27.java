package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com a qtd de temperaturas");
		int qtdTemperaturas = scan.nextInt();
		
		double temp;
		double soma =0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_NORMAL;
		
		for (int i =1; i <=qtdTemperaturas; i++) {
			
			System.out.println("Entre com a tempertura " + i);
			temp = scan.nextDouble();
			
			soma += temp;
			
			if ( temp > maior) {
				maior = temp;
			}
			if (temp < menor) {
				menor = temp;
			}
		}
			System.out.println("Média: " + (soma/qtdTemperaturas));
			System.out.println("Menor temperatura: " + menor);
			System.out.println("Maior temperatura: " + maior);
	
	}
}
