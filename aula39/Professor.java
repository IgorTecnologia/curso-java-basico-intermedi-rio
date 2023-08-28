package com.igor.cursojava.aula39;

public class Professor extends Pessoa {

	
	private double salario;
	private String nomeCurso;
	public void verificarAcesso() {
		super.nomeVisibilidade = "Maria";
		this.nomeVisibilidade = "Igor";
		
		this.setNomeVisibilidade("Mário");
	}
	
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
}
