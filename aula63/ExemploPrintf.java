package com.igor.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		
		// System.out.format(); e Systen.out.printf(); é a mesma coisa.
		//  % é para formatação. de numeros ou string.
		
		System.out.printf("%s", "Olá, mundo!"); // printf não pula linha.
		System.out.println();
		System.out.printf("%S", "Olá, mundo!");
		System.out.println();
		
		System.out.printf("%c", 'c'); // formatação para caracter( "%c" / "%C" ).
		System.out.println();
		System.out.printf("%C", 'c');
		System.out.printf("%n"); // Pular linha com printf ( "%n" ) boas práticas com printf.
		
		int valor = 123456789;
		
		System.out.printf("%d", valor); // saída de número inteiro ( "%d" ).
		System.out.printf("%n");
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);
		
		System.out.printf("%n");
		
		String olaMundo = "Olá, Mundo!";	
		
		System.out.printf("%20s", olaMundo); // "%20s" para delimitar a quantidade de caracteres no output.
		System.out.printf("%n");
		
		System.out.printf("%-20s", olaMundo);
		System.out.printf("%n");
		
		System.out.printf("%+d", valor); // para acrescentar um operador aritimético no output.
		System.out.printf("%n");
		
		System.out.printf("%015d", valor); // Para acrescentar números a variável. nesse casa o número é 0, e o limite de números é 15.
		System.out.printf("%n");
		
		System.out.printf("%,d", valor); // separar os números por vírgulas.
		System.out.printf("%n");
		
		int valor2 = -123456789;
		System.out.printf("% d", valor2); // com o espaço, faz o output do operador aritimético se for negativo.
		System.out.printf("%n");
		
		System.out.printf("% d", valor); //  se o valor não for negativo como no exemplo acima, o output sai com um espaço.
		System.out.printf("%n");
		
		System.out.printf("%.4f", pontoFlutuante); // arredondamento, > %.4f, o 4 é o número de casas decimais.
		System.out.printf("%n");
		
		System.out.printf("R$%10.2f", pontoFlutuante);
		System.out.printf("%n");
		
		testeMaisCompleto();
	
	}
	
	private static void testeMaisCompleto() {
		double [] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for(int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);		
	}
	}
}
