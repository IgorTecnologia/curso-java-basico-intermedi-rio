package com.igor.cursojava.aula34;

public class TesteCalculadora {

	static int resultSoma;
	
	public static void main(String[] args) {
		
		// MinhaCauculadora calc = new MinhaCauculadora();
	
		//	calc.soma(1, 2);
		
		MinhaCauculadora.soma(1, 2);
	
		resultSoma = MinhaCauculadora.soma(1, 2);
		soma2Valores(1, 2);
	}
	
	static int soma2Valores ( int num1, int num2) {
		return MinhaCauculadora.soma(num1, num2);
	}
}
