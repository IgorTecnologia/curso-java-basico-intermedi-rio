package com.igor.cursojava.aula13Licao;
import java.util.Scanner;
public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota");
		double nota01 = scan.nextDouble();
		
		System.out.println("Entre com a Segunda nota");
		double nota02 = scan.nextDouble();
		
		System.out.println("Entre com a terceira nota");
		double nota03 = scan.nextDouble();
		
		System.out.println("Entre com a quarta nota");
		double nota04 = scan.nextDouble();
	
		double media = (nota01 + nota02 + nota03 + nota04) /4;
		
		System.out.println(" A média é : " + media);
	
	
	}

}
