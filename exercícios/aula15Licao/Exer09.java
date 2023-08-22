package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer09 {
	
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int num3 = scan.nextInt();
		
		if (num1 <= num2 && num1 <= num3 && num2 <=num3) {
			System.out.println( num3 + "-" + num2 + "-" + num1);
		// num1 é o menor
		// num3 é o maior
		// num1 < num2 < num3
		}else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
				System.out.println(num2 + "-" + num3 + "-" + num1);
		// num1 é o menor
		// num2 é o maior
		// num1 < num3 < num2
				
		}else if (num3 <= num1 && num3 <=2 && num2 <=1 && num2 <= num3) {
				System.out.println( num1 + "-" + num2 + "-" + num3);
		// num3 é o menor
		// num1 é o maior
		// num3 < num2 < num1
		}
		else if (num2 <= num1 && num2 <= num3 && num3 <= num2) {
			System.out.println(+ num1 +"-" + num3 +"-" + num2);
		// num2 é o menor
		// num1 é o maior
		// num2 < num3 < num1
		}else if( num3 <= num2 && num3 <= num1 && num1 <= num3) {
			System.out.println(num2 + "-" + num1 + "-" + num2);
		// num3 < num1 < num2
		} else if (num1 <= num3 && num1 <= num2 && num2 <= num3) {
			System.out.println(num3 + "-" + num2 + "-" + num1);
			
				
				
				
			}
		
		}
	
	
	}	
	
	
