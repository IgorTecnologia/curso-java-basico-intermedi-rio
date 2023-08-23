package com.igor.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		for ( int i = 0; i <5; i++) {
			System.out.println("Valor i: " + i);
		}
		
		for ( int i = 5; i > 0; i-- ) { // quando se decrementa ( -- ), normalmente se coloca ( <= ).
		System.out.println("Valor de i: " + i);
	}

		for ( int i = 0, j = 10; i < j; i ++, j --) {
		System.out.println("i = " + i + "; j = " + j);
	
		}
		
		int count = 0;
		for ( ; count <5;) { // partes ausentes
			System.out.println("Valor count: " + count);
			count += 2;
		}
		
		for ( int cont =0; cont <10; cont +=2) {
			System.out.println("Valor count: " + cont);
		}
	
		int soma =0;
		for ( int i = 1; i < 5; soma += i++); // recomendado usar sempre chaves em vez de ' ; '.
			System.out.println("O valor da soma é :" + soma);
		
	
		for ( int i = 0; i <5; i++) 
		System.out.println("Valor i: " + i);
		}
	}

