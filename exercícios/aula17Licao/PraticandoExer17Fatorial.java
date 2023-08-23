package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class PraticandoExer17Fatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um numero");
		int num = scan.nextInt();
		
		int fatorial = 1;
		
		System.out.println(num +" ! =");
		
		for(int i = num; i>0; i--) {
			fatorial *= i;
			
		System.out.println(i);
		}
		System.out.println("Resultado = " + fatorial);
	}

}
