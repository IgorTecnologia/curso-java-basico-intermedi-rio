package com.igor.cursojava.aula45;

public class Teste {
	
	public static void main (String[] args) {
	
	/*Aluno aluno = new Aluno();
	Pessoa pessoaAluno = aluno; // Upcasting
	
	Pessoa aluno2 = (Pessoa) new Aluno(); // Outro tipo de Upcasting.
	
	Pessoa aluno3 = new Pessoa();
	Aluno aluno4 = (Aluno) aluno3;*/
	
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//Operador instanceof é muito útil para fazer verificacão do tipo de classe.
		if (pessoa instanceof Pessoa) {
			System.out.println("É do tipo Pessoa");
		}
		if (aluno instanceof Aluno) {
			System.out.println("É do tipo Aluno");
		}
		if (professor instanceof Professor) {
			System.out.println("É do tipo Professor");
		}
		
	}
}