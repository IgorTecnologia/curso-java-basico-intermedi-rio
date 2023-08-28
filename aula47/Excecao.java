package com.igor.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {
		try {
		int [] vetor =  new int [4];
		
		System.out.println("Antes da exception");
		
		vetor[4] = 1;
		System.out.println("Esse texto não sera impresso");
	} catch(ArrayIndexOutOfBoundsException exception) {
		System.out.println("Exceção ao acessar um índice do vetor que não existe");
	}
		System.out.println("Esse texto será impresso após a exception");
	}
}
