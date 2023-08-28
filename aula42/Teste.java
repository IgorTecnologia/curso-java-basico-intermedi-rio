package com.igor.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa =  new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		// exemplo 02
		System.out.println(Constante.URL_BLOG);
		Constante.URL_BLOG = "Algo qualquer";
		System.out.println(Constante.URL_BLOG);
		System.out.println(Constante.CURSO_COMPLETO);
		//Constante.CURSO_COMPLETO = "Algo qualquer";  não é permitido alterar o valor porque é uma constante
	
		final int TOTAL = 1;
		// total = total = 1;
		System.out.println(TOTAL);
	}

}
