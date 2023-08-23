package com.igor.cursojava.aula17Licao;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		
		System.out.println("Fatorial de "+ num);
		
		System.out.print(num + "! = ");
		
		int fatorial = 1;
		for ( int i=num; i>1; i --) {
			fatorial *= i;
			System.out.print(i + " . " );
		}
			
		System.out.print(" 1 = " + fatorial);
		
	}

}
