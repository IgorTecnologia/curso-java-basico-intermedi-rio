package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class PraticandoExer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um número");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número");
		int num2 = scan.nextInt();
	
		System.out.println("Escolha o operador aritimético + - / *");
		String operacao = scan.next();
		
		int resultado =0;
		boolean valida =  true;
		
		switch(operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
		default: System.out.println("Operacao inválida !"); valida = false;
		}
		
		if (valida) {
			
		
		System.out.println("Resutado = " + resultado);
		if (resultado >=0) {
			System.out.println("Resultado é positivo !");
		}else 
			System.out.println("Resultado é negativo !");
		 if (resultado % 2 == 0) {
			System.out.println("Resultado é par !");
		}else 
			System.out.println("Resultado é impar !");
		
		}
	}
}


