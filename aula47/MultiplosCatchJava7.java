package com.igor.cursojava.aula47;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16 ,32, 64, 128};
		int [] denominadores = {2, 0, 4, 8, 0};

		for(int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e1){
				System.out.println("Ocorreu um erro");
			
			}
		}
	}
}


