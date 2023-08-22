package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class PraticandoExer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro número !");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número !");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número !");
		int num3 = scan.nextInt();
	
		if (num1 > num2 & num1 > num3) {
			System.out.println("O num1 é o maior número, num1 = " + num1);
		}else if(num2 > num1 & num2 > num3) {
			System.out.println("O num2 é o maior número, num2 =  " + num2);
		} else if ( num3 > num1 & num3 > num2) {
			System.out.println("O num3 é o maior número, num3 = " + num3);
		}
	
	}

}
