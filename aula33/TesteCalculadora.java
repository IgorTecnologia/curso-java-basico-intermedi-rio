package com.igor.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCauculadora calc = new MinhaCauculadora();
		calc.soma(1, 2);
		calc.soma(1.0, 2.0);
		
		
		System.out.println(calc.soma(1, 2));
		System.out.println(calc.soma(1, 2));
		
	}

}
