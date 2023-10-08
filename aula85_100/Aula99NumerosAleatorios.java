package com.igor.cursojava.aula85_100;

import java.util.Random;

public class Aula99NumerosAleatorios {

	public static void main(String[] args) {
		
		System.out.println(Math.floor(Math.random()* 10)); // floor arredonda
		
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt(101)); // até 100
		
		
	}
}
