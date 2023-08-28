package com.igor.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno =  new Aluno ();
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Maria");
		aluno.setCurso("Computação");
		
		professor.setNome("Tomas");
		professor.setSalario(1000);
		aluno.setNotas(null);
		
		aluno.setCPF("111.111.111.11"); // herança da classe pessoa;
		professor.setTelefoneCelular("(19) 99999-9999"); // herança da classe pessoa;
		
		System.out.println("Nome aluno(a): " + aluno.getNome());
	}
}
