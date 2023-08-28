package com.igor.cursojava.aula45;

public class Professor extends Pessoa {

	
	private double salario;
	private String nomeCurso;
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double caulcularSalarioLiquido() {
		return 0;
	}
	public String obterEtiquetaEndereco() {
		//return endereco;
		String s = "Endereço do professor: ";
		s += super.getEndereco();
		return s;
	}
}
