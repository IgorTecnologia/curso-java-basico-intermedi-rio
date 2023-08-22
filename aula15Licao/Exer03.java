package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer03 {
	
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra F ou M: ");
		String input = scan.next(); // String é uma classe java.
		
		if (input.equalsIgnoreCase ("f")) {
			System.out.println("F - femenino");
		}else if (input.equalsIgnoreCase ("m")) {
			System.out.println("M - masculino");
		}else {
			System.out.println("Sexo inválido");
		
		}
	
	}
}
