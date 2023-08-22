package com.igor.cursojava.aula16;

public class LoopsWhileEdoWhile {

	public static void main(String[] args) {
		
		int i = 1; // count ou cont
		int max = 10;
		System.out.println("Contanto até " + max);
		
		while ( i <= max ) { // Comando While ( enquanto ) : Esse comando avalia uma expressão e caso verdadeira executa o bloco dentro do comando while.

			System.out.println("Valor de i: " + i);
			i ++; // i = i + 1; ou 1 +=1;
		
		}
		System.out.println(i);
	
		do { // Comando do-while ( Faça enquanto ): Esse comando executa o bloco dentro do comando 'do' e depois avalia a expressão. O bloco deixa de ser executado após a expressão ficar falsa.
			i++;
			System.out.println(" Valor de i: " + i);
		} while (i < 13);
		
		System.out.println(i);
		}
	
	}


