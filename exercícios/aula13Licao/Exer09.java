package com.igor.cursojava.aula13Licao;
import java.util.Scanner;
public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Farenheit: ");
		double f = scan.nextDouble(); //F = Farenheit
		
		double c = (5 * (f -32) / 9); // C = Celsius
		
		System.out.println("A temperatura " + f + "F é igual a " + c + " C");
		
		// procurar saber como chegou ao resultado 32.222... C
	}

}
