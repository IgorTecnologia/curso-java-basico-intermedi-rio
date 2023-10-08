package com.igor.cursojava.aula75_84;

import java.util.Arrays;

public class Aula77StringExtraindoChars {

	public static void main(String[] args) {
		
		String java = "Java";
		
		for (int i=0; i<java.length(); i++) {
			System.out.println(java.charAt(i));
		}
		
		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0); // [i] inicial, caracter final, destino, [i] do array
		System.err.println(jav);
		
		// seria o mesmo que
		for (int i=0, j=0; i<3; i++, j++) {
			jav[j] = java.charAt(i);
			System.out.println(jav);
		}
		
		byte[] javaBytes = new byte[3];
		java.getBytes(1, 3, javaBytes, 0);
		System.out.println(Arrays.toString(javaBytes));
		
		char[] javaChars = java.toCharArray();
		System.out.println(javaChars);
	}

	
}
