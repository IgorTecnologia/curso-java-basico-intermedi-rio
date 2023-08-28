package com.igor.cursojava.aula37;
					   // Está classe é uma super classe.
public class Pessoa { // Como a classe pessoa está sendo usanda como entensão para outras classes..
					 // ela se torna classe mãe e classe pai.. neste caso da classe aluno e professor.
	
	private String nome;
	private String endereco;
	private String telefone;
	private String CPF;
	
	private String telefoneCelular;
	
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
}
