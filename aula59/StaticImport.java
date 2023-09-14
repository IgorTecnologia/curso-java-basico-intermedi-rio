package com.igor.cursojava.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*;

import com.igor.cursojava.*;

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		System.out.println(Math.pow (a, b)); // Math.pow elevação.
		
		System.out.println(Math.sqrt(c)); // sqrt raiz quadrada.
		
		System.out.println(pow(b, c));
		
		System.out.println(sqrt(a));
		
		
	}

}
