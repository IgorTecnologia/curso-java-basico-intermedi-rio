package com.igor.cursojava.aula75_84;

import java.util.StringTokenizer;

public class Aula84StringTokenizer {

	public static void main(String[] args) {
		
		String doArquivo = "1;Antônio;30.";
		
		StringTokenizer st = new StringTokenizer(doArquivo, ";.");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); // nextToken para extrair a informação do StringTokenizer
			
		}
		
	}

}
