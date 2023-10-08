package com.igor.cursojava.aula75_84;

public class Aula83StringBuilderEStringBuffer {
	
	public static void main(String [] args) {
		
	
	String [] letras = {"B", "C", "D", "E", "f"};
	
	String alfabeto = "";
	
	for (String letra: letras) {
		alfabeto += letra;
	}
		System.out.println(alfabeto);
		
		StringBuffer sb = new StringBuffer(); // StringBuffer é Thread safe
		for(String letra: letras) {
			sb.append(letra);
		}
		alfabeto = sb.toString();
		
		System.out.println(alfabeto);
		
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		System.out.println(sb.reverse());
		
		StringBuilder sb_ = new StringBuilder(); // StringBuilder não é Thread Safe
		for(String letra: letras) {
			sb_.append(letra);
		}
		alfabeto = sb_.toString();
		
		System.out.println(alfabeto);
	}
	
}
