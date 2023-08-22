package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer02 {
	
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = scan.nextDouble();
		
		if (valor >= 0 ) {
			System.out.println("O valor é positivo!");
		}else 
				System.out.println("O valor é negativo!");
			}
		
	}
	
	
