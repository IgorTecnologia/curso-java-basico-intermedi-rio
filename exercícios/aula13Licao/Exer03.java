package com.igor.cursojava.aula13Licao;

import java.util.Scanner;
public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: "); 
		int numero1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		
		System.out.println("A soma dos números é: " + resultado);
	
		
	}

}
