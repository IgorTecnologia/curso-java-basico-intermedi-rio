package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Loja quase dois - Tabela de preços");
	
		for ( int i=1; i<=50; i++) {
			
			System.out.println(i + " - R$ " + (1.99 *i));
		}
	}

}
