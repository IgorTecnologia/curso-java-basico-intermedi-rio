package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class PraticandoTabuada {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número da tabuada:");
		int num = scan.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(num +" x " + i + " = " + num * i);
		}
	}
}
