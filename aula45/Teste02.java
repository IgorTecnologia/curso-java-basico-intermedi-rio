package com.igor.cursojava.aula45;

public class Teste02 {

	public static void main(String[] args) {
		//DownCasting
		Object objt1 = ObterString();
		String s1 = (String) objt1;
		
		Object objt2 = "Minha String";
		String s2 = (String) objt2;
		
		Object objt3 = new Object();
	//	String s3 = (String) objt3;
		
		Object objt4 = obterInteiro();
		String s4 = (String) objt4;

	}
	public static String ObterString() {

		return "Minha String";
	}
	public static int obterInteiro() {
		return 1;
	}
}
