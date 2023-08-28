package com.igor.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public  class Aluno { // extends é a palavra chave para uso de herança.
	
	public Aluno() {
		super(); // Super faz referência a super classe, neste caso a classe pessoa.
	}
	
	private String curso;
	@Override
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		if (curso.equalsIgnoreCase(other.getCurso())) {
		return true;
		}
		return false;
		
	}
	private double[] notas;
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
	return 0;
	}
	public boolean  verificarAprovado() {
		return true;
	}
	public void metodoQualquer() {
		//super.setCPF("000000");
	//	this.setCPF("111111");
	}
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso; // this faz referência a própria classe.
	}
	public String obterEtiquetaEndereco() {
		//return endereco;
		String s = "Endereço do Aluno: Rua: Francisco Rodrigues ";
		//s += this.getEndereco();
		return s;
	}
	//@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
	}
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	/*public String toString() {
		String s = curso + "\n";
		for(double nota: notas) {
			s += nota + " ";	
		}
		return s + " ";
	}*/
	
	
}

