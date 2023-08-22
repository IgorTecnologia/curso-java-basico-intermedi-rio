package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de litros vendido: ");
		double litros = scan.nextDouble();
		
		System.out.println("tipo de combustível 'A' para alcool e 'G' para gasolina: ");
		String tipo = scan.next();
		
		double precoAlc = 1.9;
		double precoGas = 2.5;
		int perDesconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		
		if (tipo.equalsIgnoreCase("a")){
		
			if (litros <= 20) {
				perDesconto = 3;
			} else {
				perDesconto = 5;
			}
			 total = litros * precoAlc;
			 
		} else if (tipo.equalsIgnoreCase("g")){
			
		 if(litros <=20) {
				perDesconto = 4;
		} else {
				perDesconto = 6;
		}
			total = litros * precoGas;
		}	
			
			totalDesconto = (total / 100) * perDesconto;
			
			double valorAPagar = total - totalDesconto;
				
			
			System.out.println("Valor a ser pago: R$ " + valorAPagar);
			System.out.println("Total de desconto: R$ " + totalDesconto);
		
			
					}
	}

	

		
		
		
		
		
		
		
	


