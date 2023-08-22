package com.igor.cursojava.aula15Licao;

import java.util.Scanner;

public class Exer01 {
	
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Digite um número: ");
	int num1 = scan.nextInt();
	
	System.out.println("Digite um número: ");
	int num2 = scan.nextInt();
	
	System.out.println("Número 1: "+ num1);
	System.out.println("Número 2: "+ num2);
	
	if (num1 > num2){
		System.out.println( "O num1 é maior: "+num1);
		} else if  (num2 > num1){
			System.out.println("O num2 é o maior: "+num2);
		}else {
			System.out.println("Os números são iguais !");
	}
}
}
	
	
