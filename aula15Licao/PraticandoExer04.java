package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class PraticandoExer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra!");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("a") ||letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Esta letra  é uma vogal: " + letra );
		}else {
			System.out.println("Esta letra  é uma consoante: " + letra );
		}
	
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println("Essa letra é uma vogal: " + letra); break;
		default: System.out.println("Essa letra é uma consoante: " + letra); break;
		}
	
	}

}
