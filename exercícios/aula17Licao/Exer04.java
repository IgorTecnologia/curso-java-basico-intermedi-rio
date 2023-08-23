package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);
			
		int popA = 80000;
		double popB = 200000;
		int cont = 0;
		
		while ( popA <  popB) {
			
			popA += (popA / 100) *3;
			popB += (popB /100) * 1.5;
			cont ++;
			
		}
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de anos: " + cont);
	}

}
