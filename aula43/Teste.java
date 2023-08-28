package com.igor.cursojava.aula43;

public class Teste {
	
	public static void main (String [] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da computação");
		double [] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		
		System.out.println(aluno);
		System.out.println(aluno.obterEtiquetaEndereco());
		
		String s1 = "aaaaa";
		String s2 = "aaaaA";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Ciência da computaçãO");
		double [] notas2 = {9, 8, 7, 6};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
	}
}
