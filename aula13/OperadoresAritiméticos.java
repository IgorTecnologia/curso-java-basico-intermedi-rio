package com.igor.cursojava.aula13;

public class OperadoresAritiméticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println("soma: " + resultado );
		
		resultado = resultado - 1;
		System.out.println("subtração: " + resultado);
		
		resultado = resultado * 2;
		System.out.println("multiplicação: " + resultado);
		
		resultado = resultado / 2;
		System.out.println("Divisão: " + resultado);
		
		resultado = resultado + 8;
		System.out.println("soma: " + resultado);
		
		resultado = resultado % 7;
		System.out.println("mod: " +resultado);// mod é o "resto" o resultado, da divisão neste caso, exemp: 3,33333...
		
		String primeiroNome = " Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println("soma: " + resultado);
		
		resultado ++; 
		System.out.println("soma: " + resultado); 
	
		
		
		System.out.println("soma: " + resultado++); // o ++ é muito utilizado em java.
		//mesma coisa que
		//System.out.println (resultado);
		//resultado = resultado + 1;
		//resultado += 1;
		
		System.out.println("soma: " + ++resultado); // o ++ antes da variável soma + 2
		// mesma coisa que
		// resultado += 1;
		// System.out.println(resultado);
		
		resultado --;
		System.out.println("subtração: " +resultado);
		
		System.out.println("subtração: " + resultado--);
		System.out.println("subtração: " + --resultado); // só subtrai no output se o operador estiver antes da variável
		
		
		
	}

}
